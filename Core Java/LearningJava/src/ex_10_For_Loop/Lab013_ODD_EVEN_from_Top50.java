package ex_10_For_Loop;

public class Lab013_ODD_EVEN_from_Top50 {
    public static void main(String[] args) {
        //find the even numbers from 1 to 50

        for(int i=1;i<=50;i++){
            if(i%2==0){
                System.out.println(i +" is Even Number");
            }
            else if(i%2 != 0){
                System.out.println(i +" is Odd Number");
            }
        }
    }
}
