package ex_05_TypeCasting;

public class Lab002_TypeCasting_Narrowing {
    public static void main(String[] args) {
        int val = 300;
        //byte b = val; // Narrowing (int -> byte) - Implicit Casting is not allowed.
        byte b1 = (byte)val;  //Narrowing (int -> Byte) - explicit casting is not allowed

        //Data loss.
        System.out.println(b1);




        /*
        Automatic type casting (widening - implicit)
        byte -> Short -> int -> long -> float -> double
        *
        *
        Narrowing (explicit)
        byte <- short <- int <- long <- float <- double
        *
        * */
    }
}
