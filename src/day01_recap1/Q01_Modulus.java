package day01_recap1;

import java.util.Scanner;

public class Q01_Modulus {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 5 basamakli sayi giriniz");
        int num=scan.nextInt();
        int ilkIki=num/1000;
        int sonIki=num%100;
    }
}
