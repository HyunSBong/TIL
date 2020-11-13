package Chapter08;

import java.io.File;

public class Exercise08 {
    public static void main(String[] args) {
        /* File 클래스를 이용하여 c:\에 있는 파일 중에서 제일 큰 파일의 이름과 크기를 출력하라. */
        File f = new File("/Users/hyunsubong/Univ");
        File[] fileList = f.listFiles(); // 파일 객체 리스트
        long max = 0; // 기준
        File maxFile = null; // 기준
        for (int i = 0; i < fileList.length; i++) {
            File target = fileList[i]; // 객체이므로 File 객체에 저장
            if (target.length() > max) {
                max = target.length();
                maxFile = target;
            }
        }
        System.out.println("가장 큰 파일은 " + maxFile.getName() + " " + maxFile.length() + "바이트");
        // NullPointerException >> 객체 A를 생성한후 A를 참조 받아 B가 작업을 해야하는데 B가 작업 하려 할 때 A가 없는 경우 ??
    }
}