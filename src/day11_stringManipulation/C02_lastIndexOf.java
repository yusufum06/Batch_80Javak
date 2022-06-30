package day11_stringManipulation;

public class C02_lastIndexOf {
    public static void main(String[] args) {
        String cumle="Java cok kolay, Java cok guzel";
        String kelime="Java";

        int kelimeIlkIndex = cumle.indexOf(kelime);
        int kelimeSonIndex= cumle.lastIndexOf(kelime);

        if (kelimeIlkIndex==-1){
            System.out.println("verilen kelime cumlede kullanilmistir");

        }else if(kelimeIlkIndex==kelimeSonIndex){
            System.out.println("verilen kelime cumlede bir defe kullanilmistir");
        }else {
            System.out.println("verilen kelime cumlede birden fazla kullanilmis");
        }
    }
}
