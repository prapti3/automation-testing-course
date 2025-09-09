package ex_16_Array;

public class Lab006_Min_Max_Num {
    public static void main(String[] args) {

        int[] array = {1, 3, 5, 44, 6, 3, 0, 5, 7, 88,-1};
        int max_output = give_me_max(array);
        int min_output = give_me_min(array);
        System.out.println(max_output );
        System.out.println(min_output );


    }
        static int give_me_max ( int[] array){
            int max = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] > max) {
                    max = array[i];
                }

            }
            return max;
        }

        static int give_me_min ( int[] array){
            int min = array[0];
            for (int i = 0; i < array.length; i++) {
                if (array[i] < min) {
                    min = array[i];
                }
            }
            return min;
        }


    }

