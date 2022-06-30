package day01_ElifHoca;

import java.util.Scanner;

public class Q01_IfStatement01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen Y/N ikilisinden birini giriniz :");
        char karakter=scan.next().charAt(0);
        if (karakter=='Y' || karakter=='y'){
            System.out.println("Yes");

        } else if (karakter=='N'|| karakter=='n') {
            System.out.println("NO");

        }else System.out.println("Yanlis giris yaptiniz, Lutfen Y veya N ikilisinden birini tercih ediniz");
    }
}
