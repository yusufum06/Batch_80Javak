package day21_Arrays;

import java.util.Scanner;

public class C03_Arrays {
    public static void main(String[] args) {
        /*
        Soru 3- Verilen bir array’in istenen bir
         elemani icerip icermedigini kontrol edip, bize true veya false sonucu donen bir method olusturun.
         */
        String[] isimler={"Basak","Nurullah","Fatih","Adem","Enes"};
        Scanner s=new Scanner(System.in);
        System.out.println("Aradiginiz ismi yaziniz");
        String arananIsim=s.nextLine();
        boolean sonuc=cotains(isimler,arananIsim);
        if (sonuc){
            System.out.println("Girilen isim listede var");
        }else {
            System.out.println("Girilen isim listede yok");
        }

    }

    public static boolean cotains(String[] isimler, String arananIsim) {
        boolean sonucMethod=false;
        for(int i=0;i<isimler.length;i++){
            if (isimler[i].equalsIgnoreCase(arananIsim)){
                sonucMethod=true;
            }
        }

        return sonucMethod;
    }
}
