package TestBoard;

import java.util.StringTokenizer;

public class Test002 {
    public static void main(String[] args) {
        String str = "2+3+5+66+88+323";
        StringTokenizer st = new StringTokenizer(str, "+");
        int sum = 0;
        while (st.hasMoreTokens()) {
            String s = st.nextToken();
            int n = Integer.parseInt(s);
            sum += n;
        }
        System.out.println("합 : "+sum);
    }
}
