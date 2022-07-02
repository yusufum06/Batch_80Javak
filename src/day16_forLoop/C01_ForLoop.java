package day16_forLoop;

public class C01_ForLoop {
    public static void main(String[] args) {
        //verilen bir pozitif sayinin tam bolenlerini yazdiralim
        int input = 20; //1,2,4,5,10,20
        int i;
        for (i = 1; i <= input; i++) {
            if (input % i == 0) {
                System.out.println(i + " ");
            }
        }
    }
}