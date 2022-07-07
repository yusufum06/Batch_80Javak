package day18_while_doWhileLoop;

import java.util.Scanner;

public class C04_doWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayi = 0;
        while (sayi % 2 == 0) {
            System.out.println("Lutfen bir sayi giriniz");
            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift :" + sayi);
            } else {
                System.out.println("Girilen sayi tek , benden bu kkadar");
            }
        }
        do {
            System.out.println("Lutfen bir sayi giriniz");

            sayi = scan.nextInt();
            if (sayi % 2 == 0) {
                System.out.println("Girilen sayi cift :" + sayi);
            } else {
                System.out.println("Girilen sayi tek , benden bu kkadar");
            }
        }
            while (sayi % 2 == 0) ;
        }
    }
