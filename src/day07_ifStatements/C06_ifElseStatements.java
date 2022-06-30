package day07_ifStatements;

import java.util.Scanner;

public class C06_ifElseStatements {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen yasinizi giriniz");
        int yas=scan.nextInt();
        if (yas<65){
            System.out.println("Emekli olamazsin " +(65-yas)+ " yil daha calismalisin");
        } else {
            System.out.println("Emekli olabilirsin");

        }
    }
}
