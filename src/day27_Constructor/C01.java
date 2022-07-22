package day27_Constructor;

public class C01 {
    static int sayi= 10;
    int rakam=5;

    public static void main(String[] args) {
        C01 obj1 = new C01();
        System.out.println("obj1'in rakam degeri :" + obj1.rakam);
        System.out.println("obj1'in rakam degeri :" + obj1.sayi);

        obj1.rakam += 1;
        sayi += 1;
        System.out.println("obj1'in rakam degeri :" + obj1.rakam);
        System.out.println("obj1'in rakam degeri :" + obj1.sayi);

        C01 obj2=new C01();
        System.out.println("obj2'in rakam degeri :" +obj2.rakam);
        System.out.println("obj2'in rakam degeri :" +obj2.sayi);

        obj2.rakam++;
        obj2.sayi++;
        System.out.println("obj2'in rakam degeri :" +obj2.rakam);
        System.out.println("obj2'in rakam degeri :" +obj2.sayi);
    }
}

