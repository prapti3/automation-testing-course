package ex_16_Array;

public class Lab002_Static_Arrays {
    public static void main(String[] args){
        int[] a = new int[3];
        a[0] = 4;
        a[1] = 3;
        a[2] = 5;

        System.out.println(a[1]);

        String[] str = new String[4];
        str[0] ="Hello";
        str[1] = "Prapti";
        str[2] = "Lucky";
        str[3] = "Mohit";

        System.out.println(str.length);
        System.out.println(str[0] +" "+  str[1] + " " + str[2] );


        for(int i =0; i< a.length;i++){
            System.out.println(a[i]);

        }

        for(int i =0; i< str.length;i++){
            System.out.println(str[i]);

        }


        boolean[] is_male_data = new boolean[2];
        is_male_data[0] = true;
        is_male_data[1] = false;



    }
}
