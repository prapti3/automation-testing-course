package ex_05_TypeCasting;

public class Lab004_TypeCasting {
    public static void main(String[] args) {
        int course = 200;
        float GST = 18.5f;

     //   int total = course+GST;  // Narrow - implicit
        int total1 = course + (int)GST; // narrow - implicit
        System.out.println(total1);

        float total2 = course + GST; // widening - auto - implicit
        float total3 = (float)course + GST; // widening - explicit
        System.out.println(total3);
        System.out.println(total2);

    }
}
