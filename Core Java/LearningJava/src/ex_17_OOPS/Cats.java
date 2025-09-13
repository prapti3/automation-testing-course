package ex_17_OOPS;

public class Cats {

    Cats(){
        System.out.println("DC = Main class");


    }

    public static void main(String[] args) {
        Cat_class c1 = new Cat_class();
        new Cat_class();
        Cat_class c2;


        c1.running();
        //c2.running();
        new Cat_class().running();

    }



}

class Cat_class{
//    Cat_class(){
//
//    }
    String name;

    void running(){
        System.out.println("Running");
    }
}
