package day16_forLoop;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {
        /*
        Soru 10 ) Kullanicidan iki sayi isteyin.
        Girilen sayilar ve aralarindaki tum tamsayilari toplayip,
        sonucu yazdiran bir method yaziniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        double say1=scan.nextDouble();
        System.out.println("Lutfen ikinci bir sayi giriniz");
        double say2=scan.nextDouble();
        ikiSayiToplami(say1,say2);


    }

    public static void ikiSayiToplami(double say1, double say2) {
        int sayilarinToplami=0;
        if (say1<=say2){
            for (double i=say1; i<=say2;i++){
                sayilarinToplami+=i;
            }
        }else {
            for(double j=say2; j<say1; j++){
                 sayilarinToplami+=j;
            }
        }
        System.out.println("Aralardaki sayilarin Toplami: "+sayilarinToplami);

    }
}
