package ex_018_Constructor;

public class Lab005_Example2 {
    public static void main(String[] args) {
        WebAutomation w1 = new WebAutomation();
    }

}
//real world usage of constructor


class WebAutomation{
//    DC
    WebAutomation(){
        System.out.println("I want to read a CSV files");
        System.out.println("Open the page before loading the scripts");
        System.out.println("You can do anything which you want to do, when objects is created");

       // FileInputStream fileInputStream = new FileInputStream("C://a.txt");
    }
}