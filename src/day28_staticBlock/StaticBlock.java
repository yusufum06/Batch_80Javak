package day28_staticBlock;

public class StaticBlock {
    static int sayi;
    static {
        System.out.println("static block calisti");
        sayi=10;


    }

    public static void main(String[] args) {
        System.out.println("Main method calisti");
        System.out.println(sayi);
    }
    static {
        System.out.println("main in altindaki static calisti" );
    }
}
