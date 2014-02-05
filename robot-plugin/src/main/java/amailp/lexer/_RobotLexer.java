/* The following code was generated by JFlex 1.4.3 on 05/02/14 00:38 */

package amailp.lexer;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import amailp.elements.RobotTokenTypes;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 05/02/14 00:38 from the specification file
 * <tt>/Users/angelini/tesi/src/RobotPlugin/robot-plugin/src/main/resources/amailp/lexer/Robot.flex</tt>
 */
public class _RobotLexer implements FlexLexer {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int YYINITIAL = 0;
  public static final int LINE = 2;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  1, 1
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\4\1\1\1\40\1\41\1\2\22\0\1\3\2\0\1\5"+
    "\1\34\5\0\1\6\25\0\1\37\2\0\1\17\7\0\1\21\7\0"+
    "\1\7\1\16\1\0\1\27\4\0\1\32\1\0\1\33\3\0\1\20"+
    "\1\30\1\0\1\26\1\10\1\0\1\14\1\0\1\12\2\0\1\31"+
    "\1\0\1\13\1\24\2\0\1\25\1\15\1\11\2\0\1\23\1\0"+
    "\1\22\1\0\1\35\1\0\1\36\7\0\1\40\u1fa2\0\2\40\udfd6\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\4\0\1\1\1\2\2\3\1\4\1\5\1\6\4\2"+
    "\2\0\2\7\1\10\1\7\4\2\1\11\1\2\1\12"+
    "\2\2\1\0\1\13\1\14\54\0\1\15\1\0\1\16"+
    "\2\0\1\17\1\20";

  private static int [] zzUnpackAction() {
    int [] result = new int[84];
    int offset = 0;
    offset = zzUnpackAction(ZZ_ACTION_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAction(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /** 
   * Translates a state to a row index in the transition table
   */
  private static final int [] ZZ_ROWMAP = zzUnpackRowMap();

  private static final String ZZ_ROWMAP_PACKED_0 =
    "\0\0\0\42\0\104\0\146\0\210\0\252\0\210\0\314"+
    "\0\356\0\356\0\u0110\0\u0132\0\u0154\0\u0176\0\u0198\0\104"+
    "\0\146\0\210\0\u01ba\0\u01dc\0\356\0\u01fe\0\u0220\0\u0242"+
    "\0\u0264\0\210\0\u0286\0\u0220\0\u02a8\0\u02ca\0\u02ec\0\u02a8"+
    "\0\u02ca\0\u030e\0\u0330\0\u0352\0\u0374\0\u0396\0\u03b8\0\u03da"+
    "\0\u03fc\0\u041e\0\u0440\0\u0462\0\u0484\0\u04a6\0\u04c8\0\u04ea"+
    "\0\u050c\0\u052e\0\u0550\0\u0572\0\u0594\0\u05b6\0\u05d8\0\u05fa"+
    "\0\u061c\0\u063e\0\u0660\0\u0682\0\u06a4\0\u06c6\0\u06e8\0\u070a"+
    "\0\u072c\0\u074e\0\u0770\0\u0792\0\u07b4\0\u07d6\0\u07f8\0\u081a"+
    "\0\u083c\0\u085e\0\u0880\0\u08a2\0\u08c4\0\210\0\u08e6\0\210"+
    "\0\u0908\0\u092a\0\210\0\210";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[84];
    int offset = 0;
    offset = zzUnpackRowMap(ZZ_ROWMAP_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackRowMap(String packed, int offset, int [] result) {
    int i = 0;  /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int high = packed.charAt(i++) << 16;
      result[j++] = high | packed.charAt(i++);
    }
    return j;
  }

  /** 
   * The transition table of the DFA
   */
  private static final int [] ZZ_TRANS = zzUnpackTrans();

  private static final String ZZ_TRANS_PACKED_0 =
    "\42\5\1\6\1\7\1\10\1\11\1\12\1\13\1\14"+
    "\23\6\1\15\1\6\1\16\2\6\1\17\1\6\1\12"+
    "\3\0\2\20\34\0\1\20\1\4\1\0\3\4\1\21"+
    "\34\4\42\0\1\6\4\0\34\6\2\0\1\7\41\0"+
    "\1\22\1\23\2\12\1\24\32\0\1\22\1\25\1\13"+
    "\1\0\40\13\1\6\4\0\1\6\1\26\32\6\1\0"+
    "\1\27\4\0\34\27\1\0\1\6\4\0\30\6\1\30"+
    "\3\6\1\0\1\6\4\0\30\6\1\31\3\6\2\0"+
    "\1\32\40\0\1\24\1\0\40\24\1\6\4\0\1\6"+
    "\1\33\32\6\1\0\1\27\4\0\26\27\1\34\5\27"+
    "\1\0\1\35\4\0\34\35\1\0\1\36\4\0\34\36"+
    "\1\0\1\6\2\0\1\37\1\0\34\6\1\0\1\35"+
    "\4\0\31\35\1\40\2\35\1\0\1\36\4\0\31\36"+
    "\1\41\2\36\10\0\1\42\6\0\1\43\2\0\1\44"+
    "\5\0\1\45\22\0\1\46\41\0\1\47\41\0\1\50"+
    "\51\0\1\51\32\0\1\52\45\0\1\53\46\0\1\54"+
    "\44\0\1\55\25\0\1\56\41\0\1\57\53\0\1\60"+
    "\30\0\1\61\41\0\1\62\32\0\1\63\62\0\1\64"+
    "\35\0\1\65\34\0\1\66\45\0\1\67\47\0\1\70"+
    "\44\0\1\71\25\0\1\72\45\0\1\73\47\0\1\74"+
    "\44\0\1\75\13\0\1\76\11\0\1\77\41\0\1\100"+
    "\27\0\1\101\11\0\1\102\34\0\1\103\37\0\1\104"+
    "\36\0\1\76\46\0\1\105\37\0\1\106\36\0\1\101"+
    "\41\0\1\107\11\0\1\110\32\0\1\111\36\0\1\112"+
    "\11\0\1\113\32\0\1\114\41\0\1\115\36\0\1\107"+
    "\44\0\1\116\41\0\1\117\36\0\1\112\44\0\1\120"+
    "\41\0\1\121\41\0\1\122\41\0\1\123\41\0\1\124"+
    "\33\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[2380];
    int offset = 0;
    offset = zzUnpackTrans(ZZ_TRANS_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackTrans(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      value--;
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }


  /* error codes */
  private static final int ZZ_UNKNOWN_ERROR = 0;
  private static final int ZZ_NO_MATCH = 1;
  private static final int ZZ_PUSHBACK_2BIG = 2;
  private static final char[] EMPTY_BUFFER = new char[0];
  private static final int YYEOF = -1;
  private static java.io.Reader zzReader = null; // Fake

  /* error messages for the codes above */
  private static final String ZZ_ERROR_MSG[] = {
    "Unkown internal scanner error",
    "Error: could not match input",
    "Error: pushback value was too large"
  };

  /**
   * ZZ_ATTRIBUTE[aState] contains the attributes of state <code>aState</code>
   */
  private static final int [] ZZ_ATTRIBUTE = zzUnpackAttribute();

  private static final String ZZ_ATTRIBUTE_PACKED_0 =
    "\4\0\1\11\1\1\1\11\12\1\1\11\7\1\1\11"+
    "\4\1\1\0\2\1\54\0\1\11\1\0\1\11\2\0"+
    "\2\11";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[84];
    int offset = 0;
    offset = zzUnpackAttribute(ZZ_ATTRIBUTE_PACKED_0, offset, result);
    return result;
  }

  private static int zzUnpackAttribute(String packed, int offset, int [] result) {
    int i = 0;       /* index in packed string  */
    int j = offset;  /* index in unpacked array */
    int l = packed.length();
    while (i < l) {
      int count = packed.charAt(i++);
      int value = packed.charAt(i++);
      do result[j++] = value; while (--count > 0);
    }
    return j;
  }

  /** the current state of the DFA */
  private int zzState;

  /** the current lexical state */
  private int zzLexicalState = YYINITIAL;

  /** this buffer contains the current text to be matched and is
      the source of the yytext() string */
  private CharSequence zzBuffer = "";

  /** this buffer may contains the current text array to be matched when it is cheap to acquire it */
  private char[] zzBufferArray;

  /** the textposition at the last accepting state */
  private int zzMarkedPos;

  /** the textposition at the last state to be included in yytext */
  private int zzPushbackPos;

  /** the current text position in the buffer */
  private int zzCurrentPos;

  /** startRead marks the beginning of the yytext() string in the buffer */
  private int zzStartRead;

  /** endRead marks the last character in the buffer, that has been read
      from input */
  private int zzEndRead;

  /**
   * zzAtBOL == true <=> the scanner is currently at the beginning of a line
   */
  private boolean zzAtBOL = true;

  /** zzAtEOF == true <=> the scanner is at the EOF */
  private boolean zzAtEOF;

  /** For the backwards DFA of general lookahead statements */
  private boolean [] zzFin = new boolean [ZZ_BUFFERSIZE+1];

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  public _RobotLexer(java.io.Reader in) {
    this.zzReader = in;
  }

  /**
   * Creates a new scanner.
   * There is also java.io.Reader version of this constructor.
   *
   * @param   in  the java.io.Inputstream to read input from.
   */
  public _RobotLexer(java.io.InputStream in) {
    this(new java.io.InputStreamReader(in));
  }

  /** 
   * Unpacks the compressed character translation table.
   *
   * @param packed   the packed character translation table
   * @return         the unpacked character translation table
   */
  private static char [] zzUnpackCMap(String packed) {
    char [] map = new char[0x10000];
    int i = 0;  /* index in packed string  */
    int j = 0;  /* index in unpacked array */
    while (i < 120) {
      int  count = packed.charAt(i++);
      char value = packed.charAt(i++);
      do map[j++] = value; while (--count > 0);
    }
    return map;
  }

  public final int getTokenStart(){
    return zzStartRead;
  }

  public final int getTokenEnd(){
    return getTokenStart() + yylength();
  }

  public void reset(CharSequence buffer, int start, int end,int initialState){
    zzBuffer = buffer;
    zzBufferArray = com.intellij.util.text.CharArrayUtil.fromSequenceWithoutCopying(buffer);
    zzCurrentPos = zzMarkedPos = zzStartRead = start;
    zzPushbackPos = 0;
    zzAtEOF  = false;
    zzAtBOL = true;
    zzEndRead = end;
    yybegin(initialState);
  }

  /**
   * Refills the input buffer.
   *
   * @return      <code>false</code>, iff there was new input.
   *
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  private boolean zzRefill() throws java.io.IOException {
    return true;
  }


  /**
   * Returns the current lexical state.
   */
  public final int yystate() {
    return zzLexicalState;
  }


  /**
   * Enters a new lexical state
   *
   * @param newState the new lexical state
   */
  public final void yybegin(int newState) {
    zzLexicalState = newState;
  }


  /**
   * Returns the text matched by the current regular expression.
   */
  public final CharSequence yytext() {
    return zzBuffer.subSequence(zzStartRead, zzMarkedPos);
  }


  /**
   * Returns the character at position <tt>pos</tt> from the
   * matched text.
   *
   * It is equivalent to yytext().charAt(pos), but faster
   *
   * @param pos the position of the character to fetch.
   *            A value from 0 to yylength()-1.
   *
   * @return the character at position pos
   */
  public final char yycharat(int pos) {
    return zzBufferArray != null ? zzBufferArray[zzStartRead+pos]:zzBuffer.charAt(zzStartRead+pos);
  }


  /**
   * Returns the length of the matched text region.
   */
  public final int yylength() {
    return zzMarkedPos-zzStartRead;
  }


  /**
   * Reports an error that occured while scanning.
   *
   * In a wellformed scanner (no or only correct usage of
   * yypushback(int) and a match-all fallback rule) this method
   * will only be called with things that "Can't Possibly Happen".
   * If this method is called, something is seriously wrong
   * (e.g. a JFlex bug producing a faulty scanner etc.).
   *
   * Usual syntax/scanner level error handling should be done
   * in error fallback rules.
   *
   * @param   errorCode  the code of the errormessage to display
   */
  private void zzScanError(int errorCode) {
    String message;
    try {
      message = ZZ_ERROR_MSG[errorCode];
    }
    catch (ArrayIndexOutOfBoundsException e) {
      message = ZZ_ERROR_MSG[ZZ_UNKNOWN_ERROR];
    }

    throw new Error(message);
  }


  /**
   * Pushes the specified amount of characters back into the input stream.
   *
   * They will be read again by then next call of the scanning method
   *
   * @param number  the number of characters to be read again.
   *                This number must not be greater than yylength()!
   */
  public void yypushback(int number)  {
    if ( number > yylength() )
      zzScanError(ZZ_PUSHBACK_2BIG);

    zzMarkedPos -= number;
  }


  /**
   * Contains user EOF-code, which will be executed exactly once,
   * when the end of file is reached
   */
  private void zzDoEOF() {
    if (!zzEOFDone) {
      zzEOFDone = true;
    return;

    }
  }


  /**
   * Resumes scanning until the next regular expression is matched,
   * the end of input is encountered or an I/O-Error occurs.
   *
   * @return      the next token
   * @exception   java.io.IOException  if any I/O-Error occurs
   */
  public IElementType advance() throws java.io.IOException {
    int zzInput;
    int zzAction;

    // cached fields:
    int zzCurrentPosL;
    int zzMarkedPosL;
    int zzEndReadL = zzEndRead;
    CharSequence zzBufferL = zzBuffer;
    char[] zzBufferArrayL = zzBufferArray;
    char [] zzCMapL = ZZ_CMAP;

    int [] zzTransL = ZZ_TRANS;
    int [] zzRowMapL = ZZ_ROWMAP;
    int [] zzAttrL = ZZ_ATTRIBUTE;

    while (true) {
      zzMarkedPosL = zzMarkedPos;

      zzAction = -1;

      zzCurrentPosL = zzCurrentPos = zzStartRead = zzMarkedPosL;

      zzState = ZZ_LEXSTATE[zzLexicalState];


      zzForAction: {
        while (true) {

          if (zzCurrentPosL < zzEndReadL)
            zzInput = zzBufferL.charAt(zzCurrentPosL++);
          else if (zzAtEOF) {
            zzInput = YYEOF;
            break zzForAction;
          }
          else {
            // store back cached positions
            zzCurrentPos  = zzCurrentPosL;
            zzMarkedPos   = zzMarkedPosL;
            boolean eof = zzRefill();
            // get translated positions and possibly new buffer
            zzCurrentPosL  = zzCurrentPos;
            zzMarkedPosL   = zzMarkedPos;
            zzBufferL      = zzBuffer;
            zzEndReadL     = zzEndRead;
            if (eof) {
              zzInput = YYEOF;
              break zzForAction;
            }
            else {
              zzInput = zzBufferL.charAt(zzCurrentPosL++);
            }
          }
          int zzNext = zzTransL[ zzRowMapL[zzState] + zzCMapL[zzInput] ];
          if (zzNext == -1) break zzForAction;
          zzState = zzNext;

          int zzAttributes = zzAttrL[zzState];
          if ( (zzAttributes & 1) == 1 ) {
            zzAction = zzState;
            zzMarkedPosL = zzCurrentPosL;
            if ( (zzAttributes & 8) == 8 ) break zzForAction;
          }

        }
      }

      // store back cached position
      zzMarkedPos = zzMarkedPosL;

      switch (zzAction < 0 ? zzAction : ZZ_ACTION[zzAction]) {
        case 14: 
          { return RobotTokenTypes.KeywordsHeader;
          }
        case 17: break;
        case 2: 
          { return RobotTokenTypes.Word;
          }
        case 18: break;
        case 9: 
          // lookahead expression with fixed lookahead length
          yypushback(2);
          { return RobotTokenTypes.IrrelevantSpaces;
          }
        case 19: break;
        case 7: 
          // lookahead expression with fixed lookahead length
          yypushback(1);
          { return RobotTokenTypes.IrrelevantSpaces;
          }
        case 20: break;
        case 8: 
          // general lookahead, find correct zzMarkedPos
          { int zzFState = 2;
            int zzFPos = zzStartRead;
            if (zzFin.length <= zzBufferL.length()) { zzFin = new boolean[zzBufferL.length()+1]; }
            boolean zzFinL[] = zzFin;
            while (zzFState != -1 && zzFPos < zzMarkedPos) {
              if ((zzAttrL[zzFState] & 1) == 1) { zzFinL[zzFPos] = true; } 
              zzInput = zzBufferL.charAt(zzFPos++);
              zzFState = zzTransL[ zzRowMapL[zzFState] + zzCMapL[zzInput] ];
            }
            if (zzFState != -1 && (zzAttrL[zzFState] & 1) == 1) { zzFinL[zzFPos] = true; } 

            zzFState = 3;
            zzFPos = zzMarkedPos;
            while (!zzFinL[zzFPos] || (zzAttrL[zzFState] & 1) != 1) {
              zzInput = zzBufferL.charAt(--zzFPos);
              zzFState = zzTransL[ zzRowMapL[zzFState] + zzCMapL[zzInput] ];
            };
            zzMarkedPos = zzFPos;
          }
          { return RobotTokenTypes.IrrelevantSpaces;
          }
        case 21: break;
        case 12: 
          { return RobotTokenTypes.ListVariable;
          }
        case 22: break;
        case 10: 
          { return RobotTokenTypes.TestCaseSetting;
          }
        case 23: break;
        case 4: 
          { return RobotTokenTypes.Space;
          }
        case 24: break;
        case 3: 
          { yybegin(YYINITIAL); return RobotTokenTypes.LineTerminator;
          }
        case 25: break;
        case 16: 
          { return RobotTokenTypes.TestCasesHeader;
          }
        case 26: break;
        case 13: 
          { return RobotTokenTypes.SettingsHeader;
          }
        case 27: break;
        case 6: 
          { return RobotTokenTypes.Comment;
          }
        case 28: break;
        case 11: 
          { return RobotTokenTypes.Variable;
          }
        case 29: break;
        case 15: 
          { return RobotTokenTypes.VariablesHeader;
          }
        case 30: break;
        case 1: 
          { yypushback(yylength()); yybegin(LINE);
          }
        case 31: break;
        case 5: 
          { return RobotTokenTypes.Separator;
          }
        case 32: break;
        default:
          if (zzInput == YYEOF && zzStartRead == zzCurrentPos) {
            zzAtEOF = true;
            zzDoEOF();
            return null;
          }
          else {
            zzScanError(ZZ_NO_MATCH);
          }
      }
    }
  }


}
