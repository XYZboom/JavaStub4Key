package java.lang;

public class Float {
    public static final float POSITIVE_INFINITY = 1.0f / 0.0f;
    public static final float NEGATIVE_INFINITY = -1.0f / 0.0f;

    /*@ public normal_behaviour
      @ requires true;
      @ ensures \result == Float._isNaN(val);
      @ assignable \strictly_nothing;
      @*/
    public static boolean isNaN(float val) {
        return val != val;
    }

    /*@ public model_behaviour
      @ requires true;
      @ accessible \nothing;
      @ static model boolean _isNaN(float val) {
      @     return val != val;
      @ }
      @*/

    /*@ public model_behaviour
      @ requires true;
      @ accessible \nothing;
      @ static model boolean _isSame(float a, float b) {
      @     return Float._isNaN(a) ? Float._isNaN(b) : a == b;
      @ }
      @*/

    //@ public ghost float value;
   /*@ normal_behavior
     @  ensures \result.value == value;
     @  ensures \fresh(\result);
     @  assignable \nothing;
     @*/
    public static Float valueOf(float value);
    public static Float valueOf(String string);

    public static Float parseFloat(String string);

    /*@ normal_behavior
      @ ensures \result == isInfinite(value);
      @*/
    public boolean isInfinite();

    public static boolean isInfinite(float v) {
        return (v == POSITIVE_INFINITY) || (v == NEGATIVE_INFINITY);
    }

    /*@ normal_behavior
      @ ensures \result == value;
      @*/
    public float floatValue();
}
