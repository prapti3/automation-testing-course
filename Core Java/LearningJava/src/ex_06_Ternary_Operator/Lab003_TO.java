package ex_06_Ternary_Operator;

public class Lab003_TO {
    public static void main(String[] args) {
        // the min number between two number by using ternary operator

        int x = 20;
        int y = 40;

//        System.out.println(Math.max(x,y));


        int min = x <y ? x : y;
        int max = y > x ? y : x;
        System.out.println(min);
        System.out.println(max);

    }
}
