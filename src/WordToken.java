import java.util.Scanner;
import java.util.StringTokenizer;

public class WordToken {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("속담을 입력하시오:");
        String proverb = sc.nextLine();
        StringTokenizer st = new StringTokenizer(proverb, " ");
        int count = st.countTokens();
        System.out.println("단어 개수: "+count);
        String arr[] = new String[count];
        int i = 0;
        while(st.hasMoreTokens()) {
            arr[i] = st.nextToken();
            i++;
        }
        for (i = 0;  i< count-1; i++) {
            int target = i;
            for (int j = i+1; j < count; j++) {
                int k = arr[target].compareTo(arr[j]);
                if (k>0)
                    target = j;
            }
            String container = arr[i];
            arr[i] = arr[target];
            arr[target] = container;
        }
        System.out.println("정렬된 토큰:");
        for (int j = 0; j < count; j++) {
            if (j==count-1) {
                System.out.print(arr[j]);
                break;
            }
            System.out.print(arr[j]+", ");
        }
        sc.close();
    }
}
