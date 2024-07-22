package java.lang;

public class Double {
    public static final double POSITIVE_INFINITY = 1.0 / 0.0;
    public static final double NEGATIVE_INFINITY = -1.0 / 0.0;
    /*@ public normal_behaviour
      @ requires true;
      @ ensures \result == (val != val);
      @ assignable \strictly_nothing;
      @ accessible \nothing;
      @*/
    public static boolean isNaN(double val) {
        return val != val;
    }

    /*@ public model_behaviour
      @ requires true;
      @ accessible \nothing;
      @ static model boolean _isNaN(double val) {
      @     return val != val;
      @ }
      @*/

    /*@ public model_behaviour
      @ requires true;
      @ accessible \nothing;
      @ static model boolean _isSame(double a, double b) {
      @     return Double._isNaN(a) ? Double._isNaN(b) : a == b;
      @ }
      @*/

    //@ public ghost double value;
   /*@ normal_behavior
     @  ensures \result.value == value;
     @  ensures \fresh(\result);
     @  assignable \nothing;
     @*/
    public static Double valueOf(double value);
    public static Double valueOf(String value);

    public static Double parseDouble(String string);

    /*@ normal_behavior
      @ ensures \result == isInfinite(value);
      @*/
    public boolean isInfinite();

    public static boolean isInfinite(double v) {
        return (v == POSITIVE_INFINITY) || (v == NEGATIVE_INFINITY);
    }

    /*@ normal_behavior
      @ ensures \result == (float) value;
      @*/
    public float floatValue();

    /*@ normal_behavior
      @ ensures \result == value;
      @*/
    public double doubleValue();
}
