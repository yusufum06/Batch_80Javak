package day01_recap1;

import java.util.Scanner;

public class Q12_StringManipulation {
    public static void main(String[] args) {
        /*
      Kullanicidan bir kelime girmesini isteyin.
       * Sozcukte tek sayida karakter ve 3 veya daha fazla karakter iceriyorsa,
       * kelimenin ortasindaki karakteri yazdirin.
       */
        Scanner scan=new Scanner(System.in);
        System.out.println("Bir kelime giriniz");
        String str=scan.nextLine();

        char ortancaKarekter=str.charAt((str.length()-1)/2);

        if (str.length()%2==1 && str.length()>=3){
            System.out.println("ortanca karekter : "+ ortancaKarekter);
        }else System.out.println("lutfen ortanca harfi olan bir kelime giriniz");
    }
}
