package day02_ElifHoca;

import java.util.Scanner;

public class Q07_BmiSiniflandirma {
    /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm)
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        double boy=scan.nextDouble()/100;

        System.out.println("Kilonuzu kilogram olarak giriniz");
        double kilo=scan.nextDouble();

        double bmi=kilo/(boy*boy);
        if (bmi<=20){
            System.out.println("oldukca zayifsiniz");
        } else if (bmi<=25) {
            System.out.println("Normal sinirlardasiniz");

        } else if (bmi<=30) {
            System.out.println("Sisman katogarisiniz");

        }else System.out.println("Obez grubunuzdasiniz");

    }
}
