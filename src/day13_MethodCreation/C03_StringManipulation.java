package day13_MethodCreation;

public class C03_StringManipulation {
    // Soru 1) String methodlarini kullanarak
    // “  Java ogrenmek123 Cok guzel@  ”  String’ini
    // “Java ogrenmek cok guzel.” sekline getirin.

    public static void main(String[] args) {
        String str= " Java ogrenmek123 Cok guzel@ ";

        str =str.trim();
        str=str.replaceAll("\\d","");
        str=str.replace("@","");
        str=str.replace("C","c");
        str=str+".";

        System.out.println(str);


    }
}
