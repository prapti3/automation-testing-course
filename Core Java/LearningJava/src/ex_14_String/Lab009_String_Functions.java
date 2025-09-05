package ex_14_String;

public class Lab009_String_Functions {
    public static void main(String[] args) {

        String name = "Sonal";// 0,1,2,3,4
        System.out.println(name.length());
        System.out.println(name.charAt(3));
        System.out.println(name.charAt(0));
        System.out.println(name.charAt(4));
//        System.out.println(name.charAt(10)); // java.lang.StringIndexOutOfBoundsException

        System.out.println(name.concat(" Patel"));


//        3. Contains()

        System.out.println(name.contains("om"));

//        4. equals()
        System.out.println(name.equals("Sonal"));

//        5. equalsIgnoreCase
        System.out.println(name.equals("sonaL"));

//        6. indexOf() // sonal --> o
        System.out.println(name.indexOf('a'));

//        7. length()
        System.out.println(name.length());

//        8. replace()
        System.out.println(name.replace("a","m"));

//        9. split
       String name4 = "pramod@live.com@123";
       String[] split_name4 = name4.split("@");
       System.out.println(split_name4[0]);
       System.out.println(split_name4[1]);
       System.out.println(split_name4[2]);

// 10 . substring()
        System.out.println(name.substring(1,3));

//        11. toLowerCase
        System.out.println(name.toUpperCase());

//        12. toUpperCase
        System.out.println(name.toUpperCase());

//        13. startWith()
        System.out.println(name.startsWith("S"));

//        14. endsWith()
        System.out.println(name.endsWith("a"));

        String anotherPalindrome = "Niagara, 0 roar again!";
        System.out.println(anotherPalindrome.length());

        String extract = anotherPalindrome.substring(11,15);
        System.out.println(extract);

//        concat

        String s11 = "Hello";
        String s12 = "World";

        String s13 = "Ji";
        String result1 = s11 + s12 + s13;
        System.out.println(result1);

        String n = "PRamoddUTTA";
        System.out.println(n.indexOf('d'));
        System.out.println(n.lastIndexOf("d"));
        System.out.println(n.lastIndexOf("s"));

    }
}
