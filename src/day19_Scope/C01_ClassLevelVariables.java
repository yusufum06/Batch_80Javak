package day19_Scope;

public class C01_ClassLevelVariables {
    static int staticSayi=10;
    String isim="mehmet";

    static int degersizStaticVar;

    public static void main(String[] args) {
        /*
        bir variable static olusturulduysa
        objeler icin degil class icin gecerlidir.
         */
        System.out.println(staticSayi);
        staticSayi=12;
        System.out.println(staticSayi);

    }
    public static void staticMethod(){
        System.out.println(staticSayi);
    }
    public void staticolmayanMethod(){
        System.out.println(staticSayi);
    }
}
