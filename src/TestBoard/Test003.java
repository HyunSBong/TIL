package TestBoard;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Test003 {
    public static void main(String[] args) {
        FileOutputStream fout = null;
        FileInputStream fin = null;
        try {
            fout = new FileOutputStream("java_ex0806.dat");
            fout.write(3);
            fout.write(5);
            fout.close();
            fin = new FileInputStream("java_ex0806.dat");
            int c = 0;
            c = fin.read();
            System.out.println(c + " ");
            c = fin.read();
            System.out.println(c + " ");
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }
}
