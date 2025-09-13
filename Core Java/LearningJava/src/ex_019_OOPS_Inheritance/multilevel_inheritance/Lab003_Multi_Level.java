package ex_019_OOPS_Inheritance.multilevel_inheritance;

public class Lab003_Multi_Level {
    public static void main(String[] args) {

//        Son s1 = new Father();
//        Son s1 = new GrandFather();
        Son amit = new Son();
        System.out.println(amit.gold_gf);
        amit.gf();

        GrandFather grandFather = new Son();
        grandFather.home();

    }
}
