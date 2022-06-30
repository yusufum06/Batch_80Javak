package day10_stringManipulation;

public class C06_indexOf {
    public static void main(String[] args) {

        String str = "Java ogrenmek cok guzel";
        System.out.println(str.indexOf("o"));
        System.out.println(str.indexOf("g"));//bana integer donduruyor.
        //int de yok diye bir deger bulunmuyor
        //0 dersek J nin index idir
        //- bir deger donerse biz aranan string in str da olmadigini
        // Java -1 dondurmeyi tercih etmistir
        String str5 = "öknldnvdlkndldnbldnbldnbldnblskbnldfnbldnbpdösövckdöv";
        if (str5.indexOf("p") == -1) {
            System.out.println("str5 de istenen karekter kullanilmamis");

        } else {
            System.out.println("str5 de istenen karekter kullanilmis");
        }
    }
}
