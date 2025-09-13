package ex_018_Constructor;

public class Lab008_Parameterized_Real_world_Usage {
    public static void main(String[] args) {

        People p1 = new People("AMIT", 9765332, "abc");
        System.out.println(p1.name);
        People p2 = new People("PRAMOD", 98758453, "XYZ");
        System.out.println(p2.name + " " + p2.phone);
        People p3 = new People();
    }

}

class People{
    String name;
    long phone;
    String address;

    People(){
        System.out.println("Hello");
    }
    People(String name_user){
        this.name = name_user;
    }
    People(String name_user, long phone_user, String address_user){
        this.name = name_user;
        this.address = address_user;
        this.phone = phone_user;
    }
    People(String name_user, long phone_user){
        this.name = name_user;
        this.phone= phone_user;
    }
}