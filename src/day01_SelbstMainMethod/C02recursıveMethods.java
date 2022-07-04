package day01_SelbstMainMethod;

public class C02recursıveMethods {
    public static void main(String[] args) {
        int input=6;
        int sonuc=topla(input);
        System.out.println(sonuc);

    }

    private static int topla(int input) {
        if (input==1){
            return 1;
        }else {
            return input+topla(input-1);
        }
    }
}
