package ex_20_Polymorphism.methodoveriding;

import ex_018_Constructor.CommonToAll;

public class Lab002_Methodoverriding_Automation {
    public static void main(String[] args) {
        ChromeTC c1 = new ChromeTC();
        c1.openBrowser();

        Firefox f1 = new Firefox();
        f1.openBrowser();

        CommonToAll2 commonToAll = new CommonToAll2();
        commonToAll.openBrowser();

//        Dynamic dispatch
        CommonToAll2 c2 = new ChromeTC();
        c2.openBrowser();

        CommonToAll2 c3 = new Firefox();
        c3.openBrowser();

//        Firefox ff = new ChromeTC(); not relation


    }
}
class CommonToAll2{
    void openBrowser(){
        System.out.println("Starting IE Browser!!");
    }
}

class ChromeTC extends CommonToAll2{

    @Override
    void openBrowser(){
        System.out.println("Starting Chrome Browser!!");
    }

}

class Firefox extends CommonToAll2{
    @Override
    void openBrowser(){
        System.out.println("Firefox will start!");
    }
}