/* The following code was generated by JFlex 1.4.3 on 6/16/15 11:55 PM */

package com.intellij.plugin.buck.lang;

import com.intellij.lexer.FlexLexer;
import com.intellij.psi.tree.IElementType;
import com.intellij.psi.TokenType;
import com.intellij.plugin.buck.lang.psi.BuckTypes;
import java.util.LinkedList;
import java.util.HashSet;
import java.util.Set;
import java.lang.String;


/**
 * This class is a scanner generated by 
 * <a href="http://www.jflex.de/">JFlex</a> 1.4.3
 * on 6/16/15 11:55 PM from the specification file
 * <tt>/Users/cjlm/IdeaProjects/Buck/src/com/intellij/plugin/buck/lang/Buck.flex</tt>
 */
public class _BuckLexer implements FlexLexer, BuckTypes {
  /** initial size of the lookahead buffer */
  private static final int ZZ_BUFFERSIZE = 16384;

  /** lexical states */
  public static final int WAITING_VALUE = 2;
  public static final int SINGLE_QUOTE_STRING = 6;
  public static final int YYINITIAL = 0;
  public static final int DOUBLE_QUOTE_STRING = 4;

  /**
   * ZZ_LEXSTATE[l] is the state in the DFA for the lexical state l
   * ZZ_LEXSTATE[l+1] is the state in the DFA for the lexical state l
   *                  at the beginning of a line
   * l is of the form l = 2*k, k a non negative integer
   */
  private static final int ZZ_LEXSTATE[] = { 
     0,  0,  0,  0,  0,  0,  0, 0
  };

  /** 
   * Translates characters to character classes
   */
  private static final String ZZ_CMAP_PACKED = 
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\0\1\53"+
    "\1\5\3\0\1\52\1\54\1\54\2\0\1\55\3\0\7\40\1\37"+
    "\2\40\1\0\1\56\1\0\1\6\3\0\1\47\3\41\1\46\1\43"+
    "\5\41\1\50\5\41\1\44\1\51\1\42\1\45\5\41\1\54\1\4"+
    "\1\54\1\0\1\20\1\0\1\23\1\25\1\27\1\24\1\10\1\21"+
    "\1\7\1\36\1\22\1\34\1\32\1\14\1\15\1\11\1\16\1\31"+
    "\1\41\1\12\1\30\1\17\1\13\1\35\1\41\1\33\1\26\1\41"+
    "\1\54\1\0\1\54\54\0\1\41\12\0\1\41\4\0\1\41\5\0"+
    "\27\41\1\0\37\41\1\0\u01ca\41\4\0\14\41\16\0\5\41\7\0"+
    "\1\41\1\0\1\41\201\0\5\41\1\0\2\41\2\0\4\41\10\0"+
    "\1\41\1\0\3\41\1\0\1\41\1\0\24\41\1\0\123\41\1\0"+
    "\213\41\10\0\236\41\11\0\46\41\2\0\1\41\7\0\47\41\110\0"+
    "\33\41\5\0\3\41\55\0\53\41\43\0\2\41\1\0\143\41\1\0"+
    "\1\41\17\0\2\41\7\0\2\41\12\0\3\41\2\0\1\41\20\0"+
    "\1\41\1\0\36\41\35\0\131\41\13\0\1\41\30\0\41\41\11\0"+
    "\2\41\4\0\1\41\5\0\26\41\4\0\1\41\11\0\1\41\3\0"+
    "\1\41\27\0\31\41\107\0\1\41\1\0\13\41\127\0\66\41\3\0"+
    "\1\41\22\0\1\41\7\0\12\41\17\0\7\41\1\0\7\41\5\0"+
    "\10\41\2\0\2\41\2\0\26\41\1\0\7\41\1\0\1\41\3\0"+
    "\4\41\3\0\1\41\20\0\1\41\15\0\2\41\1\0\3\41\16\0"+
    "\2\41\23\0\6\41\4\0\2\41\2\0\26\41\1\0\7\41\1\0"+
    "\2\41\1\0\2\41\1\0\2\41\37\0\4\41\1\0\1\41\23\0"+
    "\3\41\20\0\11\41\1\0\3\41\1\0\26\41\1\0\7\41\1\0"+
    "\2\41\1\0\5\41\3\0\1\41\22\0\1\41\17\0\2\41\43\0"+
    "\10\41\2\0\2\41\2\0\26\41\1\0\7\41\1\0\2\41\1\0"+
    "\5\41\3\0\1\41\36\0\2\41\1\0\3\41\17\0\1\41\21\0"+
    "\1\41\1\0\6\41\3\0\3\41\1\0\4\41\3\0\2\41\1\0"+
    "\1\41\1\0\2\41\3\0\2\41\3\0\3\41\3\0\14\41\26\0"+
    "\1\41\64\0\10\41\1\0\3\41\1\0\27\41\1\0\12\41\1\0"+
    "\5\41\3\0\1\41\32\0\2\41\6\0\2\41\43\0\10\41\1\0"+
    "\3\41\1\0\27\41\1\0\12\41\1\0\5\41\3\0\1\41\40\0"+
    "\1\41\1\0\2\41\17\0\2\41\22\0\10\41\1\0\3\41\1\0"+
    "\51\41\2\0\1\41\20\0\1\41\21\0\2\41\30\0\6\41\5\0"+
    "\22\41\3\0\30\41\1\0\11\41\1\0\1\41\2\0\7\41\72\0"+
    "\60\41\1\0\2\41\14\0\7\41\72\0\2\41\1\0\1\41\2\0"+
    "\2\41\1\0\1\41\2\0\1\41\6\0\4\41\1\0\7\41\1\0"+
    "\3\41\1\0\1\41\1\0\1\41\2\0\2\41\1\0\4\41\1\0"+
    "\2\41\11\0\1\41\2\0\5\41\1\0\1\41\25\0\4\41\40\0"+
    "\1\41\77\0\10\41\1\0\44\41\33\0\5\41\163\0\53\41\24\0"+
    "\1\41\20\0\6\41\4\0\4\41\3\0\1\41\3\0\2\41\7\0"+
    "\3\41\4\0\15\41\14\0\1\41\21\0\46\41\1\0\1\41\5\0"+
    "\1\41\2\0\53\41\1\0\u014d\41\1\0\4\41\2\0\7\41\1\0"+
    "\1\41\1\0\4\41\2\0\51\41\1\0\4\41\2\0\41\41\1\0"+
    "\4\41\2\0\7\41\1\0\1\41\1\0\4\41\2\0\17\41\1\0"+
    "\71\41\1\0\4\41\2\0\103\41\45\0\20\41\20\0\125\41\14\0"+
    "\u026c\41\2\0\21\41\1\0\32\41\5\0\113\41\25\0\15\41\1\0"+
    "\4\41\16\0\22\41\16\0\22\41\16\0\15\41\1\0\3\41\17\0"+
    "\64\41\43\0\1\41\4\0\1\41\103\0\130\41\10\0\51\41\1\0"+
    "\1\41\5\0\106\41\12\0\35\41\63\0\36\41\2\0\5\41\13\0"+
    "\54\41\25\0\7\41\70\0\27\41\11\0\65\41\122\0\1\41\135\0"+
    "\57\41\21\0\7\41\67\0\36\41\15\0\2\41\12\0\54\41\32\0"+
    "\44\41\51\0\3\41\12\0\44\41\153\0\4\41\1\0\4\41\3\0"+
    "\2\41\11\0\300\41\100\0\u0116\41\2\0\6\41\2\0\46\41\2\0"+
    "\6\41\2\0\10\41\1\0\1\41\1\0\1\41\1\0\1\41\1\0"+
    "\37\41\2\0\65\41\1\0\7\41\1\0\1\41\3\0\3\41\1\0"+
    "\7\41\3\0\4\41\2\0\6\41\4\0\15\41\5\0\3\41\1\0"+
    "\7\41\164\0\1\41\15\0\1\41\20\0\15\41\145\0\1\41\4\0"+
    "\1\41\2\0\12\41\1\0\1\41\3\0\5\41\6\0\1\41\1\0"+
    "\1\41\1\0\1\41\1\0\4\41\1\0\13\41\2\0\4\41\5\0"+
    "\5\41\4\0\1\41\64\0\2\41\u0a7b\0\57\41\1\0\57\41\1\0"+
    "\205\41\6\0\4\41\3\0\2\41\14\0\46\41\1\0\1\41\5\0"+
    "\1\41\2\0\70\41\7\0\1\41\20\0\27\41\11\0\7\41\1\0"+
    "\7\41\1\0\7\41\1\0\7\41\1\0\7\41\1\0\7\41\1\0"+
    "\7\41\1\0\7\41\120\0\1\41\u01d5\0\2\41\52\0\5\41\5\0"+
    "\2\41\4\0\126\41\6\0\3\41\1\0\132\41\1\0\4\41\5\0"+
    "\51\41\3\0\136\41\21\0\33\41\65\0\20\41\u0200\0\u19b6\41\112\0"+
    "\u51cd\41\63\0\u048d\41\103\0\56\41\2\0\u010d\41\3\0\20\41\12\0"+
    "\2\41\24\0\57\41\20\0\31\41\10\0\106\41\61\0\11\41\2\0"+
    "\147\41\2\0\4\41\1\0\4\41\14\0\13\41\115\0\12\41\1\0"+
    "\3\41\1\0\4\41\1\0\27\41\35\0\64\41\16\0\62\41\76\0"+
    "\6\41\3\0\1\41\16\0\34\41\12\0\27\41\31\0\35\41\7\0"+
    "\57\41\34\0\1\41\60\0\51\41\27\0\3\41\1\0\10\41\24\0"+
    "\27\41\3\0\1\41\5\0\60\41\1\0\1\41\3\0\2\41\2\0"+
    "\5\41\2\0\1\41\1\0\1\41\30\0\3\41\2\0\13\41\7\0"+
    "\3\41\14\0\6\41\2\0\6\41\2\0\6\41\11\0\7\41\1\0"+
    "\7\41\221\0\43\41\35\0\u2ba4\41\14\0\27\41\4\0\61\41\u2104\0"+
    "\u016e\41\2\0\152\41\46\0\7\41\14\0\5\41\5\0\1\41\1\0"+
    "\12\41\1\0\15\41\1\0\5\41\1\0\1\41\1\0\2\41\1\0"+
    "\2\41\1\0\154\41\41\0\u016b\41\22\0\100\41\2\0\66\41\50\0"+
    "\14\41\164\0\5\41\1\0\207\41\44\0\32\41\6\0\32\41\13\0"+
    "\131\41\3\0\6\41\2\0\6\41\2\0\6\41\2\0\3\41\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\24\1\2\6"+
    "\1\7\1\10\1\11\36\1\5\6\6\1\1\12\32\1"+
    "\2\0\2\1\1\13\6\1\1\14\21\1\2\0\31\1"+
    "\2\0\201\1";

  private static int [] zzUnpackAction() {
    int [] result = new int[287];
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
    "\0\0\0\57\0\57\0\136\0\215\0\274\0\57\0\353"+
    "\0\u011a\0\u0149\0\u0178\0\u01a7\0\u01d6\0\u0205\0\u0234\0\u0263"+
    "\0\u0292\0\u02c1\0\u02f0\0\u031f\0\u034e\0\u037d\0\u03ac\0\u03db"+
    "\0\u040a\0\u0439\0\u0468\0\u0497\0\u04c6\0\57\0\57\0\57"+
    "\0\u04f5\0\u0524\0\u0553\0\u0582\0\u05b1\0\u05e0\0\u060f\0\u063e"+
    "\0\u066d\0\u069c\0\u06cb\0\u06fa\0\u0729\0\u0758\0\u0787\0\u07b6"+
    "\0\u07e5\0\u0814\0\u0843\0\u0872\0\u08a1\0\u08d0\0\u08ff\0\u092e"+
    "\0\u095d\0\u098c\0\u09bb\0\u09ea\0\u0a19\0\u0a48\0\u0a77\0\57"+
    "\0\u0aa6\0\u0ad5\0\u0b04\0\u0b33\0\u0b62\0\u0b91\0\u0bc0\0\u0bef"+
    "\0\u0c1e\0\u01a7\0\u0c4d\0\u0c7c\0\u0cab\0\u0cda\0\u0d09\0\u0d38"+
    "\0\u0d67\0\u0d96\0\u0dc5\0\u0df4\0\u0e23\0\u0e52\0\u0e81\0\u0eb0"+
    "\0\u0edf\0\u0f0e\0\u0f3d\0\u0f6c\0\u0f9b\0\u0fca\0\u0ff9\0\u1028"+
    "\0\u1057\0\u1086\0\u10b5\0\u10e4\0\u1113\0\u1142\0\u1171\0\u11a0"+
    "\0\u01a7\0\u11cf\0\u11fe\0\u122d\0\u125c\0\u128b\0\u12ba\0\u01a7"+
    "\0\u12e9\0\u1318\0\u1347\0\u1376\0\u13a5\0\u13d4\0\u1403\0\u1432"+
    "\0\u1461\0\u1490\0\u14bf\0\u14ee\0\u151d\0\u154c\0\u157b\0\u15aa"+
    "\0\u15d9\0\u1608\0\u1637\0\u1666\0\u1695\0\u16c4\0\u16f3\0\u1722"+
    "\0\u1751\0\u1780\0\u17af\0\u17de\0\u180d\0\u183c\0\u186b\0\u189a"+
    "\0\u18c9\0\u18f8\0\u1927\0\u1956\0\u1985\0\u19b4\0\u19e3\0\u1a12"+
    "\0\u1a41\0\u1a70\0\u1a9f\0\u1ace\0\u1afd\0\u1b2c\0\u1b5b\0\u1b8a"+
    "\0\u1bb9\0\u1be8\0\u1c17\0\u1c46\0\u1c75\0\u1ca4\0\u1cd3\0\u1d02"+
    "\0\u1d31\0\u1d60\0\u1d8f\0\u1dbe\0\u1ded\0\u1e1c\0\u1e4b\0\u1e7a"+
    "\0\u1ea9\0\u1ed8\0\u1f07\0\u1f36\0\u1f65\0\u1f94\0\u1fc3\0\u1ff2"+
    "\0\u2021\0\u2050\0\u207f\0\u20ae\0\u20dd\0\u210c\0\u213b\0\u216a"+
    "\0\u2199\0\u21c8\0\u21f7\0\u2226\0\u2255\0\u2284\0\u22b3\0\u22e2"+
    "\0\u2311\0\u2340\0\u236f\0\u239e\0\u23cd\0\u23fc\0\u242b\0\u245a"+
    "\0\u2489\0\u24b8\0\u24e7\0\u2516\0\u2545\0\u2574\0\u25a3\0\u25d2"+
    "\0\u2601\0\u2630\0\u265f\0\u268e\0\u26bd\0\u26ec\0\u271b\0\u274a"+
    "\0\u2779\0\u27a8\0\u27d7\0\u2806\0\u2835\0\u2864\0\u2893\0\u28c2"+
    "\0\u28f1\0\u2920\0\u294f\0\u297e\0\u29ad\0\u29dc\0\u2a0b\0\u2a3a"+
    "\0\u2a69\0\u2a98\0\u2ac7\0\u2af6\0\u2b25\0\u2b54\0\u2b83\0\u2bb2"+
    "\0\u2be1\0\u2c10\0\u2c3f\0\u2c6e\0\u2c9d\0\u2ccc\0\u2cfb\0\u2d2a"+
    "\0\u2d59\0\u2d88\0\u2db7\0\u2de6\0\u2e15\0\u2e44\0\u2e73\0\u2ea2"+
    "\0\u2ed1\0\u2f00\0\u2f2f\0\u2f5e\0\u2f8d\0\u2fbc\0\u2feb\0\u301a"+
    "\0\u3049\0\u3078\0\u30a7\0\u30d6\0\u3105\0\u3134\0\u3163\0\u3192"+
    "\0\u31c1\0\u31f0\0\u321f\0\u324e\0\u327d\0\u32ac\0\u32db";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[287];
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
    "\1\2\1\3\1\4\1\5\1\2\1\6\1\7\1\10"+
    "\1\11\1\12\1\13\2\14\1\15\1\14\1\16\1\14"+
    "\1\17\1\20\1\21\1\22\1\23\1\14\1\24\1\25"+
    "\1\26\1\27\1\14\1\30\1\31\1\14\2\2\1\14"+
    "\1\32\1\33\6\14\1\34\1\35\1\36\1\37\1\40"+
    "\60\0\1\3\60\0\1\5\53\0\1\6\2\0\54\6"+
    "\7\0\1\14\1\41\3\14\1\42\35\14\14\0\24\14"+
    "\1\43\16\14\14\0\14\14\1\44\1\45\25\14\14\0"+
    "\1\14\1\46\5\14\1\47\33\14\14\0\43\14\14\0"+
    "\14\14\1\50\26\14\14\0\1\14\1\51\1\14\1\52"+
    "\37\14\14\0\14\14\1\53\26\14\14\0\2\14\1\54"+
    "\40\14\14\0\2\14\1\55\11\14\1\56\5\14\1\57"+
    "\20\14\14\0\1\14\1\60\7\14\1\61\31\14\14\0"+
    "\13\14\1\62\27\14\14\0\7\14\1\63\14\14\1\64"+
    "\16\14\14\0\3\14\1\65\3\14\1\66\33\14\14\0"+
    "\3\14\1\67\10\14\1\70\2\14\1\71\23\14\14\0"+
    "\1\14\1\72\41\14\14\0\14\14\1\73\26\14\14\0"+
    "\13\14\1\74\27\14\14\0\3\14\1\52\31\14\1\75"+
    "\5\14\14\0\14\14\1\53\23\14\1\76\2\14\5\0"+
    "\4\77\1\100\45\77\1\101\4\77\4\102\1\100\46\102"+
    "\1\103\3\102\7\0\2\14\1\104\40\14\14\0\7\14"+
    "\1\105\33\14\14\0\22\14\1\106\20\14\14\0\6\14"+
    "\1\107\34\14\14\0\23\14\1\110\17\14\14\0\6\14"+
    "\1\111\12\14\1\112\21\14\14\0\16\14\1\113\24\14"+
    "\14\0\2\14\1\114\40\14\14\0\21\14\1\115\21\14"+
    "\14\0\4\14\1\116\36\14\14\0\5\14\1\117\35\14"+
    "\14\0\20\14\1\120\22\14\14\0\15\14\1\121\25\14"+
    "\14\0\3\14\1\112\37\14\14\0\23\14\1\122\17\14"+
    "\14\0\22\14\1\123\20\14\14\0\5\14\1\124\2\14"+
    "\1\125\5\14\1\126\24\14\14\0\2\14\1\127\40\14"+
    "\14\0\2\14\1\130\40\14\14\0\24\14\1\131\16\14"+
    "\14\0\20\14\1\132\22\14\14\0\4\14\1\133\36\14"+
    "\14\0\1\14\1\134\5\14\1\135\33\14\14\0\20\14"+
    "\1\136\22\14\14\0\10\14\1\137\32\14\14\0\17\14"+
    "\1\140\23\14\14\0\26\14\1\141\14\14\14\0\21\14"+
    "\1\142\21\14\14\0\36\14\1\143\4\14\14\0\41\14"+
    "\1\144\1\14\5\0\4\77\1\100\45\77\1\100\4\77"+
    "\52\0\1\145\4\0\4\102\1\100\46\102\1\100\3\102"+
    "\53\0\1\146\12\0\3\14\1\147\5\14\1\150\31\14"+
    "\14\0\16\14\1\151\24\14\14\0\7\14\1\152\33\14"+
    "\14\0\1\14\1\112\41\14\14\0\11\14\1\153\31\14"+
    "\14\0\7\14\1\154\33\14\14\0\7\14\1\155\33\14"+
    "\14\0\13\14\1\156\27\14\14\0\10\14\1\157\32\14"+
    "\14\0\1\14\1\160\41\14\14\0\21\14\1\116\21\14"+
    "\14\0\5\14\1\161\35\14\14\0\3\14\1\162\37\14"+
    "\14\0\11\14\1\163\31\14\14\0\21\14\1\112\21\14"+
    "\14\0\13\14\1\164\27\14\14\0\1\14\1\165\41\14"+
    "\14\0\13\14\1\166\27\14\14\0\14\14\1\167\26\14"+
    "\14\0\10\14\1\170\32\14\14\0\11\14\1\61\31\14"+
    "\14\0\11\14\1\171\7\14\1\112\21\14\14\0\3\14"+
    "\1\172\37\14\14\0\16\14\1\173\24\14\14\0\25\14"+
    "\1\174\15\14\14\0\23\14\1\175\17\14\14\0\27\14"+
    "\1\176\13\14\14\0\21\14\1\177\21\14\14\0\14\14"+
    "\1\200\26\14\14\0\13\14\1\201\27\14\14\0\37\14"+
    "\1\160\3\14\14\0\42\14\1\143\5\0\52\145\1\202"+
    "\4\145\53\146\1\203\3\146\7\0\4\14\1\204\36\14"+
    "\14\0\14\14\1\205\26\14\14\0\3\14\1\206\37\14"+
    "\14\0\5\14\1\124\35\14\14\0\10\14\1\207\32\14"+
    "\14\0\5\14\1\210\35\14\14\0\12\14\1\211\30\14"+
    "\14\0\11\14\1\212\31\14\14\0\4\14\1\213\36\14"+
    "\14\0\7\14\1\214\33\14\14\0\1\215\42\14\14\0"+
    "\16\14\1\216\24\14\14\0\21\14\1\217\21\14\14\0"+
    "\2\14\1\220\40\14\14\0\3\14\1\221\37\14\14\0"+
    "\14\14\1\222\26\14\14\0\3\14\1\223\4\14\1\224"+
    "\32\14\14\0\20\14\1\225\22\14\14\0\4\14\1\226"+
    "\36\14\14\0\1\14\1\227\41\14\14\0\14\14\1\230"+
    "\26\14\14\0\7\14\1\231\33\14\14\0\10\14\1\232"+
    "\32\14\14\0\11\14\1\61\16\14\1\233\12\14\14\0"+
    "\16\14\1\234\24\14\5\0\52\145\1\235\4\145\53\146"+
    "\1\236\3\146\7\0\5\14\1\237\35\14\14\0\13\14"+
    "\1\240\27\14\14\0\10\14\1\241\32\14\14\0\1\14"+
    "\1\242\41\14\14\0\1\14\1\243\41\14\14\0\1\14"+
    "\1\244\41\14\14\0\5\14\1\245\35\14\14\0\15\14"+
    "\1\246\25\14\14\0\13\14\1\247\27\14\14\0\1\14"+
    "\1\250\41\14\14\0\3\14\1\220\37\14\14\0\10\14"+
    "\1\151\32\14\14\0\14\14\1\251\26\14\14\0\17\14"+
    "\1\252\23\14\14\0\20\14\1\253\22\14\14\0\7\14"+
    "\1\254\33\14\14\0\14\14\1\255\26\14\14\0\1\14"+
    "\1\256\41\14\14\0\13\14\1\257\27\14\14\0\20\14"+
    "\1\260\22\14\14\0\1\261\42\14\14\0\2\14\1\131"+
    "\40\14\14\0\7\14\1\262\33\14\14\0\11\14\1\263"+
    "\31\14\14\0\13\14\1\264\27\14\5\0\52\145\1\100"+
    "\4\145\53\146\1\100\3\146\7\0\1\14\1\151\41\14"+
    "\14\0\15\14\1\265\25\14\14\0\1\14\1\266\41\14"+
    "\14\0\11\14\1\267\31\14\14\0\20\14\1\270\22\14"+
    "\14\0\21\14\1\271\21\14\14\0\13\14\1\272\27\14"+
    "\14\0\1\14\1\273\41\14\14\0\15\14\1\274\25\14"+
    "\14\0\2\14\1\275\40\14\14\0\3\14\1\276\37\14"+
    "\14\0\11\14\1\277\31\14\14\0\10\14\1\123\32\14"+
    "\14\0\7\14\1\253\33\14\14\0\3\14\1\300\37\14"+
    "\14\0\11\14\1\301\31\14\14\0\5\14\1\302\35\14"+
    "\14\0\10\14\1\303\32\14\14\0\1\14\1\304\41\14"+
    "\14\0\3\14\1\107\37\14\14\0\21\14\1\305\21\14"+
    "\14\0\5\14\1\306\35\14\14\0\5\14\1\151\35\14"+
    "\14\0\15\14\1\307\25\14\14\0\12\14\1\310\30\14"+
    "\14\0\10\14\1\311\32\14\14\0\10\14\1\112\32\14"+
    "\14\0\16\14\1\312\24\14\14\0\11\14\1\313\31\14"+
    "\14\0\11\14\1\314\31\14\14\0\3\14\1\147\37\14"+
    "\14\0\17\14\1\151\23\14\14\0\25\14\1\315\15\14"+
    "\14\0\1\316\42\14\14\0\4\14\1\317\36\14\14\0"+
    "\10\14\1\320\32\14\14\0\11\14\1\321\31\14\14\0"+
    "\11\14\1\322\31\14\14\0\4\14\1\323\36\14\14\0"+
    "\13\14\1\324\27\14\14\0\11\14\1\325\31\14\14\0"+
    "\13\14\1\204\27\14\14\0\3\14\1\326\37\14\14\0"+
    "\3\14\1\327\37\14\14\0\15\14\1\330\25\14\14\0"+
    "\3\14\1\331\1\14\1\124\1\332\5\14\1\333\1\14"+
    "\1\334\3\14\1\335\20\14\14\0\14\14\1\56\26\14"+
    "\14\0\1\14\1\271\41\14\14\0\2\14\1\336\40\14"+
    "\14\0\11\14\1\337\31\14\14\0\20\14\1\340\22\14"+
    "\14\0\10\14\1\341\32\14\14\0\22\14\1\342\20\14"+
    "\14\0\10\14\1\343\32\14\14\0\15\14\1\344\25\14"+
    "\14\0\13\14\1\345\27\14\14\0\14\14\1\346\26\14"+
    "\14\0\1\14\1\347\41\14\14\0\1\14\1\350\41\14"+
    "\14\0\14\14\1\351\26\14\14\0\14\14\1\352\26\14"+
    "\14\0\4\14\1\353\6\14\1\166\27\14\14\0\3\14"+
    "\1\354\37\14\14\0\15\14\1\355\25\14\14\0\2\14"+
    "\1\356\17\14\1\357\2\14\1\333\15\14\14\0\7\14"+
    "\1\360\33\14\14\0\17\14\1\361\23\14\14\0\22\14"+
    "\1\362\20\14\14\0\17\14\1\112\23\14\14\0\1\14"+
    "\1\60\41\14\14\0\20\14\1\363\22\14\14\0\3\14"+
    "\1\364\37\14\14\0\12\14\1\365\30\14\14\0\21\14"+
    "\1\366\21\14\14\0\2\14\1\367\40\14\14\0\3\14"+
    "\1\151\37\14\14\0\13\14\1\370\27\14\14\0\1\14"+
    "\1\371\41\14\14\0\1\14\1\372\41\14\14\0\14\14"+
    "\1\373\26\14\14\0\17\14\1\374\23\14\14\0\2\14"+
    "\1\375\40\14\14\0\22\14\1\107\20\14\14\0\7\14"+
    "\1\376\33\14\14\0\11\14\1\377\31\14\14\0\17\14"+
    "\1\u0100\23\14\14\0\21\14\1\151\21\14\14\0\7\14"+
    "\1\u0101\33\14\14\0\13\14\1\u0102\27\14\14\0\5\14"+
    "\1\u0103\35\14\14\0\16\14\1\u0104\24\14\14\0\3\14"+
    "\1\u0105\37\14\14\0\10\14\1\u0106\32\14\14\0\10\14"+
    "\1\u0107\32\14\14\0\12\14\1\u0108\30\14\14\0\3\14"+
    "\1\271\37\14\14\0\10\14\1\125\32\14\14\0\11\14"+
    "\1\u0109\31\14\14\0\4\14\1\u010a\36\14\14\0\12\14"+
    "\1\125\30\14\14\0\15\14\1\303\25\14\14\0\4\14"+
    "\1\u010b\36\14\14\0\11\14\1\u010c\31\14\14\0\13\14"+
    "\1\u010d\27\14\14\0\27\14\1\u010e\13\14\14\0\13\14"+
    "\1\u010f\27\14\14\0\22\14\1\u0110\20\14\14\0\3\14"+
    "\1\u0111\37\14\14\0\13\14\1\u0112\27\14\14\0\10\14"+
    "\1\211\32\14\14\0\26\14\1\u0113\14\14\14\0\7\14"+
    "\1\u0114\33\14\14\0\1\151\42\14\14\0\3\14\1\u0115"+
    "\37\14\14\0\20\14\1\237\22\14\14\0\5\14\1\u0116"+
    "\35\14\14\0\1\14\1\110\41\14\14\0\2\14\1\110"+
    "\40\14\14\0\7\14\1\u0117\33\14\14\0\10\14\1\u0118"+
    "\32\14\14\0\25\14\1\u0119\15\14\14\0\11\14\1\u011a"+
    "\31\14\14\0\1\14\1\u011b\41\14\14\0\14\14\1\333"+
    "\26\14\14\0\20\14\1\u011c\22\14\14\0\10\14\1\u011d"+
    "\32\14\14\0\11\14\1\u011e\31\14\14\0\15\14\1\u011f"+
    "\25\14\14\0\13\14\1\56\27\14\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[13066];
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
    "\1\0\2\11\3\1\1\11\26\1\3\11\37\1\1\11"+
    "\44\1\2\0\33\1\2\0\31\1\2\0\201\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[287];
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

  /** denotes if the user-EOF-code has already been executed */
  private boolean zzEOFDone;


  /**
   * Creates a new scanner
   *
   * @param   in  the java.io.Reader to read input from.
   */
  public _BuckLexer(java.io.Reader in) {
    this.zzReader = in;
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
    while (i < 1620) {
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
            zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
              zzInput = (zzBufferArrayL != null ? zzBufferArrayL[zzCurrentPosL++] : zzBufferL.charAt(zzCurrentPosL++));
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
        case 2: 
          { return CRLF;
          }
        case 13: break;
        case 6: 
          { return VALUE_STRING;
          }
        case 14: break;
        case 5: 
          { return EQUAL;
          }
        case 15: break;
        case 4: 
          { return COMMENT;
          }
        case 16: break;
        case 8: 
          { return COMMA;
          }
        case 17: break;
        case 10: 
          { return KEYWORDS;
          }
        case 18: break;
        case 1: 
          { return IDENTIFIER;
          }
        case 19: break;
        case 12: 
          { return VALUE_BOOLEAN;
          }
        case 20: break;
        case 11: 
          { return RULE_NAME;
          }
        case 21: break;
        case 9: 
          { return SEMICOLON;
          }
        case 22: break;
        case 3: 
          { return TokenType.WHITE_SPACE;
          }
        case 23: break;
        case 7: 
          { return BRACES;
          }
        case 24: break;
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
