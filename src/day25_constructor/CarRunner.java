package day25_constructor;

public class CarRunner {
    public static void main(String[] args) {
        Car car1=new Car();
        car1.fiyat=15000;
        car1.yil=2020;
        car1.marka="Toyota";

        System.out.println("Marka:"+car1.marka+"\nModel:"
        +"\n Yil: "+car1.yil+ "\n Fiyat:"+car1.fiyat);

        Car car2=new Car();
        System.out.println("Car2 bilgileri\nMarka:"+car2.marka+"\nModel:"
                +"\n Yil: "+car2.yil+ "\n Fiyat:"+car2.fiyat);
    }
}
