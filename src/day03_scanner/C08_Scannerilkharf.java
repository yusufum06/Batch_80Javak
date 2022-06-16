package day03_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C08_Scannerilkharf {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        char ilkHarf=scan.next().toLowerCase().charAt(0);
        System.out.println("Ismin ilk harfi:"+ilkHarf);

    }
}
