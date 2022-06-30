package day12_stringManipulations;

public class C03_subString {
    public static void main(String[] args) {

        String isim="Suleyman";
        String soyisim="Karanfil";
        String kartNo="1234 5678 9876 9876";
        System.out.println(isim.substring(3));
        System.out.println(soyisim.substring(soyisim.length()-3));

        System.out.println(isim.substring(2,4));
        String isimIlkHarf=isim.substring(0,1).toUpperCase();
        String isimGeriyeKalanlar=isim.substring(1).replaceAll("\\w","*");

        String soyisimIlkHarf=soyisim.substring(0,1).toUpperCase();
        String soyisimGeriyeKalanlar=soyisim.substring(1).replaceAll("\\w","*");

        String kkIlk4=kartNo.substring(0,4);
        String kkGeriyeKalanlar=" **** **** ****";
        System.out.println( isimIlkHarf+isimGeriyeKalanlar+" "+ soyisimIlkHarf+soyisimGeriyeKalanlar+"\n "+
                kkIlk4+kkGeriyeKalanlar);

    }
}
