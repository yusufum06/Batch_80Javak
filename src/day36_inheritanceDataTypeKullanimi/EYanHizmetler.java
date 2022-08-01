package day36_inheritanceDataTypeKullanimi;

public class EYanHizmetler extends BMuhasebe {
    protected int saatUcreti =9;

    protected int gunlukMesai=8;

    protected void maas(){

    }
    protected void issizlikSigorta(){
        System.out.println();
        BMuhasebe yh1=new EYanHizmetler();

        System.out.println(yh1.gunlukMesai);
        System.out.println(yh1.saatUcreti);
        yh1.maas();
        yh1.sigorta();
        System.out.println(yh1.isim);
        System.out.println(yh1.soyisim);
        System.out.println(yh1.departman);
    }
}
