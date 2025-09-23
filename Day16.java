import java.util.Scanner;

public class Day16 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah bus : ");
        int bus = in.nextInt();
        final double BIAYA_SEWA = 7500000;
        final int JUMLAH_KURSI = 50;

        int totalKursi = bus * JUMLAH_KURSI;
        double totalBiaya = bus * BIAYA_SEWA;
        double sewaPerKursi = totalBiaya/ totalKursi;

        System.out.println("total jumlah kursi di semua bus : " + totalKursi);
        System.out.println("harga sewa per kursi : " + sewaPerKursi);
    }
}
