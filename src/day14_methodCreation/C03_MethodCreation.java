package day14_methodCreation;

public class C03_MethodCreation {
    public static void main(String[] args) {
        String isim="Enes";

        String soyisim="Bozkurt";
        isimGizle(isim,soyisim);

        C01_MethodCreation.terstenYazdir("Okan");
    }

    public static void isimGizle(String isim, String soyisim) {
       isim= isim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");
       soyisim= soyisim.substring(0,1).toUpperCase()+isim.substring(1).replaceAll("\\w","*");

        System.out.println(isim +" "+soyisim);
    }
}
