package day01_GrupCalismasi;

public class Q01_Question {
    public static void main(String[] args) {
        String[] arr1 = {"Ali", "Ahmet", "Mehmet"};
        String[] arr2 = {"Ayse", "Cemal", "Mehmet"};

        int count = 0;
        for (String each1 : arr1) {
            for (String each2 : arr2) {
                if (each1.equals(each2)) {
                    System.out.println(each1);

                    count++;
                }
            }

        }

    }
}
