package ex_018_Constructor;

public class Lab006_DC {
    public static void main(String[] args) {

        Car c1 = new Car();
        Car c2 = new Car();
        c1.name = "Tesla";
        System.out.println(c1.name);
        System.out.println(c1.model);
        System.out.println(c1.year);

        System.out.println(c2.name);
        c2.name = "Audi";
        System.out.println(c2.name);

        Baby1 b1 = new Baby1();
//        b1.name = "Navisha";
        System.out.println(b1.name);





    }
}

class Car{
    String name;
    int year;
    String model;

//    DC
    Car(){
        name = "unknown car";
        year = 1991;
        model = "XXX";
    }
}
class Baby1{
    String name;

    Baby1(){
        name = "Gugu";
    }
}
