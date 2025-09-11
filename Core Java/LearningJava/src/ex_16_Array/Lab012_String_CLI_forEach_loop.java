package ex_16_Array;

public class Lab012_String_CLI_forEach_loop {
    public static void maim(String[] pramod){

        for(int i=0;i<pramod.length;i++){
            System.out.println(pramod[i]);

        }

        System.out.println("-----");

        for(String arg:pramod){
            System.out.println(arg);
        }

    }
}
