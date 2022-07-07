package day18_while_doWhileLoop;

public class C03_DoWhileLoop {
    public static void main(String[] args) {
        /*
        while loop da once kontrol edip sonra islem yapmamiz gerekiyor
         */

        int sayi=7;

        while (sayi<0){
            System.out.println(sayi);
            sayi++;

        }
        sayi=7;
        do{
            System.out.print(sayi);
            sayi++;
        }while (sayi<10);
    }
}
