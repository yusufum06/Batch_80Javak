package day26_costructor;

public class ogretmenRunner {
    public static void main(String[] args) {
        ogretmen ogretmen1=new ogretmen();

        System.out.println("ogretmen 1 "+ ogretmen1);

        ogretmen ogretmen2=new ogretmen("Emre","Akdogan","1/1/2001"
                );
        System.out.println("ogretmen 2"+ogretmen2);

    }
}
