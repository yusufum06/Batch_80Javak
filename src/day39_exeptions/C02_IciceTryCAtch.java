package day39_exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class C02_IciceTryCAtch {
    public static void main(String[] args) {
        int k;

        try {
            FileInputStream fis=new FileInputStream("src/day39_exeptions/Test.txt");
            while ((k=fis.read())!=-1){
                System.out.println((char)k);
            }

        } catch (FileNotFoundException e) {
            System.out.println("Dosya bulunamadi");

        } catch (IOException e){
            System.out.println("Dosya bilgiler bulunamadi ");
        }
    }

}
