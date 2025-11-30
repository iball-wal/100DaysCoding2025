import java.util.Scanner;
public class Day84 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("--- Soal 1 ---");
        System.out.print("N: ");
        int n = sc.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(n +" * "+ i+" = "+(i*n));
        }

        System.out.println("--- Soal 2 ---");
        System.out.print("N: ");
        int m = sc.nextInt();
        for (int i = 1; i <= m; i++) {
            System.out.println("Iccang");
        }
        sc.nextLine();
        System.out.println("--- Soal 3 ---");
        String a = sc.nextLine();
        int j = sc.nextInt();
        for (int i = 1; i <= j; i++) {
            System.out.println(a);
        }
    }
}
