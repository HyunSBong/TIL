package Chapter03;

public class Exercise0313 {
    public static void main(String[] args) {
        String arr[] = {"박수 짝", "박수 짝짝"};
        int res, num, index = 0;

        for (int i = 0; i < 100; i++) {
            num = i;
            for (res = num%10; num>0; res = num%10) {
                if (res==3 || res==6 || res==9)
                    index++;
                num = num/10; // num이 30일 경우에 10으로 나눈 나머지가 0 이므로 몫으로 나눠서 다시 for문으로 돌아감
            }
            if (index>0)
                System.out.println(i+arr[index-1]);
            index = 0;
        }
    }
}
