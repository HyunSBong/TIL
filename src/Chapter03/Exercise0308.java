package Chapter03;

import java.util.Scanner;

public class Exercise0308 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[];
        int num;

        System.out.print("정수 몇개?");
        num = sc.nextInt();
        arr = new int[num];

        for (int i = 0; i < arr.length; i++) {
            int target = (int)(Math.random()*100+1);
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]==target){
                    count =1;
                    break;
                }
            }
            if (count==1) {
                i--;
                continue;
            }
            arr[i] = target;
        }
        for (int i = 0; i < arr.length; i++) {
            if(i%10 == 0 && i!=0)
                System.out.println();
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
