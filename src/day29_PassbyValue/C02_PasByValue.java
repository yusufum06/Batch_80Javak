package day29_PassbyValue;

import java.util.Arrays;
import java.util.Random;

public class C02_PasByValue {
    /*
    verilen 4 elemenli arr i methoda gonderelim method da yeni 3 elemenli
     bir array atayip bu yeni arrye rasgele 100 den kucuk 3 sayi atayalim method da array i yazdiralim
    main method da
     */
    public static void main(String[] args) {
        int[] arr={3,5,8,10};
        arrayiDegistir(arr);
        System.out.println("methoddan once :"+ Arrays.toString(arr));
    }

    public static void arrayiDegistir(int[] arr) {
        arr=new int[3];
        Random rnd=new Random();
        arr[0]= rnd.nextInt(100);
        arr[1]= rnd.nextInt(100);
        arr[2]= rnd.nextInt(100);
        System.out.println("methoddan sonra :"+ Arrays.toString(arr));
    }
}
