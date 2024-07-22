package java.lang;

/**
 * Exists only for proving EVotingMachine
 */
public final class Character extends java.lang.Object implements java.io.Serializable, java.lang.Comparable
{
    static int digit(char ch, int radix);
    public static boolean isWhitespace(int codePoint);
    public static boolean isDigit(int ch);
    public static boolean isDigit(char ch);
}