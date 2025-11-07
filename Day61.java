import java.util.Scanner;
public class Day61 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka n : ");
        int n = in.nextInt();
        System.out.print("Masukkan angka kelipatan m : ");
        int m = in.nextInt();
        System.out.print("Kelipatan " + m  +" antara 1 dan " + n  + " : ");
        for (int i = 1; i <= n; i++) {
            if (i % m == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
