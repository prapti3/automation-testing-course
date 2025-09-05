package ex_14_String;

public class Lab002_String_Creation {
    public static void main(String[] args) {
//        String 2 ways
        String s1 = "pramod"; //SCP
        String s2 = "pramod";
        String s3 = new String("pramod"); // QA - Object Area

        System.out.println(s1 == s2);   // true (both refer to same SCP object)
        System.out.println(s1 == s3);   // false (s3 is in Heap)
        System.out.println(s1.equals(s3));   // true (content is same)
    }
}
