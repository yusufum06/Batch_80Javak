package day42_abstractClass_interfaces;

public class K_ChildClassOfInterfaces implements I02_Interfaces,I03_Interfaces{

    /*
    Bir Clas i interfaces child yapmak icin implements keyword kullanilir
    implements dedikten sonra virgul yazarak istedigimiz kadar interface ekleyebiliriz
     */
    public static void main(String[] args) {
        System.out.println(I03_Interfaces.SAYI);
        System.out.println(I02_Interfaces.SAYI);
    }

    @Override
    public void yakit() {

    }

    @Override
    public void motor() {

    }

    @Override
    public void teker() {

    }
}
