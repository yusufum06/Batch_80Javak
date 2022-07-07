package day18_while_doWhileLoop;

import java.util.Scanner;

public class C06_doWhileLoop {
    public static void main(String[] args) {
        /*
        Soru 4) Kullanicidan toplamak uzere pozitif sayilar isteyin,
         islemi bitirmek icin 0’a basmasini soyleyin.
    Kullanici yanlislikla negative sayi girerse o sayiyi dikkate almayin ve
    “Negatif sayi giremezsiniz” yazdirip basa donun
    Kullanici 0’a bastiginda toplam kac pozitif sayi girdigini,
    yanlislikla kac negative sayi girdigini ve girdigi pozitif
    sayilarin toplaminin kac oldugunu yazdirin.
         */
        Scanner scan=new Scanner(System.in);
        int sayi=0;
        int pozSayiAdeti=0;
        int negSayiAdeti=0;
        int pozSayilarTop=0;
        do{
            System.out.println("LutfenToplamak icin tamsayi giriniz");
            sayi=scan.nextInt();
            if (sayi>0){
                pozSayilarTop+=sayi;
                pozSayiAdeti++;
            } else if (sayi<0) {
                negSayiAdeti++;
                System.out.println("Negatif sayi giremezsiniz");
            }
        }while (sayi!=0);
        System.out.println(pozSayiAdeti + " adet pozitif sayi giriniz, toplamlari : " + pozSayilarTop);
        System.out.println(negSayiAdeti + " adet negatif sayi girdiniz ancak onlar toplama dahil edilmedi");
    }
}
