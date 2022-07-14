package day21_Arrays;

import java.util.Arrays;

public class C09_binarySeach {
    public static void main(String[] args) {
        /*
        binarysearch metodu siralanmis array de elementin indexini buldurur
        Ya aradigimiy element array de yoksa?
        String de indexof()
         */
        int[] sayilar={1,3,4,7,0,2,5};
        Arrays.sort(sayilar);
        System.out.println(Arrays.toString(sayilar));
        System.out.println(Arrays.binarySearch(sayilar,1));

        System.out.println(Arrays.binarySearch(sayilar,5));

        System.out.println(Arrays.binarySearch(sayilar,10));

        System.out.println(Arrays.binarySearch(sayilar,6));

        System.out.println(Arrays.binarySearch(sayilar,-100));
    }
}
