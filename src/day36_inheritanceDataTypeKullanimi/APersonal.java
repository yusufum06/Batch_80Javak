package day36_inheritanceDataTypeKullanimi;

public class APersonal {
  protected String isim="Isim belirtilmedi";
  protected String soyisim="Isim belirtilmedi";
  protected String departman="Isim belirtilmedi";

  protected  void  maas(){
      System.out.println("Tum personel maas alir");
  }
  protected void sigorta(){
      System.out.println("Tum personel sigorta yapilir");
  }
}
