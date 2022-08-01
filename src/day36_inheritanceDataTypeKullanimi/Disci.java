package day36_inheritanceDataTypeKullanimi;

public class Disci extends BMuhasebe {
    protected int saatUcreti=11;
    protected int gunlukMesai=7;

    protected void maas(){
        System.out.println("Isciler :"+(30*saatUcreti*gunlukMesai)+ "Maas alirlar");
    }
    protected void ozelSigorta(){
        System.out.println("Isciler %70 indirimli ozel sigorta yapilir");
    }

    public static void main(String[] args) {
        BMuhasebe isc1= new Disci();
        System.out.println(isc1.gunlukMesai);
        System.out.println(isc1.saatUcreti);
        isc1.maas();
        isc1.sigorta();
        System.out.println(isc1.isim);
        System.out.println(isc1.soyisim);
        System.out.println(isc1.departman);
        APersonal isc2=new Disci();
        isc2.maas();

        isc2.sigorta();
        System.out.println(isc2.isim);
        System.out.println(isc2.soyisim);
        System.out.println(isc2.departman);
    }

}
