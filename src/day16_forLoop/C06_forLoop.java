package day16_forLoop;

public class C06_forLoop {
    public static void main(String[] args) {
        String str="Java";

        for (int i=str.length()-1; i>=0; i--){
            String str1=str.substring(i,i+1);
            System.out.print(str1);
        }
    }
}
