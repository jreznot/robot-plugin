package amailp.parser

import com.intellij.lang.{ASTNode, PsiBuilder, PsiParser}
import com.intellij.psi.tree.IElementType
import amailp.elements.RobotTokenTypes._
import RobotASTTypes._

object RobotParser extends PsiParser {
  def parse(root: IElementType, builder: PsiBuilder): ASTNode = {
    import builder._
    def currentType = getTokenType

    def parseTable() {
      val tableMarker = mark
      val tableType = parseHeaderRow() match {
        case SettingsHeader => parseSettings(); Some(SettingsTable)
        case TestCasesHeader => parseTestCases(); Some(TestCasesTable)
        case KeywordsHeader => parseKeywords(); Some(KeywordsTable)
        case VariablesHeader => parseVariables(); Some(VariablesTable)
        case _ => None
      }
      tableType match {
        case Some(typ) => tableMarker done typ
        case None => tableMarker drop()
      }
    }

    def parseSettings() {
      while(hasMoreTokens && !isHeader(currentType))
        parseBodyRow()
    }

    def parseTestCases() {
      while(hasMoreTokens && !isHeader(currentType))
        parseTestCase()
    }

    def parseTestCase() {
      if(currentIsSpace()) error("Title expected, not space")
      val keywordMark = mark
      parseTitle(TestCaseTitle)
      //        parseKeywordSettings()
      while(currentIsSpace())
        parseBodyRow()
      keywordMark done TestCase
    }

    def parseKeywords() {
      while(hasMoreTokens && !isHeader(currentType)) {
        parseKeyword()
      }
    }

    def parseKeyword() {
      if(currentIsSpace()) error("Title expected, not space")
      val keywordMark = mark
      parseTitle(KeywordTitle)
      //        parseKeywordSettings()
      while(currentIsSpace())
        parseBodyRow()
      keywordMark done Keyword
    }

    def parseTitle(titleType: IElementType) {
      val titleMark = mark
      parsePhrase()
      titleMark done titleType
      skipSpace()
      consumeLineTerminators()
    }

    def parseVariables() {
      while(hasMoreTokens && !isHeader(currentType))
        parseBodyRow()
    }

    def parseHeaderRow(): IElementType = {
      val headerMark = mark
      val headerType = currentType
      if(!isHeader(headerType)) error("Header token expected")
      advanceLexer()
      headerMark done headerType

      skipSpace()
      consumeLineTerminators()
      headerType
    }
    
    def parseBodyRow() {
      val rowMarker = mark
      while(!isRowTerminator(currentType))
      {
        skipSpace()
        parseCell()
      }
      consumeLineTerminators()
      rowMarker done TableRow
    }

    def parseCell() {
      val cellMarker = mark
      parsePhrase()
      cellMarker done NonEmptyCell
    }

    def parsePhrase() {
      while(!isRowTerminator(currentType) && currentType != Separator)
        advanceLexer()
    }

    def hasMoreTokens = !eof

    def skipSpace() = if (currentIsSpace()) advanceLexer()

    def currentIsSpace() = currentType == Separator || currentType == Space

    def consumeLineTerminators() = {
      if (!isRowTerminator(currentType)) error("Line terminator expected")
      while(currentType == LineTerminator)
        advanceLexer()
    }
    
    def isRowTerminator(token: IElementType) = token == LineTerminator || eof
    
    def isHeader(token: IElementType) = HeaderTokens contains token

    val rootMarker = mark
    while (hasMoreTokens) {
      parseTable()
    }
    rootMarker.done(root)
    builder.getTreeBuilt
  }
}