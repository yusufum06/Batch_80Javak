package day15_Overloading_forLoop;

public class C07_Faktoryel {
    public static void main(String[] args) {
        int input=5;
        faktoryel(input);
    }

    public static void faktoryel(int input) {
        int faktoryel=1;
        if (input<0 || input>20){
            System.out.println("verilen sayi icin faktoryel hesaplanamaz");

        } else if (input==0) {
            System.out.println("0!=1 dir");

        }else for (int i=1; i<=input; i++){
            faktoryel*=i;
        }
        System.out.println("faktoryel degeri: "+ faktoryel);
    }


}
