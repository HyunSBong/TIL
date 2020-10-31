package Chapter04;
class ArrayUtil {
    public static int[] concat(int[] a, int[] b) {
        int arr[] = new int[a.length + b.length];
        int i = 0;
        for (; i < a.length; i++) {
            arr[i] = a[i];
        }
        for (int j = 0; i < a.length + b.length; i++, j++) {
            arr[i] = b[j];
        }
        return arr;
    }

    public static void print(int[] array3) {
        System.out.print("[");
        for(int i=0; i<array3.length;i++) {
            System.out.print(" "+array3[i]+" ");
        }
        System.out.print("]");
    }
}
public class Exercise0409 {
    public static void main(String[] args) {
        int[] array1 = {1, 5, 7, 9};
        int[] array2 = {3, 6, -1, 100, 77};
        int[] array3 = ArrayUtil.concat(array1, array2);
        ArrayUtil.print(array3);
    }
}
