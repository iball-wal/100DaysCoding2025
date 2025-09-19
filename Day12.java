import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("--- Program Input Data ---");
        System.out.println("Masukkan Nama Lengkap Anda: ");
        System.out.print("> ");
        String namaLengkap = input.nextLine();
        System.out.println("Maukkan NIM Anda: ");
        System.out.print("> ");
        String nim = input.next();
        System.out.println("Masukkan Umur Anda: ");
        System.out.print("> ");
        int umur = input.nextInt();
        System.out.println("Masukkan Kelas Anda (A/B/C):");
        System.out.print("> ");
        char kelas = input.next().charAt(0);
        System.out.println("Masukkank IPK Anda: ");
        System.out.print("> ");
        double ipk = input.nextDouble();

        System.out.println("==============================");
        System.out.printf("%25s\n"," BIODATA MAHASISWA ");
        System.out.println("==============================");
        System.out.printf("%-10s : %s\n", "Nama", namaLengkap);
        System.out.printf("%-10s : %s\n", "NIM", nim);
        System.out.printf("%-10s : %d tahun\n", "Umur", umur);
        System.out.printf("%-10s : %c\n", "Kelas", kelas);
        System.out.printf("%-10s : %.2f\n", "IPK", ipk);

    }
}
