package day02_ElifHoca;

import java.util.Scanner;

public class Q11_SwitchCase {
    // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int birlerbasamagi = sayi % 10;
        int onlarbasamagi = (sayi / 10) % 10;
        int yuzlerbasamagi = sayi / 100;

        if (sayi > 99 && sayi < 1000) {
            switch (yuzlerbasamagi) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("yuz\t");
                    break;
                case 2:
                    System.out.println("ikiyuz\t");
                    break;
                case 3:
                    System.out.println("ucyuz\t");
                    break;
                case 4:
                    System.out.println("dortyuz\t");
                    break;
                case 5:
                    System.out.println("besyuz\t");
                    break;
                case 6:
                    System.out.println("altiyuz\t");
                    break;
                case 7:
                    System.out.println("yediyuz\t");
                    break;
                case 8:
                    System.out.println("sekizyuz\t");
                    break;
                case 9:
                    System.out.println("dokuzyuz\t");
                    break;

            }
            switch (onlarbasamagi) {

                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("on\t");
                    break;
                case 2:
                    System.out.println("yirmi\t");
                    break;
                case 3:
                    System.out.println("otuz\t");
                    break;
                case 4:
                    System.out.println("kirk\t");
                    break;
                case 5:
                    System.out.println("elli\t");
                    break;
                case 6:
                    System.out.println("altmis\t");
                    break;
                case 7:
                    System.out.println("yetmis\t");
                    break;
                case 8:
                    System.out.println("seksen\t");
                    break;
                case 9:
                    System.out.println("doksan\t");
                    break;

            }
            switch (birlerbasamagi) {
                case 0:
                    System.out.println("");
                    break;
                case 1:
                    System.out.println("bir\t");
                    break;
                case 2:
                    System.out.println("iki\t");
                    break;
                case 3:
                    System.out.println("uc\t");
                    break;
                case 4:
                    System.out.println("dort\t");
                    break;
                case 5:
                    System.out.println("bes\t");
                    break;
                case 6:
                    System.out.println("alti\t");
                    break;
                case 7:
                    System.out.println("yedi\t");
                    break;
                case 8:
                    System.out.println("sekiz\t");
                    break;
                case 9:
                    System.out.println("dokuz\t");
                    break;
            }
        }


    }
}
