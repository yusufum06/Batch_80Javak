package day01_ElifHoca;

import java.util.Scanner;

public class Q11IfStatement {/*
      Print "Lutfen is unvaninizi girin
      jobTitle isimli bir degisken olusturun ve kullanicidan isteyin.
      Dogru jobTitle yazdirmak icin asagidaki test datalarini kullanin. Example :
      Eger jobTitle  qa ise print is unvaniniz Quality Analyst
      test data: qa ise print Quality Analyst
      dev ise print Developer
      ba ise print Business Analyst
      pm ise print Project Manager
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen is unvaninizi giriniz");
        String jobTitel = scan.nextLine().toLowerCase();
        if (jobTitel.equals("qa")) {
            System.out.println("Is unvaniniz: Quality Analist ");
        } else if (jobTitel.equals("ba")) {
            System.out.println("Is unvaniniz: Busines Analist ");

        } else if (jobTitel.equals("dev")) {
            System.out.println("Is unvaniniz: Developer ");
        } else if (jobTitel.equals("pm")) {
            System.out.println("Is unvaniniz: Prajeckt Manager ");
        }
    }
}

