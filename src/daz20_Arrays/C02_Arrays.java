package daz20_Arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {
        int sayilar []=new int[3];
        System.out.println(sayilar);

        System.out.println(Arrays.toString(sayilar));
        sayilar[2]=10;
        sayilar[0]=5;
        sayilar[1]=3;
        System.out.println(Arrays.toString(sayilar));
        String sinifList[]={"Ali","Ayse","Ahmet"};
        sinifList[1]="Hasan";
        System.out.println(Arrays.toString(sinifList));


    }

}
