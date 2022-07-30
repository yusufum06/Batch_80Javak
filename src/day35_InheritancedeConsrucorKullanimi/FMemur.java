package day35_InheritancedeConsrucorKullanimi;

public class FMemur extends EMuhasebe {
    FMemur(){
        System.out.println("Memur parametresiz cons");
    }
    FMemur (String isim){
        System.out.println("Memur parametreli cons");
}

    public static void main(String[] args) {
        FMemur mmr1=new FMemur("Ali");

    }
}
