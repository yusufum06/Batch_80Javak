package day35_InheritancedeConsrucorKullanimi;

public class Matematikciler extends LOgretmen{
    Matematikciler(){
        System.out.println("Matematikciler parametresiz");

    }
    Matematikciler(String isim){
        this();
        System.out.println("Matematikciler parametreli");
    }

    public static void main(String[] args) {
        Matematikciler obj1=new Matematikciler("Tugba");
    }
}
