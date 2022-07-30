package day35_InheritancedeConsrucorKullanimi;

public class Child extends BParent {
    String isim="Child isim belirtilmedi";
    protected String childKlupAdi="Child Klubu";

    Child(){
        System.out.println("Child constroctor calisti");

    }

    public static void main(String[] args) {
        AGrandParent gp1=new AGrandParent();

        Child child1=new Child();
        child1.grandPaKlupAdi="Child1";
        child1.parentKlupAdi="Child2";
    }
}
