package ex_17_OOPS;

public class Person {

//    These are called Properties, attributes, instance variables, member variables
    String name;
    int age;
    String heigth;
    String gender;
    boolean is_married;

//    These are called as Behaviours, Member Functions, Functions, Methods.
    void walk(){
        System.out.println("Walk in");
    }
    void eat(String food){
        System.out.println("Walking");
    }
    String sleep(){
        System.out.println("Walking");
        return null;
    }
    String food(int a){
        System.out.println("Walking");
        return null;
    }


}
