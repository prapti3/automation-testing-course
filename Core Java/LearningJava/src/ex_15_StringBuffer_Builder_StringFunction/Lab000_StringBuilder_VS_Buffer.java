package ex_15_StringBuffer_Builder_StringFunction;

public class Lab000_StringBuilder_VS_Buffer {
    public static void main(String[] args) {
        String s0 = "Pramod";
        String s1 = new String("Pramod");

        StringBuffer stringBuffer = new StringBuffer("Pramod");
        StringBuilder stringBuilder = new StringBuilder("Pramod");


        System.out.println(s0);
        System.out.println(s1);
        System.out.println(stringBuffer);
        System.out.println(stringBuilder);


    }
}



// https://www.geeksforgeeks.org/java/string-vs-stringbuilder-vs-stringbuffer-in-java/

/**
* String: Immutable, meaning its value cannot be changed once created. It is thread-safe but less memory-efficient.
* StringBuilder: Mutable, not thread-safe, and more memory-efficient compared to String. Best used for single-threaded operations.
* StringBuffer: Mutable and thread-safe due to synchronization, but less efficient than StringBuilder in terms of performance

 */