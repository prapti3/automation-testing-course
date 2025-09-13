//package ex_24_OOPs_Abstraction_Abstract_Class;
//
//public class Lab001_Abstraction {
//    public static void main(String[] args) {
//
//        Car c1 = new Car();
//        // Father f1 = new Father(); // This is abstract in nature.
//        Child  child = new Child();
//        Father  f2 = new Child(); // Dynamic Dispatch.
//        child.loan50K();
//
//    }
//
//}
//
//
//class Car{
////    this is concreate class
////    this doesnt have the abstract methods
//
//    void done(){
//
//    }
//}
//
//abstract class Father{
////    this is called the abstract function
//    abstract void loan50K();
//
////    as a complete function
//    void loan25K(){
//        System.out.println("Given the 25k");
//    }
//}
//
//class Child extends Father {
//
//    @Override
//    void laon50K() {
//        System.out.println("Son has to give the 50k Loan");
//    }
//}
//
