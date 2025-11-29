import java.util.Arrays;
import java.util.Scanner;

public class Day83 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukan jumla hari : ");
        int n = in.nextInt();
        int arr [] = new int[n];
        for ( int i = 0; i < arr.length; i++ ) {
            arr[i] = in.nextInt();
        }
        int sum = Arrays.stream(arr).sum();
        System.out.println("Hail sum :" + sum);

    }
}
