import java.util.Scanner;

public class Mid_exam02 {
    public static void main(String[] args) {
        int set = 0;
        boolean result = true;
        Scanner sc = new Scanner(System.in);
        int arr[][] = {{2,7,6},{9,5,1},{4,3,8}};
        for (int i = 0; i < arr[0].length; i++) {
            set+=arr[0][i];
        }

        int sum = 0;
        while (true) {
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[i][j];
                }
                if (sum != set) {
                    result = false;
                }
                sum = 0;
            }

            sum = 0;
            for (int i = 0; i < arr.length; i++) {
                for (int j = 0; j < arr[i].length; j++) {
                    sum += arr[j][i];
                }
                if (sum != set) {
                    result = false;
                }
                sum = 0;
            }

            sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][2 - i];
            }
            if (sum != set) {
                result = false;
            }
            sum = 0;
            for (int i = 0; i < arr.length; i++) {
                sum += arr[i][i];
            }
            if (sum != set) {
                result = false;
            }

            if (result == true) {
                System.out.println("마방진이 맞습니다.");
                return;
            }
            else {
                System.out.println("마방진이 아닙니다.");
                return;
            }
        }
    }
}
