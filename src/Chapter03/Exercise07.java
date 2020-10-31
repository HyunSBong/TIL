package Chapter03;

import java.util.Scanner;

public class Exercise07 {
    public static void main(String[] args) {
        int arr[] = new int[10];
        System.out.print("랜덤한 정수들 : ");
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int)(Math.random()*10+1);
            for (int j = 0; j < i; j++) {
                if(arr[i]==arr[j])
                    i--;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
            sum += arr[i];
        }
        System.out.println();
        System.out.println("평균은 " + sum/10);
    }
}
