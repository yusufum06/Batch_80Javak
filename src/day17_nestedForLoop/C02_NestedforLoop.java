package day17_nestedForLoop;

public class C02_NestedforLoop {
    //verilen sayiya gore carpim tablosu olusturun


    public static void main(String[] args) {
        for (int i=1;i<=3;i++){
            for (int j=1;j<=3;j++){
                System.out.print(i*j+ "");
            }
            System.out.print("");
        }
    }
}
