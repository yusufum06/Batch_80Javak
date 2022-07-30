package day33_encapsulation;

public class Tasit {
  private  String tasıtTuru;
  private  boolean muayenesiVarmi;
  private  int yil;

    public String getTasıtTuru() {
        return tasıtTuru;
    }

    public void setTasıtTuru(String tasıtTuru) {
        this.tasıtTuru = tasıtTuru;
    }

    public boolean isMuayenesiVarmi() {
        return muayenesiVarmi;
    }

    public void setMuayenesiVarmi(boolean muayenesiVarmi) {
        this.muayenesiVarmi = muayenesiVarmi;
    }

    public int getYil() {
        return yil;
    }

    public void setYil(int yil) {
        this.yil = yil;
    }
}
