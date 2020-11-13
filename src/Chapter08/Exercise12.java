package Chapter08;

import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Exercise12 {
    public static void main(String[] args) {
        File f = null;
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);
        Vector<String> v;
        try {
            System.out.println("전체경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
            System.out.print("대상 파일명 입력>> ");
//            String name = sc.next();
            String name = "fileAppend.java";
            f = new File(name);
            br = new BufferedReader(new FileReader(f));
            v = new Vector<String>();
            String line;

            while (true) {
                line = br.readLine();
                if (line == null)
                    break;
                v.add(line);
            }

            while (true) {
                boolean result = false;
                System.out.print("검색할 단어나 문장>> ");
                String search = sc.nextLine();
                if (search.equals("그만"))
                    break;

                int searchLength = search.length();
                for (int i = 0; i < v.size(); i++) {
                    String targetLine = v.get(i);
                    int lineLength = targetLine.length();
                    for (int j = 0; j < lineLength; j++) {
                        if (j+searchLength == lineLength)
                            break;
                        String compareWord = targetLine.substring(j,j+searchLength);
                        if (search.equals(compareWord)) {
                            System.out.println(i + ": " + targetLine);
                            result = true;
                        }
                    }
                }
                if (result == false)
                    System.out.println("존재하지 않습니다.");
            }
        }
        catch (FileNotFoundException e)
        {
            System.out.println("파일을 찾을 수 없습니다.");
        }
        catch (IOException e)
        {
            System.out.println("입출력 오류");
        }
    }
}
