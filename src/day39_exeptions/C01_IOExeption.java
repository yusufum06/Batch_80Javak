package day39_exeptions;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class C01_IOExeption {
    public static void main(String[] args) throws FileNotFoundException {
        /*
Java'dan bilgisayarimizdaki bir dosyaya erismek istiyorsak
FileInputStream Class'indan yardim aliriz.
Ayni sekilde Java'dan bilgisayarimizdaki bir dosyaya ekleme ya da update
yapmak istersek FileOutputStream Class'indan yardim aliriz.
 */
        FileInputStream fis=new FileInputStream("src/day39_exeptions/Test.txt");


    }
}
