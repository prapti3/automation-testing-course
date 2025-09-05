package ex_06_Ternary_Operator;

public class Lab006_TO_Three_Max {
    public static void main(String[] args) {
        //find maximum between the three number
        //now we will be using the logic building formula

        int n1 = 2;
        int n2 = 3;
        int n3 = -11;

//        int max = (n1 > n2) ? A:B;
        int max = (n1 > n2) ? (n1 > n3) ? n1 : n3 : (n2 > n3) ? n2 : n3;
        System.out.println(max);

    }
}
