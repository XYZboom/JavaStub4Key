package java.lang;

public final class Byte {
    //@ public ghost byte value;

    /*@ normal_behavior
      @  ensures \result == (int) value;
      @  assignable \strictly_nothing;
      @*/
    public int intValue();

    /*@ normal_behavior
      @  ensures \result.value == b;
      @  ensures \fresh(\result);
      @  assignable \nothing;
      @*/
    public static Byte valueOf(byte b);

    public static Byte parseByte(String string);
}