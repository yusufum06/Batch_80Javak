package day17_nestedForLoop;

import java.util.Scanner;

public class C08_WhileLoop {
    public static void main(String[] args) {
        /*
        kullanicidan toplanmak uzere sayilar alin sayilarin
        toplami 500 u gecince sayilarin toplami ve
        ksc sayi toplsandigini su sekilde yazdirin
        13 sayi girdiniz ve toplami 567
         */
        int toplam=0;
        int sayi=0;
        int sayac=1;
        Scanner scan=new Scanner(System.in);
        while (toplam<500){
            System.out.println("Lutfen toplamak icin sayi giriniz");
            sayi=scan.nextInt();
            toplam+=sayi;
            sayac++;

        }
        System.out.println(sayac +" sayi girdiniz ve toplami "+toplam);
    }
}
