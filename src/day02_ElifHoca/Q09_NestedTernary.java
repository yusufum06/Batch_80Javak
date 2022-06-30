package day02_ElifHoca;

public class Q09_NestedTernary {
    public static void main(String[] args) {
        char finalNotu= 'B';

        String result= finalNotu== 'A' ? "Gayet Basarili": finalNotu=='B' ? "Basarili":finalNotu=='C' ?"Ha Gayret":"Digerleri..";
        System.out.println("result = " + result);

        System.out.println();
    }
}
