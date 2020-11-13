package Chapter08;

import java.io.*;
import java.util.Scanner;

public class Exercise06 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        File f = new File("append.txt");
        Scanner sc = new Scanner(System.in);

        System.out.println("전체경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String first = sc.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String second = sc.nextLine();
        int c;
        try {
            fr = new FileReader(first);
            fw = new FileWriter(f);
            while ((c = fr.read()) != -1) {
                fw.write((char)c);
            }
            fr.close();

            fr = new FileReader(second);
            while ((c = fr.read()) != -1) {
                fw.write((char)c);
            }
            fr.close();
            fw.close();
            sc.close();
            System.out.println("프로젝트 폴더 밑에 append.txt 파일에 저장하였습니다.");
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