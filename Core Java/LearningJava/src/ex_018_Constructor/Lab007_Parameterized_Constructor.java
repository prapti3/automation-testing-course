package ex_018_Constructor;

public class Lab007_Parameterized_Constructor {
    public static void main(String[] args) {


        BabyA b1 = new BabyA();
        BabyA b2 = new BabyA();
        System.out.println(b1.name);
        System.out.println(b2.name);

        BabyA b3  = new BabyA("lucky","23454323",2025,07,01);
        BabyA b4  = new BabyA("amit","13454323",2024,07,01);
        System.out.println(b3.name);
        System.out.println(b4.name);


    }

}

class BabyA{
    String name;
    String adhar_num;
    int year;
    int month;
    int day;

//    DC
    BabyA(){
        name = "guru";
        adhar_num = "00000";
        year = 1971;
        month = 02;
        day = 01;

    }
    BabyA(String name_user,String aadhar_number_user,int year_user, int month_user,int day_user){
        this.name = name_user;
        this.adhar_num = aadhar_number_user;
        this.year = year_user;
        this.month = month_user;
        this.day = day_user;


    }
}