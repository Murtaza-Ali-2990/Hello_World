import java.util.Arrays;
import java.util.Scanner;

public class Assignment {
    public static int [] smoothSignal(int[] arr) {
        int[] res = new int[arr.length];
        for(int i = 0; i < arr.length; i++) {
            if(i == 0)
                res[i] = (arr[i] + arr[i + 1])/2;
            else if(i == arr.length - 1)
                res[i] = (arr[i] + arr[i - 1])/2;
            else
                res[i] = (arr[i] + arr[i + 1] + arr[i - 1])/3;
        }
        return res;
    }

    public static void main(String [] args) {
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        int[] a = new int[size];
        for(int i = 0; i < size; i++) {
            a[i] = scan.nextInt();
        }
        int[] result = smoothSignal(a);
        System.out.println(Arrays.toString(result));
    }
}
