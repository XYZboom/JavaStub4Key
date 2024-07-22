package java.lang;

public final class Short implements java.lang.Comparable {
   public static final short   MIN_VALUE = -32768;
   public static final short   MAX_VALUE = 32767;
   public final static java.lang.Class TYPE;
   public final static int SIZE = 16;
   //@ public ghost short value;
   /*@ normal_behavior
     @  ensures \result.value == value;
     @  ensures \fresh(\result);
     @  assignable \nothing;
     @*/
   public static Short valueOf(short value);

   public static Short parseShort(String string);
}