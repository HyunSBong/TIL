package Chapter08;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Vector;

class WordSearch {
    private File f = null;
    private BufferedReader br = null;
    private Vector<String> v;
    private Scanner sc;

    void write() {
        v = new Vector<String>();
        try {
            f = new File("words.txt");
            br = new BufferedReader(new FileReader(f));
            System.out.println("프로젝트 폴더 밑의 words.txt 파일을 읽었습니다...");
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                v.add(line);
            }
        }
        catch (IOException e) {
            System.out.println("입출력 오류");
        }
    }

    void search() {
        sc = new Scanner(System.in);
        while (true) {
            boolean result = false;
            System.out.print("단어>>");
            String name = sc.next();
            if (name.equals("그만"))
                break;
            for (int i = 0; i < v.size(); i++) {
                String word = v.get(i);
                if (name.length() > word.length())
                    continue;

                String compareWord = word.substring(0, name.length());
                if (name.equals(compareWord)) {
                    System.out.println(word);
                    result = true;
                }
            }
            if (result == false)
                System.out.println("발견할 수 없음");
        }
    }
}
public class Exercise11 {
    public static void main(String[] args) {
        WordSearch wordSearch = new WordSearch();
        wordSearch.write();
        wordSearch.search();
    }
}
