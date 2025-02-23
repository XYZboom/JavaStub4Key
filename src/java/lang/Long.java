/* This file has been generated by Stubmaker (de.uka.ilkd.stubmaker)
 * Date: Fri Jan 31 13:24:50 CET 2014
 */
package java.lang;

public final class Long extends java.lang.Number implements java.lang.Comparable {
   public final static long MIN_VALUE = 0x8000000000000000L;
   public final static long MAX_VALUE = 0x7fffffffffffffffL;
   public final static java.lang.Class TYPE;
   public final static int SIZE = 64;
   //@ public ghost long value;
   /*@ normal_behavior
     @ ensures \result.value == value;
     @ ensures \fresh(\result);
     @ assignable \nothing;
     @*/
   public static Long valueOf(long value);

   public static Long parseLong(String string);
   public static Long decode(String string);
}