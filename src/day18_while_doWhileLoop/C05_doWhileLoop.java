package day18_while_doWhileLoop;

public class C05_doWhileLoop {
    public static void main(String[] args) {
        /*
9'dan 190'a kadar 7^nin kati olan tum tam sayilari ekrana yazdiriniz
 */
        int bas=9;
        int bitis=190;
        int temp=bas;
        while (temp<bitis){
            if (temp%7==0){
                System.out.print(temp+" ");
            }
            temp++;
        }
    }
}
