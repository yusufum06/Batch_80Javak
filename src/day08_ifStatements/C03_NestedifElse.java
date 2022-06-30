package day08_ifStatements;

import java.util.Scanner;

public class C03_NestedifElse {
    public static void main(String[] args) {
        /* emeklilik kontrolu yapan bir program yaziniz
cinsiyet olarak E (ERKEK) veya K (KADIN) degiskenlerini kabul etsin
farkli bir harf veya sembol girilirse hata mesajı versin

emeklilik icin kadinlarda yas siniri 60
erkeklerde 65 olsun
negatif yas veya 80'den buyuk yas girilirse hata mesaji versin
 */
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen cinsiyetinizi giriniz Erkek icin E kadin icin K harfi giriniz");
        char cinsiyet=scan.next().toUpperCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        double yas=scan.nextDouble();
        if (cinsiyet=='E') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 65) {
                System.out.println("emekli olamazsaniz");
            } else {
                System.out.println("emekli olabilirsiniz");
            }
        }
         else if (cinsiyet=='K') {
            if (yas < 0 || yas > 80) {
                System.out.println("gecerli yas giriniz");
            } else if (yas < 60) {
                System.out.println("emekli olamazsaniz");
            } else {
                System.out.println("emekli olabilirsiniz");
            }
        }
         else {
            System.out.println("Lutfen gevcerli bir tercih giriniz");
         }


    }
}
