package Chapter03;

public class Exercise0310 {
    public static void main(String[] args) {
        int result = 0;
        int x,y = 0;
        int arr[][] = new int[4][4];
        while (result < 10) {
            x = (int)(Math.random()*4);
            y = (int)(Math.random()*4);
            if (arr[x][y] == 0) {
                arr[x][y] = (int)(Math.random()*10+1);
                result++;
            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
