package day15_Overloading_forLoop;

public class C04_forLoop {
    public static void main(String[] args) {
        int toplam=0;

        for (int i=1; i<=5;i++){
            toplam+=i;

        }
        System.out.println("Toplam: "+toplam);

        toplam=0;
        for(int i=10;i<=20;i++ ){
        toplam+=i;}
        System.out.println(toplam);

        toplam=0;
        for(int i=30;i<=50;i++ ){
            if (i%2==0){
                toplam+=i;
            }
        }
        System.out.println(toplam);
    }



}
