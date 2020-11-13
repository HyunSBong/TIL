package Chapter08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Scanner;
/* 전화번호를 미리 c:\temp\phone.txt 파일에 여러 개 저장해둔다.
            이 파일을 읽어 다음 실행 예시와 같은 작동하는 검색프로그램을 작성하라.
         */
class ReadAndSearch {
    private File f = null;
    private HashMap<String, String> numberHashMap = new HashMap<String, String>();
    private BufferedReader br = null;
    private Scanner sc;
    void run() {
        try {
            f = new File("phone.txt");
            br = new BufferedReader(new FileReader(f));
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                int index = line.lastIndexOf(" ");
                String name = line.substring(0,index);
                String num = line.substring(index+1); // 공백제거
                numberHashMap.put(name, num);
            }
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println("총 "+numberHashMap.size()+"개의 전화번호를 읽었습니다.");
        search();
    }
    void search() {
        sc = new Scanner(System.in);
        while (true) {
            System.out.print("이름>> ");
            String name = sc.next();
            if (name.equals("그만"))
                break;
            System.out.println(numberHashMap.get(name));
        }
    }
}
public class Exercise10 {
    public static void main(String[] args) {
        ReadAndSearch readAndSearch = new ReadAndSearch();
        readAndSearch.run();
    }
}
