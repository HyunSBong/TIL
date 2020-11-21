package TestBoard;

import java.io.*;
import java.util.*;

class FileManager {
    private Scanner sc;
    private File f = null;
    File f2 = null;
    private FileReader frd = null;
    private FileWriter fr = null;
    private BufferedReader br = null;
    private HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

    FileManager() {
        System.out.print("파일 이름을 확장자를 포함하여 정확히 입력하십시오 >> ");
        sc = new Scanner(System.in);
        String fileName = sc.next();
        f = new File(fileName);
    }

    void show() {
        System.out.println("------------ Key를 기준으로 sort -------------");
        Iterator it1 = sortByKey(hashMap).iterator(); // 받은 배열 iterator
        while (it1.hasNext()) {
            String temp = (String) it1.next();
            System.out.println(temp + " " + hashMap.get(temp));
        }
        System.out.println("------------ Value를 기준으로 sort -------------");
        Iterator it2 = sortByValue(hashMap).iterator(); // 받은 배열 iterator
        while (it2.hasNext()) {
            String temp = (String) it2.next();
            System.out.println(temp + " " + hashMap.get(temp));
        }
        System.out.println("------------ Java_modified.txt 로 등수와 함께 저장합니다. -------------");
        writing();
    }

    void pushing() { // 추출하여 타입별로 해쉬맵에 저장
        try {
            br = new BufferedReader(new FileReader(f));
            while (true) {
                String line = br.readLine();
                if (line == null)
                    break;
                String[] arr = line.split(" ");
                String names = arr[0];
                int num = Integer.valueOf(arr[1]); // Casting
                hashMap.put(names, num);
                arr[0] = null;
                arr[1] = null;
            }
        }
        catch (IOException e) {
            System.out.println("파일 읽기 오류");
        }
    }

    List sortByKey(HashMap map) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.addAll(map.keySet()); // 모든 키를 배열에 저장
        Collections.sort(arr); // 컬렉션을 이용해 sort
        return arr;
    }

    List sortByValue(HashMap map) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.addAll(map.keySet()); // 모든 키를 배열에 저장

        // Comparable 인터페이스를 구현하는 경우
        // compareTo(T o) 메소드를 구현하고 내부에서 비교 처리 후 int형으로 비교 결과를 리턴한다.

        // 앞서 만든 arr 배열이 String 타입이기 때문에 사전 순으로 정렬되는게 디폴트인데 Value 크기에 따라 정렬하기 위해
        // 즉, 기존의 Comparable의 정렬과는 다른 결과를 얻고 싶나 다른 정렬을 원할 때 Comparator를 사용한다.

        Collections.sort(arr,new Comparator() {
            // Collections.sort(arr) 에서 Comparator 사용을 위해 추가하고 임의로 기준을 정의해주는 compare 메소드 오버라이딩
            // -> Comparable 인터페이스를 구현처럼..

            // 이렇게 Comparator를 별도로 직접 구현하는 경우에는 Comparable의 compareTo 메소드는 무시되고
            // Comparator의 compare 메소드의 처리 결과를 기준으로 정렬하게 된다

            // 아직 파라메터 명시부분에서 작성중임에 유의.
            public int compare(Object o1,Object o2) { // compare(T o1,T o2) -> 제네릭인데 객체로 명시함.
                Object num1 = map.get(o1); // o1과 o2는 arr의 객체
                Object num2 = map.get(o2);
                int num3 = (int)map.get(o1);
                int num4 = (int)map.get(o2);
                if (num3 < num4)
                    return 1;
                else if (num3 == num4)
                    return 0;
                else
                    return -1;
//                return ((Comparable) num2).compareTo(num1); // 비교 값 반환
                // 반환 값은 양수, 음수 둘 중 하나  -> 결과에 따라 arr 배열이 계속 정렬됨
                // num1이 타깃, num2가 비교대상자
            }
        });
        return arr;
    }

    void writing() {
        f2 = new File("java_modified.txt");
        try {
            fr = new FileWriter(f2);
            int count = 0;
            Iterator it = sortByValue(hashMap).iterator(); // 받은 배열 iterator
            while (it.hasNext()) {
                String temp = (String) it.next();
                String push = temp + " " + hashMap.get(temp) + count + "등";

                fr.write(push);
                fr.write("\r\n");
                count++;
            }
            System.out.println("java_modified.txt 파일을 저장했습니다.");
        }
        catch (IOException e) {
            System.out.println("파일 입출력 오류");
        }
    }
}
public class HashMapSortEx {
    public static void main(String[] args) {
        FileManager fm = new FileManager();
        fm.pushing();
        fm.show();
    }
}
