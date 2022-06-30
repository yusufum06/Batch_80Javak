package day12_stringManipulations;

public class C02_replaceAll {
    public static void main(String[] args) {
        String str="1Bu2gu3n Ja*va- cok g3uz/el";
        //str yi Bugun Java cok guzel haline getirin
        //replaceAll deki all in amaci ayni ozellikteki tum karekterleri tum karekterleri kapsamasidir
        //butun sayilari sil
        //
        str=str.replace(" ","qayx");
        str=str.replaceAll("\\W","");
        str=str.replaceAll("\\d","");
        str=str.replace("qayx"," ");
        System.out.println(str);
    }
}
