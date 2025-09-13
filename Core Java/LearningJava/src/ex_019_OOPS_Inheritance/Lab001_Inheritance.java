package ex_019_OOPS_Inheritance;

public class Lab001_Inheritance {
    public static void main(String[] args) {
        Father f1 = new Father();
        System.out.println(f1.gold_f);
        f1.bhk2();

        Son s1 = new Son();
        System.out.println(s1.gold_f);
        s1.bhk3();
        s1.bhk2();
    }
}

class Father{
    int gold_f = 100; // Attribute | Data Variable | Property | Instance variables

    void bhk2(){  //Behaviour | Method | Function | data members
        System.out.println("Father - 2BHK");

    }
}

class Son extends Father{


    //    int gold_f = 1000; // Attribute | Data variables |  Property | Instance Variables
//
//    void bhk2() { //  Behaviour |  Method | Function | Data members
//        System.out.println("Father - 2BHK");
//    }





    void bhk3(){
        System.out.println("3BHK Son");
    }
}