package ex_018_Constructor;

public class Lab001_OOPs_Constructor {
    public static void main(String[] args) {
        Baby b1 = new Baby();
    }

}


class Baby{
//    Attribute | Instance variable | Member variable, data memebers

//    DEfault constructor
    Baby(){
        System.out.println("I am called, Default constructor");
        System.out.println("Your Aadhar number is ready");

//        fetch data from MYSQL database.....
//        Read from CSV file, XLSX
//        Open a file and read the data (json, testdata.xlsx, txt file)

        String name;
        int age;

    }

    void m1(){
        System.out.println("I m1");
    }


//    Behaviour

    void cry(){
        System.out.println("Cry!!!");
    }
    void sleep(){
        System.out.println("Sleep!!!");
    }
    void eat(){
        System.out.println("Eat!!!");
    }

}





