package day12_stringManipulations;

public class C01_replace {
    public static void main(String[] args) {

        String str=" Bu gun hava cok guz el ";
        System.out.println(str.replace(" ",""));
        //hava kelimesini java yapalim

        System.out.println(str.replace("h", "J").replace(" ",""));
        System.out.println(str.replace("guz el","harika"));


    }
}
