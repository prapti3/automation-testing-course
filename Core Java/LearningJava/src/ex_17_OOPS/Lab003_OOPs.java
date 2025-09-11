package ex_17_OOPS;

public class Lab003_OOPs {
    public static void main(String[] args){
        Student s1 = new Student();
        Student s2; // this will not call the contructor  bcz it is only object reference
        new Student();  //this will call the contructor bcz it is a object creation
        s1.name = "Prapti";
        s1.sleep();
        System.out.println(s1.name);



    }

}

class Student {
    String name;


    void sleep(){
        System.out.println("ello");
    }

}