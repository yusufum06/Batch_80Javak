package day35_InheritancedeConsrucorKullanimi;

public class LOgretmen {
    LOgretmen(){
        System.out.println("Ogretmen parametresiz");

    }
    LOgretmen(String isim){
        this();

        System.out.println("Ogretmen parametreli");
    }
}
