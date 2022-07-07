package day01_SelbstMainMethod;

import java.util.Scanner;

public class C03_do_WhileLoop {
    public static void main(String[] args) {
        /*
        Kullanicidan bir sifre girmesini isteyin.Girilen sifreyi asagidaki sartlara gore kontrol edin ve
        sifredeki hatalari yazdirin. Kullanici gecerli bir sifre girincee kadar bu islemi tekrar edin ve
        gecerli sifre girildiginde "sifreniz Kabul edilmistir" yazdirin.
        -Sifre kucuk harf icermelidir
        -Sifre buyuk harf icermelidir
        -Sifre ozel karekter icermelidir
        -sifre enaz 8 karekter olmalidir.
         */
        Scanner scan=new Scanner(System.in);
        String sifre="";
        int sayac=0;


        while (sayac!=4){
            System.out.println("Lutfen bir sifre giriniz");
             sifre=scan.nextLine();
            int kontrol=0;
            int kontrola=0;
            int kontrolb=0;
            int i=0;


        do {

            if (sifre.charAt(i)>='a' && sifre.charAt(i)<='z'){
                kontrol++;

            }
            if (sifre.charAt(i)>='A' && sifre.charAt(i)<='Z'){
                kontrola++;
            }
            if (!(sifre.charAt(i)>='A' && sifre.charAt(i)<='Z' || sifre.charAt(i)>='a' && sifre.charAt(i)<='z' ||
            sifre.charAt(i)>='0' && sifre.charAt(i)<='9')){
            kontrolb++;
        }
            i++;

        }while (i<sifre.length());

        if (kontrol==0){
            System.out.println("Sifreniz kucuk harf icermelidir");
        }else {
            sayac++;
        }
        if (kontrola==0){
            System.out.println("Sifreniz buyuk harf icermelidir");
        }else{
            sayac++;
        }
        if (kontrolb==0){
            System.out.println("Sifreniz ozel karekter icermelidir");

        }else{
            sayac++;
        }if (sifre.length()<8){
                System.out.println("Sifre en az 8 karekter olmalidir");
            }else{
            sayac++;
            }
        if (sayac==4){
            System.out.println("Sifre basarili");
        }else {
            sayac++;
        }

        }

    }
}
