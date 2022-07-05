package day16_forLoop;

import java.nio.channels.ScatteringByteChannel;
import java.util.Scanner;

public class C07_forLoop {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir kelime giriniz");
        String str=scan.nextLine();
        String tersStr=str.substring(str.length()-1);
        for (int i=str.length()-2;i>=0;i--){
            tersStr+=str.substring(i,i+1);


        }
        if (tersStr==str){
            System.out.println("Girdiginiz ifade palidrome bir ifadedir ve tersi aynidir ");

        }else {
            System.out.println("Girdiginiz ifade palidrome bir ifade degildir");
        }

    }
}
