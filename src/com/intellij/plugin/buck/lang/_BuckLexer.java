/* The following code was generated by JFlex 1.4.3 on 6/22/15 9:00 PM */

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
 * on 6/22/15 9:00 PM from the specification file
 * <tt>/Users/cjlm/Projects/buck_plugin/src/com/intellij/plugin/buck/lang/Buck.flex</tt>
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
    "\11\0\1\3\1\1\1\0\1\3\1\2\22\0\1\3\1\0\1\54"+
    "\1\5\3\0\1\53\1\55\1\55\2\0\1\56\3\0\7\41\1\40"+
    "\2\41\1\0\1\57\1\0\1\6\3\0\1\50\3\37\1\47\1\44"+
    "\5\37\1\51\5\37\1\45\1\52\1\43\1\46\5\37\1\55\1\4"+
    "\1\55\1\0\1\20\1\0\1\23\1\25\1\27\1\24\1\10\1\21"+
    "\1\7\1\36\1\22\1\34\1\32\1\14\1\15\1\11\1\16\1\31"+
    "\1\37\1\12\1\30\1\17\1\13\1\35\1\37\1\33\1\26\1\37"+
    "\1\55\1\0\1\55\54\0\1\42\12\0\1\42\4\0\1\42\5\0"+
    "\27\42\1\0\37\42\1\0\u01ca\42\4\0\14\42\16\0\5\42\7\0"+
    "\1\42\1\0\1\42\201\0\5\42\1\0\2\42\2\0\4\42\10\0"+
    "\1\42\1\0\3\42\1\0\1\42\1\0\24\42\1\0\123\42\1\0"+
    "\213\42\10\0\236\42\11\0\46\42\2\0\1\42\7\0\47\42\110\0"+
    "\33\42\5\0\3\42\55\0\53\42\43\0\2\42\1\0\143\42\1\0"+
    "\1\42\17\0\2\42\7\0\2\42\12\0\3\42\2\0\1\42\20\0"+
    "\1\42\1\0\36\42\35\0\131\42\13\0\1\42\30\0\41\42\11\0"+
    "\2\42\4\0\1\42\5\0\26\42\4\0\1\42\11\0\1\42\3\0"+
    "\1\42\27\0\31\42\107\0\1\42\1\0\13\42\127\0\66\42\3\0"+
    "\1\42\22\0\1\42\7\0\12\42\17\0\7\42\1\0\7\42\5\0"+
    "\10\42\2\0\2\42\2\0\26\42\1\0\7\42\1\0\1\42\3\0"+
    "\4\42\3\0\1\42\20\0\1\42\15\0\2\42\1\0\3\42\16\0"+
    "\2\42\23\0\6\42\4\0\2\42\2\0\26\42\1\0\7\42\1\0"+
    "\2\42\1\0\2\42\1\0\2\42\37\0\4\42\1\0\1\42\23\0"+
    "\3\42\20\0\11\42\1\0\3\42\1\0\26\42\1\0\7\42\1\0"+
    "\2\42\1\0\5\42\3\0\1\42\22\0\1\42\17\0\2\42\43\0"+
    "\10\42\2\0\2\42\2\0\26\42\1\0\7\42\1\0\2\42\1\0"+
    "\5\42\3\0\1\42\36\0\2\42\1\0\3\42\17\0\1\42\21\0"+
    "\1\42\1\0\6\42\3\0\3\42\1\0\4\42\3\0\2\42\1\0"+
    "\1\42\1\0\2\42\3\0\2\42\3\0\3\42\3\0\14\42\26\0"+
    "\1\42\64\0\10\42\1\0\3\42\1\0\27\42\1\0\12\42\1\0"+
    "\5\42\3\0\1\42\32\0\2\42\6\0\2\42\43\0\10\42\1\0"+
    "\3\42\1\0\27\42\1\0\12\42\1\0\5\42\3\0\1\42\40\0"+
    "\1\42\1\0\2\42\17\0\2\42\22\0\10\42\1\0\3\42\1\0"+
    "\51\42\2\0\1\42\20\0\1\42\21\0\2\42\30\0\6\42\5\0"+
    "\22\42\3\0\30\42\1\0\11\42\1\0\1\42\2\0\7\42\72\0"+
    "\60\42\1\0\2\42\14\0\7\42\72\0\2\42\1\0\1\42\2\0"+
    "\2\42\1\0\1\42\2\0\1\42\6\0\4\42\1\0\7\42\1\0"+
    "\3\42\1\0\1\42\1\0\1\42\2\0\2\42\1\0\4\42\1\0"+
    "\2\42\11\0\1\42\2\0\5\42\1\0\1\42\25\0\4\42\40\0"+
    "\1\42\77\0\10\42\1\0\44\42\33\0\5\42\163\0\53\42\24\0"+
    "\1\42\20\0\6\42\4\0\4\42\3\0\1\42\3\0\2\42\7\0"+
    "\3\42\4\0\15\42\14\0\1\42\21\0\46\42\1\0\1\42\5\0"+
    "\1\42\2\0\53\42\1\0\u014d\42\1\0\4\42\2\0\7\42\1\0"+
    "\1\42\1\0\4\42\2\0\51\42\1\0\4\42\2\0\41\42\1\0"+
    "\4\42\2\0\7\42\1\0\1\42\1\0\4\42\2\0\17\42\1\0"+
    "\71\42\1\0\4\42\2\0\103\42\45\0\20\42\20\0\125\42\14\0"+
    "\u026c\42\2\0\21\42\1\0\32\42\5\0\113\42\25\0\15\42\1\0"+
    "\4\42\16\0\22\42\16\0\22\42\16\0\15\42\1\0\3\42\17\0"+
    "\64\42\43\0\1\42\4\0\1\42\103\0\130\42\10\0\51\42\1\0"+
    "\1\42\5\0\106\42\12\0\35\42\63\0\36\42\2\0\5\42\13\0"+
    "\54\42\25\0\7\42\70\0\27\42\11\0\65\42\122\0\1\42\135\0"+
    "\57\42\21\0\7\42\67\0\36\42\15\0\2\42\12\0\54\42\32\0"+
    "\44\42\51\0\3\42\12\0\44\42\153\0\4\42\1\0\4\42\3\0"+
    "\2\42\11\0\300\42\100\0\u0116\42\2\0\6\42\2\0\46\42\2\0"+
    "\6\42\2\0\10\42\1\0\1\42\1\0\1\42\1\0\1\42\1\0"+
    "\37\42\2\0\65\42\1\0\7\42\1\0\1\42\3\0\3\42\1\0"+
    "\7\42\3\0\4\42\2\0\6\42\4\0\15\42\5\0\3\42\1\0"+
    "\7\42\164\0\1\42\15\0\1\42\20\0\15\42\145\0\1\42\4\0"+
    "\1\42\2\0\12\42\1\0\1\42\3\0\5\42\6\0\1\42\1\0"+
    "\1\42\1\0\1\42\1\0\4\42\1\0\13\42\2\0\4\42\5\0"+
    "\5\42\4\0\1\42\64\0\2\42\u0a7b\0\57\42\1\0\57\42\1\0"+
    "\205\42\6\0\4\42\3\0\2\42\14\0\46\42\1\0\1\42\5\0"+
    "\1\42\2\0\70\42\7\0\1\42\20\0\27\42\11\0\7\42\1\0"+
    "\7\42\1\0\7\42\1\0\7\42\1\0\7\42\1\0\7\42\1\0"+
    "\7\42\1\0\7\42\120\0\1\42\u01d5\0\2\42\52\0\5\42\5\0"+
    "\2\42\4\0\126\42\6\0\3\42\1\0\132\42\1\0\4\42\5\0"+
    "\51\42\3\0\136\42\21\0\33\42\65\0\20\42\u0200\0\u19b6\42\112\0"+
    "\u51cd\42\63\0\u048d\42\103\0\56\42\2\0\u010d\42\3\0\20\42\12\0"+
    "\2\42\24\0\57\42\20\0\31\42\10\0\106\42\61\0\11\42\2\0"+
    "\147\42\2\0\4\42\1\0\4\42\14\0\13\42\115\0\12\42\1\0"+
    "\3\42\1\0\4\42\1\0\27\42\35\0\64\42\16\0\62\42\76\0"+
    "\6\42\3\0\1\42\16\0\34\42\12\0\27\42\31\0\35\42\7\0"+
    "\57\42\34\0\1\42\60\0\51\42\27\0\3\42\1\0\10\42\24\0"+
    "\27\42\3\0\1\42\5\0\60\42\1\0\1\42\3\0\2\42\2\0"+
    "\5\42\2\0\1\42\1\0\1\42\30\0\3\42\2\0\13\42\7\0"+
    "\3\42\14\0\6\42\2\0\6\42\2\0\6\42\11\0\7\42\1\0"+
    "\7\42\221\0\43\42\35\0\u2ba4\42\14\0\27\42\4\0\61\42\u2104\0"+
    "\u016e\42\2\0\152\42\46\0\7\42\14\0\5\42\5\0\1\42\1\0"+
    "\12\42\1\0\15\42\1\0\5\42\1\0\1\42\1\0\2\42\1\0"+
    "\2\42\1\0\154\42\41\0\u016b\42\22\0\100\42\2\0\66\42\50\0"+
    "\14\42\164\0\5\42\1\0\207\42\44\0\32\42\6\0\32\42\13\0"+
    "\131\42\3\0\6\42\2\0\6\42\2\0\6\42\2\0\3\42\43\0";

  /** 
   * Translates characters to character classes
   */
  private static final char [] ZZ_CMAP = zzUnpackCMap(ZZ_CMAP_PACKED);

  /** 
   * Translates DFA states to action switch labels.
   */
  private static final int [] ZZ_ACTION = zzUnpackAction();

  private static final String ZZ_ACTION_PACKED_0 =
    "\1\0\1\1\2\2\1\3\1\4\1\5\26\1\2\6"+
    "\1\7\1\10\1\11\35\1\2\0\2\1\5\6\10\1"+
    "\1\12\10\1\1\12\21\1\1\0\2\1\2\0\2\1"+
    "\1\13\11\1\1\14\21\1\3\0\34\1\3\0\15\1"+
    "\1\13\14\1\1\0\24\1\1\0\21\1\1\0\14\1"+
    "\1\12\7\1\1\0\22\1\1\0\16\1\1\0\12\1"+
    "\1\0\10\1\1\0\7\1\1\0\3\1\1\0\2\1"+
    "\1\0\2\1\1\13\5\1";

  private static int [] zzUnpackAction() {
    int [] result = new int[340];
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
    "\0\0\0\60\0\60\0\140\0\220\0\300\0\60\0\360"+
    "\0\u0120\0\u0150\0\u0180\0\u01b0\0\u01e0\0\u0210\0\u0240\0\u0270"+
    "\0\u02a0\0\u02d0\0\u0300\0\u0330\0\u0360\0\u0390\0\u03c0\0\u03f0"+
    "\0\u0420\0\u0450\0\u0480\0\u04b0\0\u04e0\0\u0510\0\u0540\0\60"+
    "\0\60\0\60\0\u0570\0\u05a0\0\u05d0\0\u0600\0\u0630\0\u0660"+
    "\0\u0690\0\u06c0\0\u06f0\0\u0720\0\u0750\0\u0780\0\u07b0\0\u07e0"+
    "\0\u0810\0\u0840\0\u0870\0\u08a0\0\u08d0\0\u0900\0\u0930\0\u0960"+
    "\0\u0990\0\u09c0\0\u09f0\0\u0a20\0\u0a50\0\u0a80\0\u0ab0\0\u0480"+
    "\0\u0ae0\0\u0b10\0\u0b40\0\u0b70\0\60\0\u0ba0\0\u0bd0\0\u0c00"+
    "\0\u0c30\0\u0c60\0\u0c90\0\u0cc0\0\u0cf0\0\u0d20\0\u0d50\0\u0d80"+
    "\0\u0db0\0\u0de0\0\u0e10\0\u0e40\0\u0e70\0\u0ea0\0\u0ed0\0\u0f00"+
    "\0\u0f30\0\u01b0\0\u0f60\0\u0f90\0\u0fc0\0\u0ff0\0\u1020\0\u1050"+
    "\0\u1080\0\u10b0\0\u10e0\0\u1110\0\u1140\0\u1170\0\u11a0\0\u11d0"+
    "\0\u1200\0\u1230\0\u1260\0\u1290\0\u12c0\0\u12f0\0\u1320\0\u1350"+
    "\0\u1380\0\u13b0\0\u01b0\0\u13e0\0\u1410\0\u1440\0\u1470\0\u14a0"+
    "\0\u14d0\0\u1500\0\u1530\0\u1560\0\u01b0\0\u1590\0\u15c0\0\u15f0"+
    "\0\u1620\0\u1650\0\u1680\0\u16b0\0\u16e0\0\u1710\0\u1740\0\u1770"+
    "\0\u17a0\0\u17d0\0\u1800\0\u1830\0\u1860\0\u1890\0\u18c0\0\u18f0"+
    "\0\u1920\0\u1950\0\u1980\0\u19b0\0\u19e0\0\u1a10\0\u1a40\0\u1a70"+
    "\0\u1aa0\0\u1ad0\0\u1b00\0\u1b30\0\u1b60\0\u1b90\0\u1bc0\0\u1bf0"+
    "\0\u1c20\0\u1c50\0\u1c80\0\u1cb0\0\u1ce0\0\u1d10\0\u1d40\0\u1d70"+
    "\0\u1da0\0\u1dd0\0\u1e00\0\u1e30\0\u1e60\0\u1e90\0\u1ec0\0\u1ef0"+
    "\0\u1f20\0\u1f50\0\u1f80\0\u1fb0\0\u1fe0\0\u2010\0\u2040\0\u2070"+
    "\0\u20a0\0\u20d0\0\u2100\0\u2130\0\u2160\0\u0240\0\u2190\0\u21c0"+
    "\0\u21f0\0\u2220\0\u2250\0\u2280\0\u22b0\0\u22e0\0\u2310\0\u2340"+
    "\0\u2370\0\u23a0\0\u23d0\0\u2400\0\u2430\0\u2460\0\u2490\0\u24c0"+
    "\0\u24f0\0\u2520\0\u2550\0\u2580\0\u25b0\0\u25e0\0\u2610\0\u2640"+
    "\0\u2670\0\u26a0\0\u26d0\0\u2700\0\u2730\0\u2760\0\u2790\0\u27c0"+
    "\0\u27f0\0\u2820\0\u2850\0\u2880\0\u28b0\0\u28e0\0\u2910\0\u2940"+
    "\0\u2970\0\u29a0\0\u29d0\0\u2a00\0\u2a30\0\u2a60\0\u2a90\0\u2ac0"+
    "\0\u2af0\0\u2b20\0\u2b50\0\u2b80\0\u2bb0\0\u2be0\0\u2c10\0\u2c40"+
    "\0\u2c70\0\u2ca0\0\u2cd0\0\u2d00\0\u2d30\0\u2d60\0\u0240\0\u2d90"+
    "\0\u2dc0\0\u2df0\0\u2e20\0\u2e50\0\u2e80\0\u2eb0\0\u2ee0\0\u2f10"+
    "\0\u2f40\0\u2f70\0\u2fa0\0\u2fd0\0\u3000\0\u3030\0\u3060\0\u3090"+
    "\0\u30c0\0\u30f0\0\u3120\0\u3150\0\u3180\0\u31b0\0\u31e0\0\u3210"+
    "\0\u3240\0\u3270\0\u32a0\0\u32d0\0\u3300\0\u3330\0\u3360\0\u3390"+
    "\0\u33c0\0\u33f0\0\u3420\0\u3450\0\u3480\0\u34b0\0\u34e0\0\u3510"+
    "\0\u3540\0\u3570\0\u35a0\0\u35d0\0\u3600\0\u3630\0\u3660\0\u3690"+
    "\0\u36c0\0\u36f0\0\u3720\0\u3750\0\u3780\0\u37b0\0\u37e0\0\u3810"+
    "\0\u3840\0\u3870\0\u38a0\0\u38d0\0\u3900\0\u3930\0\u3960\0\u3990"+
    "\0\u39c0\0\u39f0\0\u3a20\0\u3a50\0\u3a80\0\u3ab0\0\u3ae0\0\u3b10"+
    "\0\u3b40\0\u3b70\0\u3ba0\0\u3bd0\0\u3c00\0\u3c30\0\60\0\u3c60"+
    "\0\u3c90\0\u3cc0\0\u3cf0\0\u3d20";

  private static int [] zzUnpackRowMap() {
    int [] result = new int[340];
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
    "\1\11\1\12\1\13\2\14\1\15\1\14\1\16\1\17"+
    "\1\20\1\21\1\22\1\23\1\24\1\14\1\25\1\26"+
    "\1\27\1\30\1\14\1\31\1\32\2\14\2\33\1\17"+
    "\1\34\1\35\6\14\1\36\1\37\1\40\1\41\1\42"+
    "\61\0\1\3\61\0\1\5\54\0\1\6\2\0\55\6"+
    "\7\0\1\14\1\43\3\14\1\44\3\14\1\45\21\14"+
    "\1\17\10\14\14\0\11\14\1\45\12\14\1\46\6\14"+
    "\1\17\10\14\14\0\11\14\1\45\2\14\1\47\1\50"+
    "\15\14\1\17\10\14\14\0\1\14\1\51\5\14\1\52"+
    "\1\14\1\45\21\14\1\17\10\14\14\0\11\14\1\45"+
    "\21\14\1\17\10\14\14\0\11\14\1\45\2\14\1\53"+
    "\16\14\1\17\10\14\14\0\1\14\1\54\1\14\1\55"+
    "\5\14\1\45\21\14\1\17\10\14\14\0\44\17\14\0"+
    "\11\14\1\45\2\14\1\56\16\14\1\17\10\14\14\0"+
    "\2\14\1\57\6\14\1\45\21\14\1\17\10\14\14\0"+
    "\2\14\1\60\6\14\1\45\2\14\1\61\5\14\1\62"+
    "\10\14\1\17\10\14\14\0\1\14\1\63\7\14\1\64"+
    "\21\14\1\17\10\14\14\0\11\14\1\45\1\14\1\65"+
    "\17\14\1\17\10\14\14\0\7\14\1\66\1\14\1\45"+
    "\12\14\1\67\6\14\1\17\10\14\14\0\3\14\1\70"+
    "\3\14\1\71\1\14\1\45\21\14\1\17\10\14\14\0"+
    "\3\14\1\72\5\14\1\45\2\14\1\73\2\14\1\74"+
    "\13\14\1\17\10\14\14\0\1\14\1\75\7\14\1\45"+
    "\21\14\1\17\10\14\14\0\11\14\1\45\2\14\1\76"+
    "\16\14\1\17\10\14\14\0\11\14\1\45\1\14\1\77"+
    "\17\14\1\17\10\14\14\0\11\100\1\101\21\100\1\0"+
    "\10\100\14\0\3\14\1\55\5\14\1\45\21\14\1\17"+
    "\2\14\1\102\5\14\14\0\11\14\1\45\2\14\1\56"+
    "\16\14\1\17\5\14\1\103\2\14\5\0\4\104\1\105"+
    "\46\104\1\106\4\104\4\107\1\105\47\107\1\110\3\107"+
    "\7\0\2\14\1\111\6\14\1\45\21\14\1\17\10\14"+
    "\14\0\7\14\1\112\1\14\1\45\21\14\1\17\10\14"+
    "\14\0\14\17\1\113\27\17\14\0\11\14\1\45\6\14"+
    "\1\114\1\14\1\115\10\14\1\17\10\14\14\0\6\14"+
    "\1\116\2\14\1\45\21\14\1\17\10\14\14\0\11\14"+
    "\1\45\11\14\1\117\7\14\1\17\10\14\14\0\6\14"+
    "\1\120\2\14\1\45\7\14\1\121\11\14\1\17\10\14"+
    "\14\0\11\14\1\45\4\14\1\122\14\14\1\17\10\14"+
    "\14\0\2\14\1\123\6\14\1\45\1\14\1\124\17\14"+
    "\1\17\10\14\14\0\11\14\1\45\7\14\1\125\11\14"+
    "\1\17\10\14\14\0\4\14\1\126\4\14\1\45\21\14"+
    "\1\17\10\14\14\0\5\14\1\127\3\14\1\45\21\14"+
    "\1\17\10\14\14\0\11\14\1\45\6\14\1\130\12\14"+
    "\1\17\10\14\14\0\11\14\1\45\3\14\1\131\15\14"+
    "\1\17\10\14\14\0\3\14\1\132\5\14\1\45\21\14"+
    "\1\17\10\14\14\0\11\14\1\45\11\14\1\133\7\14"+
    "\1\17\10\14\14\0\11\14\1\45\10\14\1\134\10\14"+
    "\1\17\10\14\14\0\5\17\1\135\2\17\1\136\3\17"+
    "\1\113\1\17\1\137\25\17\14\0\2\14\1\140\6\14"+
    "\1\45\21\14\1\17\10\14\14\0\2\14\1\141\6\14"+
    "\1\45\21\14\1\17\10\14\14\0\11\14\1\45\12\14"+
    "\1\142\6\14\1\17\10\14\14\0\11\14\1\45\6\14"+
    "\1\143\12\14\1\17\10\14\14\0\4\14\1\144\4\14"+
    "\1\45\21\14\1\17\10\14\14\0\1\14\1\145\5\14"+
    "\1\146\1\14\1\45\21\14\1\17\10\14\14\0\11\14"+
    "\1\45\6\14\1\147\12\14\1\17\10\14\14\0\10\14"+
    "\1\150\1\45\21\14\1\17\10\14\14\0\11\14\1\45"+
    "\5\14\1\151\13\14\1\17\10\14\14\0\11\14\1\45"+
    "\14\14\1\152\4\14\1\17\10\14\14\0\11\14\1\45"+
    "\7\14\1\153\11\14\1\17\10\14\30\0\1\154\43\0"+
    "\11\14\1\45\21\14\1\17\3\14\1\155\4\14\14\0"+
    "\11\14\1\45\21\14\1\17\6\14\1\156\1\14\5\0"+
    "\4\104\1\105\46\104\1\105\4\104\53\0\1\157\4\0"+
    "\4\107\1\105\47\107\1\105\3\107\54\0\1\160\12\0"+
    "\3\14\1\161\5\14\1\162\21\14\1\17\10\14\14\0"+
    "\11\14\1\45\4\14\1\163\14\14\1\17\10\14\14\0"+
    "\2\17\1\164\41\17\14\0\5\14\1\165\3\14\1\45"+
    "\21\14\1\17\10\14\14\0\7\14\1\166\1\14\1\45"+
    "\21\14\1\17\10\14\14\0\1\14\1\132\7\14\1\45"+
    "\21\14\1\17\10\14\14\0\11\14\1\167\21\14\1\17"+
    "\10\14\14\0\7\14\1\170\1\14\1\45\21\14\1\17"+
    "\10\14\14\0\7\14\1\171\1\14\1\45\21\14\1\17"+
    "\10\14\14\0\7\14\1\172\1\14\1\45\21\14\1\17"+
    "\10\14\14\0\11\14\1\45\1\14\1\173\17\14\1\17"+
    "\10\14\14\0\2\14\1\132\6\14\1\45\21\14\1\17"+
    "\10\14\14\0\10\14\1\174\1\45\21\14\1\17\10\14"+
    "\14\0\1\14\1\175\7\14\1\45\21\14\1\17\10\14"+
    "\14\0\11\14\1\45\7\14\1\126\11\14\1\17\10\14"+
    "\14\0\5\14\1\176\3\14\1\45\21\14\1\17\10\14"+
    "\14\0\3\14\1\177\5\14\1\45\21\14\1\17\10\14"+
    "\14\0\11\14\1\200\21\14\1\17\10\14\14\0\11\14"+
    "\1\45\7\14\1\132\11\14\1\17\10\14\14\0\13\17"+
    "\1\201\30\17\14\0\1\17\1\202\42\17\14\0\13\17"+
    "\1\203\30\17\14\0\11\14\1\45\2\14\1\204\16\14"+
    "\1\17\10\14\14\0\10\14\1\205\1\45\21\14\1\17"+
    "\10\14\14\0\11\14\1\64\21\14\1\17\10\14\14\0"+
    "\11\14\1\206\7\14\1\132\11\14\1\17\10\14\14\0"+
    "\3\14\1\207\5\14\1\45\21\14\1\17\10\14\14\0"+
    "\11\14\1\45\4\14\1\210\14\14\1\17\10\14\14\0"+
    "\11\14\1\45\13\14\1\211\5\14\1\17\10\14\14\0"+
    "\11\14\1\45\11\14\1\212\7\14\1\17\10\14\14\0"+
    "\11\14\1\45\15\14\1\213\3\14\1\17\10\14\14\0"+
    "\11\14\1\45\7\14\1\214\11\14\1\17\10\14\14\0"+
    "\11\14\1\45\2\14\1\215\16\14\1\17\10\14\14\0"+
    "\11\14\1\45\1\14\1\216\17\14\1\17\10\14\16\0"+
    "\1\217\55\0\11\14\1\45\21\14\1\17\4\14\1\175"+
    "\3\14\14\0\11\14\1\45\21\14\1\17\7\14\1\155"+
    "\5\0\53\157\1\220\4\157\54\160\1\221\3\160\7\0"+
    "\4\14\1\222\4\14\1\45\21\14\1\17\10\14\14\0"+
    "\14\17\1\223\27\17\14\0\15\17\1\224\26\17\14\0"+
    "\4\14\1\225\4\14\1\45\21\14\1\17\10\14\14\0"+
    "\3\14\1\226\5\14\1\45\21\14\1\17\10\14\14\0"+
    "\5\17\1\135\6\17\1\113\27\17\14\0\10\14\1\227"+
    "\1\45\21\14\1\17\10\14\14\0\4\14\1\230\4\14"+
    "\1\45\21\14\1\17\10\14\14\0\5\14\1\231\3\14"+
    "\1\45\21\14\1\17\10\14\14\0\11\14\1\45\1\232"+
    "\20\14\1\17\10\14\14\0\11\14\1\233\21\14\1\17"+
    "\10\14\14\0\4\14\1\234\4\14\1\45\21\14\1\17"+
    "\10\14\14\0\7\14\1\235\1\14\1\45\21\14\1\17"+
    "\10\14\14\0\1\236\13\17\1\113\27\17\14\0\16\17"+
    "\1\237\25\17\14\0\21\17\1\240\22\17\14\0\2\17"+
    "\1\241\41\17\14\0\3\14\1\242\5\14\1\45\21\14"+
    "\1\17\10\14\14\0\11\14\1\45\2\14\1\243\16\14"+
    "\1\17\10\14\14\0\3\17\1\244\4\17\1\245\3\17"+
    "\1\113\27\17\14\0\11\14\1\45\6\14\1\246\12\14"+
    "\1\17\10\14\14\0\4\14\1\247\4\14\1\45\21\14"+
    "\1\17\10\14\14\0\1\14\1\250\7\14\1\45\21\14"+
    "\1\17\10\14\14\0\11\14\1\45\2\14\1\251\16\14"+
    "\1\17\10\14\14\0\7\14\1\252\1\14\1\45\21\14"+
    "\1\17\10\14\14\0\10\14\1\253\1\45\21\14\1\17"+
    "\10\14\14\0\11\14\1\64\17\14\1\254\1\14\1\17"+
    "\10\14\14\0\11\14\1\45\4\14\1\255\14\14\1\17"+
    "\10\14\31\0\1\256\33\0\53\157\1\257\4\157\54\160"+
    "\1\260\3\160\7\0\5\14\1\261\3\14\1\45\21\14"+
    "\1\17\10\14\14\0\2\17\1\164\10\17\1\262\30\17"+
    "\14\0\3\17\1\263\40\17\14\0\11\14\1\45\3\14"+
    "\1\264\15\14\1\17\10\14\14\0\10\14\1\265\1\45"+
    "\21\14\1\17\10\14\14\0\1\14\1\266\7\14\1\45"+
    "\21\14\1\17\10\14\14\0\3\14\1\267\5\14\1\45"+
    "\21\14\1\17\10\14\14\0\1\14\1\270\7\14\1\45"+
    "\21\14\1\17\10\14\14\0\1\14\1\271\7\14\1\45"+
    "\21\14\1\17\10\14\14\0\5\17\1\272\6\17\1\113"+
    "\27\17\14\0\11\14\1\45\3\14\1\273\15\14\1\17"+
    "\10\14\14\0\11\14\1\45\1\14\1\274\17\14\1\17"+
    "\10\14\14\0\1\17\1\275\42\17\14\0\3\17\1\241"+
    "\40\17\14\0\10\17\1\276\33\17\14\0\14\17\1\277"+
    "\27\17\14\0\11\14\1\45\5\14\1\300\13\14\1\17"+
    "\10\14\14\0\11\14\1\45\6\14\1\301\12\14\1\17"+
    "\10\14\14\0\7\17\1\302\34\17\14\0\14\17\1\303"+
    "\27\17\14\0\1\14\1\304\7\14\1\45\21\14\1\17"+
    "\10\14\14\0\11\14\1\45\1\14\1\305\17\14\1\17"+
    "\10\14\14\0\11\14\1\45\6\14\1\306\12\14\1\17"+
    "\10\14\14\0\1\307\10\14\1\45\21\14\1\17\10\14"+
    "\14\0\2\14\1\142\6\14\1\45\21\14\1\17\10\14"+
    "\14\0\7\14\1\310\1\14\1\45\21\14\1\17\10\14"+
    "\14\0\11\14\1\311\21\14\1\17\10\14\14\0\11\14"+
    "\1\45\1\14\1\312\17\14\1\17\10\14\17\0\1\313"+
    "\45\0\53\157\1\105\4\157\54\160\1\105\3\160\7\0"+
    "\1\14\1\163\7\14\1\45\21\14\1\17\10\14\14\0"+
    "\15\17\1\314\26\17\14\0\7\17\1\315\34\17\14\0"+
    "\1\14\1\134\7\14\1\45\21\14\1\17\10\14\14\0"+
    "\1\14\1\316\7\14\1\45\21\14\1\17\10\14\14\0"+
    "\11\14\1\317\21\14\1\17\10\14\14\0\11\14\1\45"+
    "\6\14\1\264\12\14\1\17\10\14\14\0\11\14\1\45"+
    "\6\14\1\320\12\14\1\17\10\14\14\0\11\14\1\45"+
    "\7\14\1\321\11\14\1\17\10\14\14\0\13\17\1\322"+
    "\30\17\14\0\1\14\1\323\7\14\1\45\21\14\1\17"+
    "\10\14\14\0\11\14\1\45\3\14\1\324\15\14\1\17"+
    "\10\14\14\0\2\17\1\325\41\17\14\0\3\17\1\326"+
    "\40\17\14\0\11\14\1\327\21\14\1\17\10\14\14\0"+
    "\10\14\1\134\1\45\21\14\1\17\10\14\14\0\7\17"+
    "\1\330\34\17\14\0\3\17\1\331\40\17\14\0\11\14"+
    "\1\332\21\14\1\17\10\14\14\0\5\14\1\333\3\14"+
    "\1\45\21\14\1\17\10\14\14\0\10\14\1\334\1\45"+
    "\21\14\1\17\10\14\14\0\1\14\1\335\7\14\1\45"+
    "\21\14\1\17\10\14\14\0\3\14\1\116\5\14\1\45"+
    "\21\14\1\17\10\14\14\0\14\17\1\113\4\17\1\336"+
    "\22\17\14\0\5\14\1\337\3\14\1\45\21\14\1\17"+
    "\10\14\23\0\1\340\50\0\5\17\1\276\36\17\14\0"+
    "\13\17\1\341\30\17\14\0\11\14\1\45\3\14\1\342"+
    "\15\14\1\17\10\14\14\0\12\17\1\343\1\17\1\113"+
    "\27\17\14\0\10\14\1\344\1\45\21\14\1\17\10\14"+
    "\14\0\10\14\1\132\1\45\21\14\1\17\10\14\14\0"+
    "\16\17\1\345\25\17\14\0\11\14\1\346\21\14\1\17"+
    "\10\14\14\0\11\14\1\347\21\14\1\17\10\14\14\0"+
    "\3\17\1\350\40\17\14\0\17\17\1\276\24\17\14\0"+
    "\14\17\1\113\10\17\1\351\16\17\14\0\10\17\1\352"+
    "\33\17\14\0\1\353\43\17\14\0\4\17\1\354\7\17"+
    "\1\113\27\17\14\0\10\14\1\355\1\45\21\14\1\17"+
    "\10\14\14\0\11\14\1\356\21\14\1\17\10\14\14\0"+
    "\11\14\1\357\21\14\1\17\10\14\14\0\4\17\1\360"+
    "\37\17\14\0\11\14\1\45\1\14\1\361\17\14\1\17"+
    "\10\14\27\0\1\362\44\0\15\17\1\363\26\17\14\0"+
    "\11\14\1\364\21\14\1\17\10\14\14\0\13\17\1\365"+
    "\30\17\14\0\3\14\1\366\5\14\1\45\21\14\1\17"+
    "\10\14\14\0\3\17\1\367\40\17\14\0\14\17\1\113"+
    "\1\370\26\17\14\0\3\17\1\371\1\17\1\135\1\372"+
    "\5\17\1\373\1\17\1\374\3\17\1\375\21\17\14\0"+
    "\4\17\1\365\37\17\14\0\14\17\1\376\27\17\14\0"+
    "\21\17\1\377\22\17\14\0\1\17\1\u0100\42\17\14\0"+
    "\2\17\1\u0101\41\17\14\0\11\14\1\u0102\21\14\1\17"+
    "\10\14\14\0\14\17\1\113\3\17\1\u0103\23\17\14\0"+
    "\10\17\1\u0104\3\17\1\113\27\17\14\0\22\17\1\u0105"+
    "\21\17\14\0\10\14\1\u0106\1\45\21\14\1\17\10\14"+
    "\31\0\1\u0107\42\0\11\17\1\u0108\32\17\14\0\14\17"+
    "\1\113\1\u0109\26\17\14\0\5\17\1\u010a\36\17\14\0"+
    "\11\14\1\45\1\14\1\u010b\17\14\1\17\10\14\14\0"+
    "\14\17\1\u010c\27\17\14\0\1\17\1\u010d\42\17\14\0"+
    "\1\17\1\u010e\42\17\14\0\14\17\1\u010f\27\17\14\0"+
    "\2\17\1\164\11\17\1\u0110\27\17\14\0\4\17\1\u0111"+
    "\6\17\1\203\30\17\14\0\3\17\1\u0112\40\17\14\0"+
    "\3\17\1\377\40\17\14\0\10\17\1\377\33\17\14\0"+
    "\15\17\1\u0113\26\17\14\0\2\17\1\u0114\11\17\1\113"+
    "\5\17\1\u0115\2\17\1\u0116\16\17\14\0\7\17\1\u0117"+
    "\34\17\14\0\17\17\1\u0118\24\17\14\0\22\17\1\u0119"+
    "\21\17\14\0\11\14\1\45\5\14\1\132\13\14\1\17"+
    "\10\14\25\0\1\u011a\46\0\5\17\1\135\36\17\14\0"+
    "\1\17\1\u011b\42\17\14\0\1\17\1\276\42\17\14\0"+
    "\11\14\1\45\6\14\1\u011c\12\14\1\17\10\14\14\0"+
    "\3\17\1\u011d\40\17\14\0\12\17\1\u011e\31\17\14\0"+
    "\21\17\1\u011f\22\17\14\0\2\17\1\u0120\41\17\14\0"+
    "\3\17\1\276\40\17\14\0\13\17\1\u0121\30\17\14\0"+
    "\1\17\1\u0122\42\17\14\0\1\17\1\u0123\42\17\14\0"+
    "\14\17\1\u0124\27\17\14\0\17\17\1\u0125\24\17\14\0"+
    "\14\17\1\u0110\27\17\14\0\2\17\1\u0126\41\17\14\0"+
    "\22\17\1\u0127\21\17\14\0\7\17\1\u0128\34\17\21\0"+
    "\1\u0129\52\0\22\17\1\352\21\17\14\0\11\14\1\u012a"+
    "\21\14\1\17\10\14\14\0\17\17\1\u012b\24\17\14\0"+
    "\21\17\1\276\22\17\14\0\7\17\1\u012c\34\17\14\0"+
    "\13\17\1\u012d\30\17\14\0\5\17\1\u012e\36\17\14\0"+
    "\16\17\1\u012f\25\17\14\0\3\17\1\u0130\40\17\14\0"+
    "\10\17\1\u0131\33\17\14\0\10\17\1\u0132\33\17\14\0"+
    "\12\17\1\u0133\31\17\14\0\1\17\1\377\42\17\14\0"+
    "\3\17\1\u0100\40\17\27\0\1\u0134\44\0\10\17\1\136"+
    "\3\17\1\113\27\17\14\0\11\17\1\u0135\32\17\14\0"+
    "\4\17\1\u0136\37\17\14\0\12\17\1\136\31\17\14\0"+
    "\15\17\1\u0137\26\17\14\0\4\17\1\u0138\37\17\14\0"+
    "\11\17\1\u0139\32\17\14\0\13\17\1\u013a\30\17\14\0"+
    "\27\17\1\u013b\14\17\14\0\13\17\1\u013c\30\17\32\0"+
    "\1\u013d\41\0\22\17\1\u013e\21\17\14\0\3\17\1\u013f"+
    "\40\17\14\0\11\17\1\u0140\32\17\14\0\13\17\1\u0141"+
    "\30\17\14\0\10\17\1\u0142\33\17\14\0\26\17\1\u0143"+
    "\15\17\14\0\7\17\1\u0144\34\17\14\0\1\276\43\17"+
    "\17\0\1\u0145\54\0\3\17\1\u0146\40\17\14\0\20\17"+
    "\1\u010a\23\17\14\0\20\17\1\u0103\23\17\14\0\5\17"+
    "\1\u0147\36\17\14\0\1\17\1\u0148\42\17\14\0\1\17"+
    "\1\363\42\17\14\0\2\17\1\363\41\17\30\0\1\u0149"+
    "\43\0\7\17\1\u014a\34\17\14\0\10\17\1\u014b\33\17"+
    "\14\0\21\17\1\u0100\22\17\17\0\1\u014c\54\0\25\17"+
    "\1\u014d\16\17\14\0\11\17\1\u014e\32\17\33\0\1\u014f"+
    "\40\0\1\17\1\u0150\42\17\14\0\14\17\1\u0116\27\17"+
    "\14\0\20\17\1\u0151\23\17\14\0\10\17\1\u0152\33\17"+
    "\14\0\11\17\1\u0153\32\17\14\0\15\17\1\u0154\26\17"+
    "\14\0\13\17\1\376\30\17\5\0";

  private static int [] zzUnpackTrans() {
    int [] result = new int[15696];
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
    "\1\0\2\11\3\1\1\11\30\1\3\11\35\1\2\0"+
    "\3\1\1\11\46\1\1\0\2\1\2\0\36\1\3\0"+
    "\34\1\3\0\32\1\1\0\24\1\1\0\21\1\1\0"+
    "\24\1\1\0\22\1\1\0\16\1\1\0\12\1\1\0"+
    "\10\1\1\0\7\1\1\0\3\1\1\0\2\1\1\0"+
    "\2\1\1\11\5\1";

  private static int [] zzUnpackAttribute() {
    int [] result = new int[340];
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
        case 11: 
          { return RULE_NAMES;
          }
        case 18: break;
        case 10: 
          { return KEYWORDS;
          }
        case 19: break;
        case 1: 
          { return IDENTIFIER;
          }
        case 20: break;
        case 12: 
          { return VALUE_BOOLEAN;
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
