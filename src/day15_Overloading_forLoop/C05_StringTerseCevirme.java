package day15_Overloading_forLoop;

public class C05_StringTerseCevirme {
    public static void main(String[] args) {
        //input olarak verilen Stringi terse cevirip yazdiran bir metod olusturun
        
        String input="Java gun gectikce guzellesiyor";
        terstenYazdir(input);
    }

    public static void terstenYazdir(String input) {
        String tersInput=input.substring(input.length()-1);

        for (int i=input.length()-2;i >=0; i--){
            tersInput+=input.substring(i,i+1);

        }
        System.out.println(tersInput);
    }
}
