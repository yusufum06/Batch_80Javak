package day10_stringManipulation;

public class C05_lengt {
    public static void main(String[] args) {
        String str="Java ogren, isi kap";
        System.out.println(str.length());
        System.out.println(str.charAt(str.length()-1));
        System.out.println(str.charAt(str.length()-3));

        String str2=""; //str2 ye deger atanmistir
        System.out.println(str2.length());

        String str3=null;//str3 e deger atanmamistir
        System.out.println(str3.length());
    }
}
