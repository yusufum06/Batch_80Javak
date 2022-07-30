package day35_InheritancedeConsrucorKullanimi;

public class KDizelCorolla extends HCorolla{
    KDizelCorolla(){
        System.out.println("Kdizel parametresiz cons");


    }
    KDizelCorolla(String isim){
        super(isim);
        System.out.println("KDizel parametreli cons");
    }

    public static void main(String[] args) {
        KDizelCorolla obj1=new KDizelCorolla();
    }

}
