import java.io.*;
import java.util.Scanner;
import java.util.Vector;

public class Mid_Quiz04 {
    public static void main(String[] args) {
        BufferedReader br = null;
        Scanner sc = new Scanner(System.in);
        File f = null;
        Vector<String> v1 = new Vector<String>();
        Vector<Integer> v2 = new Vector<Integer>();
        try {
            System.out.print("**Java 성적 파일 이름을 입력하세요:");
            String name = sc.nextLine();
            f = new File(name);
            br = new BufferedReader(new FileReader(f));
            System.out.println("**총 10명 학생의 java 성적을 읽었습니다.");
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                String [] arr = line.split(" ");
                String names = String.valueOf(arr[0]);
                v1.add(names);
                int num = Integer.valueOf(arr[1]);
                v2.add(num);
                System.out.println(line);
                arr[0] = null;
                arr[1] = null;
            }
        }
        catch (IOException e) {
            System.out.println("파일 읽기 오류");
        }
        System.out.println(v1.size());
        System.out.println(v2.size());
        for (int i = 0; i < v1.size(); i++) {
            for (int j = i + 1; j < v1.size(); j++) {
                if (v2.get(i) < v2.get(j)) {
                    int temp = v2.get(i);
                    int temp2 = v2.get(j);
                    v2.add(i, temp2);
                    v2.remove(i + 1);
                    v2.add(j, temp);
                    v2.remove(j + 1);

                    String stemp = v1.get(i);
                    String stemp2 = v1.get(j);
                    v1.add(i, stemp2);
                    v1.remove(i + 1);
                    v1.add(j, stemp);
                    v1.remove(j + 1);
                }
            }
        }
        FileWriter fr = null;
        File f2 = new File("java2.txt");
        try {
            fr = new FileWriter(f2);
            for (int i = 0; i < v1.size(); i++) {
                fr.write(v1.get(i)+" "+v2.get(i)+" "+(i+1)+"등");
                fr.write("\r\n");
            }
            fr.close();
            System.out.println("java2.txt 파일을 저장했습니다.");
        }
        catch (IOException e) {
            System.out.println("파일 읽기 오류");
        }
        System.out.print("학생의 이름을 입력하세요: ");
        String name = sc.next();
        for (int i = 0; i < v1.size(); i++) {
            if (name.equals("그만"))
                break;
            if (name.equals(v1.get(i)))
                System.out.println(v1.get(i)+" "+v2.get(i)+" "+(i+1)+"등");
        }
    }
}
