package day10_stringManipulation;

import java.util.Locale;

public class C04_contains {
    public static void main(String[] args) {
        //Soru 2) Kullanicidan bir cumle isteyin. Cumle “buyuk” kelimesi iceriyorsa tum cumleyi buyuk harf olarak,
        // “kucuk” kelimesi iceriyorsa tum cumleyi kucuk harf olarak yazdirin,
        // iki kelimeyi de icermiyorsa “Cumle kucuk yada buyuk kelimesi icermiyor” yazdirin.
        String cumle="Java buyuk dunya kucucuk";
        cumle=cumle.toLowerCase();

        if (cumle.contains("kucuk") && cumle.contains("buyuk")){
            System.out.println("Karar ver buyuk mu kucuk mu kullanalim");
        } else if (cumle.contains("kucuk")) {
            System.out.println(cumle.toLowerCase());

        } else if (cumle.contains("buyuk")) {
            System.out.println(cumle.toLowerCase());

        }
        else {
            System.out.println("Cumle kucuk yada buyuk kelimesi icermiyor");
        }


    }
}
