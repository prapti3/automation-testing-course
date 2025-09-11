package ex_17_OOPS;

public class Lab003_OOPs {
    public static void main(String[] args){
        Student s1 = new Student();
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