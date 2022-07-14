package day21_Arrays;

import java.util.Arrays;

public class C10_split {
    public static void main(String[] args) {
        /*
        split() metodu bir array metodu degil string metodudur ama aaray dondurdugu
        icin bu konuda anlatiyoruz
         */
        String str="Java ne kadar guzel";
       String[] kelimeler= str.split(" ");
        System.out.println(Arrays.toString(kelimeler));
    }
}
