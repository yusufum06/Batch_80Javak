package day35_InheritancedeConsrucorKullanimi;

public class HCorolla extends GToyota {
    HCorolla(){
        System.out.println("HCorplla parametresiz cons");
    }
    HCorolla(String isim){

        super(isim);
        System.out.println("Hcorolla parametreli cons");
    }
}
