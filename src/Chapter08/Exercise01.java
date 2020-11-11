package Chapter08;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        FileWriter fw = null;
        File f = new File("//Library/temp//phone.txt");
        try {
            fw = new FileWriter(f);
            Scanner sc = new Scanner(System.in);
            System.out.println("전화번호 입력 프로그램입니다.");
            while(true) {
                System.out.print("이름 전화번호 >> ");
                String l = sc.nextLine();
                if (l.equals("그만"))
                    break;
                fw.write(l);
                fw.write("\r\n");
            }
            System.out.println(f.getPath() + "에 저장하였습니다.");
            fw.close();
            sc.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
