package day09_TernaryOperator;


import java.util.Locale;

public class C06_SwitchCase {
    public static void main(String[] args) {

    String input="Sali";
    input=input.toLowerCase();

    switch (input){
        case "pazartesi":
            System.out.println("Hafta ici");
            break;
        case "sali":
            System.out.println("Hafta ici");
            break;
        case "carsamba":
            System.out.println("Hafta ici");
            break;
        case "persembe":
            System.out.println("Hafta ici");
            break;
        case "cuma":
            System.out.println("Hafta ici");
            break;
        case "cumartesi":
            System.out.println("Hafta sonu");
            break;
        case "pazar":
            System.out.println("Hafta ici");
            break;
    }
    }
}
