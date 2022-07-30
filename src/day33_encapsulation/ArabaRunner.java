package day33_encapsulation;

public class ArabaRunner {
    public static void main(String[] args) {
        Araba arb1=new Araba();
        arb1.marka="Toyata";
        System.out.println(arb1.marka);

        arb1.setModel("supra");

        System.out.println(arb1.getYakit());
    }
}
