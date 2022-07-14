package day21_Arrays;

import java.util.Arrays;

public class C05_Arrays {
    public static void main(String[] args) {
        /*
        Soru 5- Verilen bir array’e yeni bir element ekleyen method olusturun
         */
        String[] sinifList={"Ali Can","Nida Yucedal"};
        String eknacakIsim="Murat Babayigit";
        sinifList=elemanEkle(sinifList,eknacakIsim);
        System.out.println(Arrays.toString(sinifList));
    }

    public static String[] elemanEkle(String[] sinifList, String eknacakIsim) {
        String[] yeniSinifListesi= new String[sinifList.length+1];

        for(int i=0;i< sinifList.length;i++){
            yeniSinifListesi[i]=sinifList[i];
        }
        yeniSinifListesi[yeniSinifListesi.length-1]=eknacakIsim;

        return yeniSinifListesi;
    }
}
