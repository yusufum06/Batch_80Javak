package day14_methodCreation;

import java.util.Scanner;

public class C05_MethodCreationReturn {
    public static void main(String[] args) {
       String sehir= sehirAl();
      String tarih=  tarihAl();

        System.out.println("Girdiginiz sehir: "+ sehir);
        System.out.println("Girdiginiz tarih : " + tarih);
    }

    public static String sehirAl() {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sehir ismi giriniz");
        String sehir=scan.next().toUpperCase();
        return sehir;
    }

    public static String tarihAl() {
        String tarih=" ";
        Scanner scan=new Scanner(System.in);
        System.out.println("Yil giriniz");
        int yil=scan.nextInt();
        if(yil>1900 && yil<2100){
            tarih=yil+"-";
        }else {
            System.out.println("yil icin gecerli bir sayi yazmalisiniz");
        }
        System.out.println("Kacinci ay oldugunu tam sayi olarak yaziniz");
        int ay=scan.nextInt();
        if (ay<0 || ay>12){
            System.out.println("Ay no 1-12 arasinda olabilir");
        } else if (ay<10) {
            tarih=tarih+"0"+ay+"-";

        }else {
            tarih=tarih+ay+"-";
        }
        System.out.println("Lutfen ayin kacinci gunu oldugunu tamsayi olarak giriniz");
        int gun=scan.nextInt();
        if (gun<=0 || gun>30){
            System.out.println("Lutfen 1- 30 arasinda bir sayi giriniz");

        } else if (gun<10) {
            tarih=tarih+"0"+gun;

        }else {
            tarih=tarih+gun;
        }
        return tarih;
    }

}
