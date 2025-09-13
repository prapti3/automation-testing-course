package ex_018_Constructor;

public class Lab009_Param_constructor_Overloading {
    public static void main(String[] args) {


        Person4 p1 = new Person4("AMIT", 97654321, "abc");
        Person4 p2 = new Person4("PRAMOD", 98989898, "XYZ");
        Person4 p3 = new Person4();
        p3.name = "Saksi";
        System.out.println(p3.name);

        Person4 p4 = new Person4();
        System.out.println(p4.address);


        p1.eat();
        p2.eat();
        p3.eat();
        p4.eat();


    }
}


class Person4{
    String name;
    long phone;
    String address;

    Person4(){
//        this.name = name;
//        System.out.println(name);

        System.out.println("Hello"+name);

    }

    Person4(String name_arg, long phone_arg,String address_arg){
        this.name = name_arg;
        this.phone = phone_arg;
        this.address = address_arg;
    }

    Person4(String name_arg, long phone_arg){
        this.name = name_arg;
        this.phone = phone_arg;
    }

    void eat(){
        System.out.println(this.name + " is eating!!");
    }

}