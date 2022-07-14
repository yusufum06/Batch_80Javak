package day21_Arrays;

import java.util.Arrays;

public class C08_binarySearch {
    public static void main(String[] args) {
        /*
        Binary search java da elemen aramanin kisa yoludur Ancakbinary search
        un calismasi
         */
        String[] harfler={"Y","G","D","O","A"};
        String arananHarf="D";
        Arrays.sort(harfler);
        System.out.println(Arrays.toString(harfler));
        System.out.println(Arrays.binarySearch(harfler,arananHarf));

    }
}
