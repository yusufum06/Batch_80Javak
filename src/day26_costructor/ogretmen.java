package day26_costructor;

public class ogretmen {
    String isim="isim belirtilmeli";
    String soyisim="Soyisim belirtilmeli";
    String dogumTarihi="Tarih girilmeli";
    String brans="Brans belirtilmeli";
    String yas="Yas belirtilmeli";

    public ogretmen(String isim, String soyisim,
                    String dogumTarihi, String brans, String yas) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
        this.brans = brans;
        this.yas = yas;
    }

    public ogretmen() {
    }

    public ogretmen(String isim, String soyisim, String dogumTarihi) {
        this.isim = isim;
        this.soyisim = soyisim;
        this.dogumTarihi = dogumTarihi;
    }

    @Override
    public String toString() {
        return
                "\nisim :" + isim +
                " soyisim='" + soyisim +
                ", dogumTarihi='" + dogumTarihi + '\'' +
                ", brans='" + brans + '\'' +
                ", yas='" + yas + '\'' +
                '}';
    }
}
