package day11_stringManipulation;

public class C01_indexOf {
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

            System.out.println(str.indexOf("g", (6 + 1)));// yazilan indexten baslar
            //
            int ilke = str.indexOf("e");
            int ikincie = str.indexOf("e", ilke + 1);
            // eger
            if (ikincie == -1) {
                System.out.println("verilen str de 2.e yok");
            } else {
                int ucuncue = str.indexOf("e", ikincie + 1);
                if (ucuncue == -1) {
                    System.out.println("verilen str de 3.e yok");
                } else {
                    System.out.println("verilen str deki 3e nin indexi " + ucuncue);
                }
            }
        }
    }
}
