package Chapter08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Exercise02 {
    public static void main(String[] args) {
        BufferedReader fr = null;
        File f = new File("//Library/temp//phone.txt");
        try {
            fr = new BufferedReader(new FileReader(f));
            System.out.println(f.getPath() + "를 출력합니다.");
            while (true) {
                String l = fr.readLine();
                if (l == null)
                    break;
                System.out.print(l + "\n");
            }
            fr.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
