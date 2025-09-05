package ex_05_TypeCasting;

public class Lab003_TypeCasting {
    public static void main(String[] args) {
        long phone = 987643533;
        //short s = phone // implicit narrow?
        short s1 = (short)phone; // explicit narrow?
        System.out.println(s1);


    }
}
