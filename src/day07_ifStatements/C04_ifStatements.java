package day07_ifStatements;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi giriniz");
        String girilenGun=scan.next().toLowerCase();
        if (girilenGun.equals("pazar") || girilenGun.equals("cumartesi")){
            System.out.println("Girilen gun hafta sonu");}
        if (girilenGun.equals("pazartesi")|| girilenGun.equals("sali") || girilenGun.equals("carsamba")
                || girilenGun.equals("persembe") || girilenGun.equals("cuma")){System.out.println("Girilen hafta ici");}

    }
}
