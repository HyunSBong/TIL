package Review;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Hw01 {
    // 주어진 영어 속담을 단어로 분리해 배열에 저장하고 단어의 개수를 출력하며, 정렬한 후 모든 단어를 출력하는 프로그램을 작성하시오.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("속담을 입력하시오:");
        String proverb = sc.nextLine();
        StringTokenizer st = new StringTokenizer(proverb, " ");
        int count = st.countTokens();
        System.out.println("단어 개수: "+count);
        String arr[] = new String[count];

        int i = 0;
        while (st.hasMoreTokens()) {
            arr[i] = st.nextToken();
            i++;
        }
        for (int j = 0; j < arr.length-1; j++) {
            int target = j;
            for (int k = j+1; k < arr.length; k++) {
                int n = arr[target].compareTo(arr[k]);
                if (n>0)
                    target = k;
            }
            String temp = arr[j];
            arr[j] = arr[target];
            arr[target] = temp;
        }
        System.out.println("정렬된 토큰:");
        for (int j = 0; j < count; j++) {
            if (j == count-1) {
                System.out.print(arr[j]);
                break;
            }
            System.out.print(arr[j] + ", ");
        }
        sc.close();
    }
}
