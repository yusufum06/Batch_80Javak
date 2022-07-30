package day33_encapsulation;

public class Araba {



    String marka="marka belirtilmrdi";
        private String model="model belirtilmrdi";
       private String yakit="Elektrikli";

    public void setModel(String model) {
        this.model = model;
    }

    public String getYakit() {
        return yakit;
    }
}
