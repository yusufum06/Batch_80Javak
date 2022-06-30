package day05_matematikselIslemler;

import java.util.Scanner;

public class C03_Rakamlar_Toplami {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 4 basamakli sayi giriniz");
        int sayi= scan.nextInt();
        int birlerbasamagi=0;
        int rakamlarToplami=0;
        int ilkGirilenSayi=sayi;

        birlerbasamagi=sayi % 10;
        rakamlarToplami+= birlerbasamagi;
        sayi /=10;

        birlerbasamagi = sayi % 10;
        rakamlarToplami +=birlerbasamagi;
        sayi /=10;

        birlerbasamagi = sayi %10;
        rakamlarToplami += birlerbasamagi;
        sayi /=10;

        birlerbasamagi = sayi % 10;
        rakamlarToplami +=birlerbasamagi;
        sayi /=10;

        System.out.println(ilkGirilenSayi + " Sayinin rakamlar Toplami:" +rakamlarToplami);

    }
}
