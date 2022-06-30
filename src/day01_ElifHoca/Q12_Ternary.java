package day01_ElifHoca;

public class Q12_Ternary {
    public static void main(String[] args) {
        /*
         * Ternary kullanarak bir kod yazin. fiyat isminde bir variable tanimlayin. eger fiyat
         * 10 dan az ise "ucuz" , 10 ile 20 arasinda ise "normal" , 20 ve 20 den buyuk ise pahali
         * olsun
         */
        int fiyat=10;
        if (fiyat<10){
            System.out.println("ucuz");
        } else if (fiyat<20) {
            System.out.println("Normal");

        }else
            System.out.println(
                    "pahali");

        String result=fiyat<10 ? "ucuz":fiyat<20 ? "Normal":"Pahali";
        System.out.println("Sonuc 2: "+result);
    }
}
