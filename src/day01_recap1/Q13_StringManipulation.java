package day01_recap1;

import java.util.Scanner;

public class Q13_StringManipulation {
    public static void main(String[] args) {
        // Kullanicidan isim ve soyismini girmesini isteyin ve hangisinin daha uzun oldugunu yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi ve soyisminizi giriniz :\nisim");

        String isim=scan.next();
        System.out.println("soyisim");

        String soyisim=scan.next();
        if (isim.length()>soyisim.length()){
            System.out.println("Isminiz soyisminizden daha uzundur");
        }else if (isim.length()==soyisim.length()){
            System.out.println("isminiz soyisminizle esittir");

        }else System.out.println("Soyisminiz isminizden uzundur" );
    }
}
