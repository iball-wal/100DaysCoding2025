import java.util.Scanner;
public class Day34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("=== PROGRAM SELEKSI ASTRONOT MISI KE MARS ===");
        System.out.print("Masukkan total jam latihan: ");
        int jamLatihan = sc.nextInt();

        System.out.print("Masukkan tingkat kesehatan (0 - 100): ");
        int kesehatan = sc.nextInt();

        System.out.print("Masukkan jumlah misi yang sudah diikuti: ");
        int jumlahMisi = sc.nextInt();

        System.out.print("Apakah kamu memiliki sertifikat pelatihan luar angkasa? ");
        boolean punyaSertifikat = sc.nextBoolean();

        System.out.print("Apakah kamu anggota baru NASA? (true/false): ");
        boolean anggotaBaru = sc.nextBoolean();

        boolean syaratFisik = (kesehatan >= 75) && (jamLatihan > 500);
        boolean syaratPengalaman = (jumlahMisi >= 2 || punyaSertifikat);
        boolean syaratKhusus = !anggotaBaru || (punyaSertifikat && kesehatan > 85);
        boolean lolosSeleksi = syaratFisik && syaratPengalaman && syaratKhusus;

     
        System.out.println("\n--- HASIL EVALUASI ---");
        System.out.println("Syarat fisik terpenuhi: " + syaratFisik);
        System.out.println("Syarat pengalaman terpenuhi: " + syaratPengalaman);
        System.out.println("Syarat khusus terpenuhi: " + syaratKhusus);
        System.out.println("Apakah kamu lolos seleksi astronot? " + lolosSeleksi);
    }
}
