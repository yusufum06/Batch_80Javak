package day11_stringManipulation;

import java.util.Scanner;

public class C03_contains {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen e-Mail adresinizi yaziniz");
        String email=scan.nextLine();
        if (!email.contains("@gmail")){
            System.out.println("Lutfen gmail adresi giriniz");
        } else if (email.lastIndexOf("@gmail.com")==(email.length()-10)) {
            System.out.println("Email adresiniz kaydedilmistir");

        } else {
            System.out.println("Lutfen yazimi kontrol ediniz");
        }

        }

    }

