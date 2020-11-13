package Chapter08;

import java.io.*;

public class Exercise07 {
    /* 이미지 파일 a.jpg를 b.jpg로 복사하는 프로그램을 작성하라.
        복사를 진행하는 동안 10% 진행할 때마다. '*' 하나씩 출력하도록 하라.
         */
    public static void main(String[] args) {
        BufferedInputStream originStream = null;
        BufferedOutputStream copyStream = null;
        File origin = new File("a.jpeg");
        File copy = new File("a 복사본.jpeg");

        try {
            System.out.println(origin.getName() + "(을)를 " + copy.getName() + "로 복사합니다.");
            System.out.println("10%마다 *를 출력합니다.");
            originStream = new BufferedInputStream(new FileInputStream(origin));
            copyStream = new BufferedOutputStream(new FileOutputStream(copy));

            long size = origin.length() / 10; // 10% 구분용
            byte[] buf = new byte[1024];
            int c;
            long count = 0; // 10% 읽었는지 확인용
            int temp = 0; // * 출력 갯수 확인용
            while (true) {
                c = originStream.read(buf, 0, buf.length);
                if (c == -1) {
                    if (count > 0) { // count로 10%에 도달하는 지 확인 하는 중에 Break 되는 경우,
                        System.out.println("*"); // 아직 count가 초기화 되지 못했을 수 있는 경우를 포함 출력 용
                        temp += 1;
                    }
                    break;
                } else if (c > 0) {
                    copyStream.write(buf, 0, c); // 버퍼만큼 쓰기
                }
                count += c; // 읽은 만큼 덧셈
                if (count >= size) { // 10%에 도달했는지
                    System.out.print("*");
                    count = 0;
                    temp += 1;
                }
            }
            System.out.println(temp + "개");
            originStream.close();
            copyStream.close();
        } catch (IOException e) {
            System.out.println("파일 입출력 오류");
        }
    }
}