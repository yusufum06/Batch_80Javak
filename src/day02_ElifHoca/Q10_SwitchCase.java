package day02_ElifHoca;

public class Q10_SwitchCase {

    public static void main(String[] args) {
        String gun= "carsamba";
        switch (gun){
            case "pazartesi":
            case "sali":
                System.out.println("Java dersi");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("Sql Dersi");
                break;
            case "persembe":
            case "cuma":
                System.out.println("Selenyum dersi");
                break;
            default:
                System.out.println("izin gunu");
        }

    }
}
