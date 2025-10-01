import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai jari-jari : ");
        final double r = input.nextDouble();
        double pi = Math.PI;
        double luasLingkaran = pi * r * r; // rumus luas lingkaran = π r^2

        // batasi hasil jadi 2 angka di belakang koma
        System.out.printf("Luas lingkaran = %.2f%n", luasLingkaran);
    }
}
