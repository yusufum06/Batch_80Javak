package day21_Arrays;

public class C01_Array_Maksimumfinden {
    public static void main(String[] args) {
       /*
        Soru 1- Verilen bir int array’deki en buyuk sayiyi yazdiran bir method olusturun.
        */
        int[] sayilar={3,5,7,9,5,2};

        maxSayiyiYazdir(sayilar);


    }
    public static void maxSayiyiYazdir(int[] sayilar ){
        int maxSayi=sayilar[0];
        for(int i=0;i<sayilar.length;i++){
            if (sayilar[i]>maxSayi){
                maxSayi=sayilar[i];
            }
        }
        System.out.println("Arraydeki en buyuk sayi: "+maxSayi);
    }
}
