import java.util.Scanner;

public class Day42 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);
        System.out.print("Masukkan gaji kotor : ");
        double GajiKotor = in.nextDouble();
        double Pajak = GajiKotor * 0.05;
        double gajiBersih = GajiKotor - Pajak;

        System.out.println("----- Rincihan Gaji kariawan -----");
        System.out.println("Gajij kotor \t:" + GajiKotor);
        System.out.println("Jumlah pajak \t:" + Pajak);
        System.out.println("Gaji bersih \t:" + gajiBersih);

    }
}
