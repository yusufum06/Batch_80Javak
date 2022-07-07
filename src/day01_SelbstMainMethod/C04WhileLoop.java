package day01_SelbstMainMethod;

public class C04WhileLoop {
    public static void main(String[] args) {
       char bas='b';
       char bitis='l';
       char temp=bas;
       String buyult="";

       while (bas<=bitis){
           buyult=(temp+"").toUpperCase();

               System.out.print(buyult+ " ");

           temp++;
       }
    }
}
