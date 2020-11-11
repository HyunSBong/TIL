package Chapter08;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise03 {
    public static void main(String[] args) {
        try {
            File f = new File("c:\\windows\\system.ini");
            FileReader fin = new FileReader(f);
            int c;
            while((c = fin.read()) != -1) {
                char target = (char)c;
                if(Character.isLowerCase(target))
                    target = Character.toUpperCase(target);
                System.out.print((char)target);
            }
            fin.close();
        }
        catch(IOException e) {
            System.out.println("읽기 오류");
        }
    }
}
