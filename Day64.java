import java.util.Scanner;

public class Day64 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan bilangaan n : ");
        int n = in.nextInt();
        System.out.print("masukkan bilangan m : ");
        int m = in.nextInt();
        double hasil = Math.pow(n,m);
        System.out.println("Hasil Bilangan :"+hasil);
    }
}
