package day01_SelbstMainMethod;

public class C05_CarpimTablosu {
    public static void main(String[] args) {
        /*
        --belirlenen sayının 1 den 10 a kadar çarpım sonuçlarını yapan Java programını yazınız
         */
        int input=5;

        for (int i=1;i<=10;i++){
            int carpim=i*input;
            System.out.println(input+"x"+i + "=" +carpim);
        }
    }
}
