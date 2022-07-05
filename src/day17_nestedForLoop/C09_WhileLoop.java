package day17_nestedForLoop;

import java.util.Scanner;

public class C09_WhileLoop {
    public static void main(String[] args) {
         /*
        Soru 6) Kullanicidan bir sifre girmesini isteyin.
        Asagidaki sartlari sagliyorsa “Sifre basari ile tanimlandi”,
        sartlari saglamazsa “Islem basarisiz,Lutfen yeni bir sifre girin” yazdirin
        ve basarili sifre girinceye kadar tekrar sifre girmesini isteyin
        - Ilk harf buyuk harf olmali
        - Son harf kucuk harf olmali
        - Sifre bosluk icermemeli
        - Sifre uzunlugu en az 8 karakter olmali
         */
        Scanner scan=new Scanner(System.in);

        String sifre="";
        boolean sifreBasarilimi=false;
        int kontrol=0;

        while (!sifreBasarilimi){
            System.out.println("Lutfen bir sifre giriniz");
            sifre=scan.nextLine();
            if (sifre.charAt(0)>='A' && sifre.charAt(0)<='Z'){
                kontrol++;
            }else{
                System.out.println("Lutfen ilk harfi buyuk harf olan bir sifre giriniz");
            }
            if (sifre.charAt(sifre.length()-1)>='a' && sifre.charAt(sifre.length()-1)<='z'){
                kontrol++;
            }else {
                System.out.println("Lutfen son ifadesi kucuk harf oln bir sifre giriniz");
            }
            if (sifre.contains(" ")){
                System.out.println("Lutfen icerisinbe bosluk olmayan bir sifre giriniz");
            }else {
              kontrol++  ;
            }
            if (sifre.length()>=8){
                kontrol++;
            }else {
                System.out.println("Lutfen en az 8 basamakli bir sifre giriniz");
            }
            if (kontrol==4){
                System.out.println("Sifreniz basari ile olusturulmustur");
                sifreBasarilimi=true;
            }else {
                kontrol=0;
            }

        }


    }
}
