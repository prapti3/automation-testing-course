package ex_018_Constructor;

public class Lab002_Constructor {
    public static void main(String[] args) {
        person p1 = new person("Prapti", 12);
        p1.display();  // Prapti 25



    }
}

class person{
    String name;
    int age;


    person(String name,int age){
        System.out.println("This is person1");
        this.name = name;  // "this.name" → instance variable
        this.age = age;    // "age" → constructor parameter



        System.out.println(name);
        System.out.println(age);
    }

    void display() {
        System.out.println(this.name + " " + this.age);
    }



}
