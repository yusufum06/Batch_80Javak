package day16_forLoop;

import java.util.Scanner;

public class C04_forLoop {
    public static void main(String[] args) {
        //soru: Kullanicidan 100 den kucuk bir tam sayi isteyin.
        //1 den baslayarak girilen sayiya kadar tum sayilari yazdirin Ancak,
        //-Sayi 3ün kati ise sayi yerine "Java" yazdirin.
        //- sayi 5in kati ise sayi yerine "Guzeldir"yazdirin.
        //-sayi hem 3ün hemde 5 in kati ise sayi yerinr "Java Guzeldir" yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen 100 den kucuk bir tam sayi giriniz");
        int sayi=scan.nextInt();

        for (int i=1; i<=sayi; i++){

            if (i%3==0 && i%5==0){
                System.out.print("Java Guzeldir"+" ");
            } else if (i%3==0) {
                System.out.print("Java" +" ");

            } else if (i%5==0) {
                System.out.print("Guzeldir"+" ");

            }else {
                System.out.print(i+" ");
            }
        }
    }
}
