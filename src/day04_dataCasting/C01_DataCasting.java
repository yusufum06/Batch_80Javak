package day04_dataCasting;

public class C01_DataCasting {
    public static void main(String[] args) {
        char harf='a';
        char yeniHarf= (char)(harf+1);

        System.out.println(yeniHarf);
        int sayi1=(int)7.3;
        double sayi2=10;
        System.out.println("Sayi2:"+sayi2);
        int sayi3='c';
        System.out.println("Sayi3:"+sayi3);
    }
}
