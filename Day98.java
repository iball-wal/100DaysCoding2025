import java.util.Scanner;

public class Day98 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan jumlah deret : ");
        int x = in.nextInt();
        int y = 0;
        int z = 1;
        System.out.println("\nFibonacci");
        for (int i = 1; i <= x; i++) {
            System.out.print(y + " ");
            int next = y + z;
            y = z;
            z = next;
        }
    }
}
