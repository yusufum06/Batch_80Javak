package day22_MultiDimensionelArrays;

public class C02_mdaTumElementleriYazdirma {
    public static void main(String[] args) {
        //verilen bir Multi-dimensional arrayin
        //tum elementlerini yazdiran bir metod olusturun
        int[][] sayilar={{1,5,6,9},{2,5},{3,1,6}};

        elementleriYazdirma(sayilar);
    }

    public static void elementleriYazdirma(int[][] sayilar) {
        for (int i=0;i< sayilar.length;i++){
            for (int j=0;j< sayilar[i].length;j++){
                System.out.println(sayilar[i][j]+" ");
            }
        }
    }
}
