package Chapter08;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Exercise05 {
    public static boolean compare(FileInputStream first, FileInputStream second) throws IOException {
        byte[] arr1 = new byte[1024*10];
        byte[] arr2 = new byte[1024*10];
        int count1,count2 = 0;

        while (true) {
            count1 = first.read(arr1, 0, arr1.length);
            count2 = second.read(arr2, 0, arr2.length);
            if (count1 != count2)
                return false;
            else if (count2 == -1)
                break;
            for (int i = 0; i < count2; i++) {
                if (arr1[i] != arr2[i])
                    return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        FileInputStream fi = null;
        FileInputStream fi2 = null;
        Scanner sc = new Scanner(System.in);
        System.out.println("전체 경로명이 아닌 파일 이름만 입력하는 경우, 파일은 프로젝트 폴더에 있어야 합니다.");
        System.out.print("첫번째 파일 이름을 입력하세요>>");
        String first = sc.nextLine();
        System.out.print("두번째 파일 이름을 입력하세요>>");
        String second = sc.nextLine();

        System.out.println(first + "와 " + second + "를 비교합니다.");
        try {
            fi = new FileInputStream(first);
            fi2 = new FileInputStream(second);
            if (compare(fi, fi2))
                System.out.println("파일이 같습니다.");
            else
                System.out.println("파일이 다릅니다.");

            if (fi != null)
                fi.close();
            if (fi2 != null)
                fi2.close();
        }
        catch (IOException e) {
            System.out.println("오류 발생");
        }
        sc.close();
    }
}
