package ex_018_Constructor;

public class Lab004_Constructor {
    public static void main(String[] args) {
        Man m1 = new Man("Prapti", 25); // triggers constructor
    }
}
class Man{
    String name;
    int age;

    Man(String name, int age) {
        System.out.println("Constructor called!");  // prints when constructor runs
        this.name = name;
        this.age = age;
        System.out.println(name+ "+" +age);
    }
}