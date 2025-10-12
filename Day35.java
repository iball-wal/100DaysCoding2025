import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== Program Penentuan Arah Langkah Adam ===");
        System.out.print("Masukkan posisi awal X : ");
        int x = input.nextInt();
        System.out.print("Masukkan posisi awal Y : ");
        int y = input.nextInt();

        System.out.print("Masukkan arah tujuan (U/S/T/B): ");
        String arah = input.next().toUpperCase();

        System.out.println("\nSebelum melangkah, posisi Adam ada di: (" + x + ", " + y + ")");

        if (arah.equals("U")) {
            y = y + 1;
            System.out.println("Adam melangkah ke Utara ⬆");
        } else if (arah.equals("S")) {
            y = y - 1;
            System.out.println("Adam melangkah ke Selatan ");
        } else if (arah.equals("T")) {
            x = x + 1;
            System.out.println("Adam melangkah ke Timur");
        } else if (arah.equals("B")) {
            x = x - 1;
            System.out.println("Adam melangkah ke Barat ");
        } else {
            System.out.println("Arah tidak dikenal! Adam diam di tempat.");
        }

        System.out.println("Setelah melangkah, posisi Adam sekarang: (" + x + ", " + y + ")");
    }
}
