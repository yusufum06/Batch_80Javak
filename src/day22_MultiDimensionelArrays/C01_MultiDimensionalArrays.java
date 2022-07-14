package day22_MultiDimensionelArrays;

import java.util.Arrays;

public class C01_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] sayilar={{1,2,4,5},{3,4}};
        System.out.println(Arrays.toString(sayilar[0]));
        System.out.println(sayilar[0][1]);

        System.out.println(Arrays.deepToString(sayilar));
    }
}
