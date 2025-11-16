import java.sql.SQLOutput;
import java.util.Scanner;

public class Day70 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan baris : ");
        int n = in.nextInt();
        System.out.print("Masukkkan kolom : ");
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print("_");
            }
            System.out.println();
        }

    }
}
