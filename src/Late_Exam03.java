import java.util.*;

public class Late_Exam03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("영어 문장을 입력하시오: ");
        //terrible vessels make the terrible sound.
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int count = st.countTokens();
        String arr[] = new String[count];
        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = st.nextToken();
            i++;
        }
        System.out.println("<분석결과입니다>");
        System.out.println("단어개수: " + count);
        for (int j = 0; j < count-1; j++) {
            int target = j;
            for (int k = j+1; k < count; k++) {
                int n = arr[target].compareTo(arr[k]);
                if (n>0)
                    target = k;
            }
            String temp = arr[j];
            arr[j] = arr[target];
            arr[target] = temp;
        }
        System.out.println("단어정렬:");
        for (int j = 0; j < count; j++) {
            if (j == count-1) {
                System.out.print(arr[j]);
                break;
            }
            System.out.print(arr[j] + ", ");
        }
        System.out.println();
        System.out.println("두번 이상 등장한 단어:");
        for (int j = 0; j < arr.length; j++) {
            String compareTarget = arr[j];
            for (int k = j+1; k < arr.length-1; k++) {
                if (compareTarget.equals(arr[k])) {
                    System.out.print(compareTarget);
                }
            }
        }
        System.out.println();

        System.out.println("------가장 많이 등장한 알파벳 (준비작업)");
        Vector<Character> v = new Vector<>();
        for (int j = 0; j < arr.length; j++) {
            String target = arr[j];
            System.out.println("------배열에 추가된 추출된 알파벳 확인 " + j + "번째-----");
            for (int k = 0; k < arr[j].length(); k++) {
                char c = target.charAt(k);
                if (c == '.') // .은 알파벳이 아니므로 제외
                    continue;
                v.add(c);
                System.out.print(c);
            }
            System.out.println();
        }
        System.out.println("------벡터에 제대로 추가되었는지 확인-----");
        for (int j = 0; j < v.size(); j++) {
            System.out.print(v.get(j));
        }
        System.out.println();
        // 탐색
        char alphabet = 'a';
        int step = 0;
        int tempStep = 0;
        ArrayList<Character> maxArr = new ArrayList<>();
        for (int j = 0; j < 26; j++) {
            for (int k = 0; k < v.size(); k++) { // 벡터 내의 알파벳들을 차례대로 비교
                if (v.get(k).equals(alphabet)) // ex) 'a'와 벡터 내 알파벳과 같은지
                    step++;
            }
            if (step > tempStep) {
                tempStep = step;
                maxArr.clear(); // 그 전의 알파벳보다 등장 횟수가 더 많으므로 초기화
                maxArr.add(alphabet);
            }
            else if (step == tempStep)
                maxArr.add(alphabet); // 동일 횟수이므로 추가
            step = 0; // 다음 탐색을 위해 초기화
            alphabet++; // 다음 알파벳
        }
        System.out.println("가장 많이 등장한 알파벳:");
        for (int j = 0; j <maxArr.size() ; j++) { // 결과출력
            System.out.println(maxArr.get(j));
        }
    }
}
