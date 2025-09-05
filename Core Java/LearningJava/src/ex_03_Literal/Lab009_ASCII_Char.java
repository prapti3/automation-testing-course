package ex_03_Literal;

public class Lab009_ASCII_Char {
    public static void main(String[] args) {
//        c programming was developed by english people hence
//        they have mapped each character with the number 0 -255

//        each charater and extra charaters ($,%,^ etc.) will have ASCII code
//        Unicode - univerisal code --> use '\u0041' - created by other peoples not english people


        char c1 = '\u1F60';
        char my_laugh_smily = '\u1f60';
        System.out.println(my_laugh_smily);
        System.out.println(c1);

    }
}
