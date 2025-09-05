package ex_09_Switch;

import java.util.Scanner;

public class Lab003_Real_Switch_automation{
    public static void main(String[] args){
        //web automation
        // i will ask the user to give me the input from browser which he wants to use
        // use to i will start the automation in the browser

//        String Browser  = args[0];
//        System.out.println(browser);

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the browser, Which you want to start!! ");
        String browser = sc.next();
        browser = browser.toUpperCase();


        switch (browser){
            case "CHROME":
                System.out.println("Starting the chrome browser");
                System.out.println("..............");
                System.out.println("TC1");
                System.out.print("TC2");
                System.out.print("TC3");
                break;
            case "FIREFOX":
                System.out.println("Starting the firefox browser");
                System.out.print("..............");
                System.out.println("TC1");
                //Further code to start the firefox
                //Webdriver driver = new Firefox(); // selenium code
                break;
            case "EDGE":
                System.out.println("Starting the edge browser");
            default:
                System.out.println("I have no idea which browser is this !!!!");
                break;

        }
    }
}
