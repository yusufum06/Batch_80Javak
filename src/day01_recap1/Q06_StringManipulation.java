package day01_recap1;

import java.util.Scanner;

public class Q06_StringManipulation {
    public static void main(String[] args) {
        //Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi
        // String manipulation method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("string1 : ");
        String str1= scan.nextLine();
        System.out.println("String2 : ");
        String str2=scan.nextLine();
        System.out.println("1.Yontem : " +str1+" " +str2);
        System.out.println("2.Yontem : "+str1.concat(" "+str2));

        String str1_0indextenSonra =str1.substring(1);
        String str2_0indextenSonra =str2.substring(1);
        System.out.println("Manipulationdan sonraki hali : "+ str1_0indextenSonra+ " "+str2_0indextenSonra);
    }
}
