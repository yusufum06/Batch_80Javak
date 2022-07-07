package day01_SelbstMainMethod;

import java.util.Scanner;

public class kontrrol {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String sifre;
        boolean sifreBasariliMi = false;
        int kucukMu = 0;
        int buyukMu = 0;
        String ozelMi = "";
        int kontrol = 0;
        while (!sifreBasariliMi) {
            System.out.println("Lutfen bir sifre giriniz");
            sifre = scan.nextLine();
            for (int i = 0; i < sifre.length(); i++) {
                if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <= 'z') {
                } else {
                    kucukMu++;
                }
            }
            if (kucukMu == sifre.length()) {
                System.out.println("Sifre kucuk harf icermiyor");
            } else {
                kontrol++;
            }
            for (int i = 0; i < sifre.length(); i++) {
                if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                } else {
                    buyukMu++;
                }
            }
            if (buyukMu == sifre.length()) {
                System.out.println("Sifre buyuk harf icermiyor");
            } else {
                kontrol++;
            }
            ozelMi = sifre.replaceAll("\\w", "");
            if (ozelMi.isEmpty()) {
                System.out.println("Sifre ozel karakter icermiyor");
            } else {
                kontrol++;
            }
            if (sifre.length() >= 8) {
                kontrol++;
            } else {
                System.out.println("Sifre en az 8 karakter olmali");
            }
            if (kontrol == 4) {
                System.out.println("Sifre basari ile tanimlandi");
                sifreBasariliMi = true;
            } else {
                kontrol = 0;
            }
        }

    }
}

