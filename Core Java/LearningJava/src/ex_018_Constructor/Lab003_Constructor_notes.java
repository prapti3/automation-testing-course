package ex_018_Constructor;

public class Lab003_Constructor_notes {

    Person p = new Person("Prapti", 12);
    Person1 p1 = new Person1();
    Person2 p2 = new Person2();





}
//class
/*


* we can add
* 1. varaibles/instances
* 2. method
* 3. constructor  - not datatype required
* 4. block {}
*
*

* */

/*
* Constructor
*
* 1. no return type required - not even void
* 2. use this. keyword to tell that you are trying to access variable from current class
* 3. can give only variables not anything else
* 4. println can be added
* 5. call method from the parent class
* 6. object creation
* 7. business logic
* 8. this() or super() keyword
*
*
*
*
*
* */


/*
 *
 *
 *
 *
 *
 */

//1. initialize variables

class Person{
    String name;
    int age;

    Person(String n, int a){
        this.name = n;
        this.age = a;

        System.out.println(n+  "+" +  a);

    }


}

//2. Print / logs

class Person1{
    Person1(){
        System.out.println("This is person1");

    }
}


//3. method class

class Person2{
    Person2(){
        m1();
    }
    void m1(){
        System.out.println("This is method");
    }
}


//4. Object creation - initialization of resources
class Address{
    Address(String city){
        System.out.println("this is my city" + city);
    }
}
class Person3{
    Address addr;  // another class

    Person3() {
        addr = new Address("Mumbai"); // initialize an object
    }
}