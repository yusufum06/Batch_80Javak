package day01_SelbstMainMethod;

public class C01_MainMethod {
    public static void main(String[] args) {
        /* Input olarak verilen satis fiyati musteri karti var mi?
        ve uyeligi kac yillik ? bilgilerini degerlendirip
        -uye degilse :%5 indirim
        -uyeligi var ama 5 yildan az ise %10 indirim
        -uyeligi var ve 5 yildan cok ise %15 indirim uygulayip
        asil fiyati,indirim miktarini ve indirimli fiyati yazdiran bir method olusturun
         */

        boolean uyeMi=true;
        int uyeYili=3;
        double fiyat=250;
        indirmliSatis(uyeMi,uyeYili,fiyat);
    }

    private static void indirmliSatis(boolean uyeMi, int uyeYili, double fiyat) {
        if (uyeMi=true){
            if (uyeYili<5){System.out.println("Satis fiyati: "+fiyat);
                System.out.println("indirim miktari: "+ fiyat*0.1);
                System.out.println("Indirimli Satis: " +(fiyat-fiyat*0.1));

            }else {
                System.out.println("Satis fiyati: " + fiyat);
                System.out.println("indirim miktari: " + fiyat * 0.15);
                System.out.println("Indirimli Satis: " + (fiyat - fiyat * 0.15));
            }
        }else {
            System.out.println("Satis fiyati: " + fiyat);
            System.out.println("indirim miktari: " + fiyat * 0.05);
            System.out.println("Indirimli Satis: " + (fiyat - fiyat * 0.05));
        }


    }
}
