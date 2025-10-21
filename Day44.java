import java.util.Scanner;
public class Day44 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=== Input Data Mahasiswa ===");
            System.out.print("Masukkan Nama Mahasiswa: ");
            String nama = sc.nextLine();

            System.out.println("--- Mata Kuliah 1 ---");
            System.out.print("Masukkan Nama Mata Kuliah: ");
            String matkul1 = sc.nextLine();
            System.out.print("Masukkan nilai (0-100): ");
            int nilai1 = sc.nextInt();
            sc.nextLine();
            System.out.println("--- Mata Kuliah 2 ---");
            System.out.print("Masukkan Nama Mata Kuliah: ");
            String matkul2 = sc.nextLine();
            System.out.print("Masukkan nilai (0-100): ");
            int nilai2 = sc.nextInt();
            double mean = (nilai1+nilai2)/2;
            String predikat, status;
            if (mean > 90 && mean <= 100) {
                predikat = "A";
            } else if (mean > 80 && mean <= 90) {
                predikat = "B";
            } else if (mean > 70 && mean <= 80) {
                predikat = "C";
            } else if (mean > 60 && mean <= 70) {
                predikat = "D";
            } else if (mean <= 60 && mean >= 0) {
                predikat = "E";
            } else {
                predikat = "Nilai tidak valid";
            }

            int sks;
            if (!predikat.equals("E")) {
                status = "LULUS";
                sks = 24;
            } else {
                status = "TIDAK LULUS";
                sks = 20;
            }

            System.out.println("\n=== Hasil Pembelajaran Semester ===");
            System.out.println("Nama Mahasiswa : " + nama);
            System.out.println("--- Rincian Nilai ---");
            System.out.println("Mata Kuliah 1  : " + matkul1 + ", Nilai: " + nilai1);
            System.out.println("Mata Kuliah 2  : " + matkul2 + ", Nilai: " + nilai2);
            System.out.println("--- Status Akhir ---");
            System.out.println("Status semester : " + status);
            System.out.println("Total SKS       : " + sks);
            System.out.println("Predikat        : " + predikat);
            System.out.printf("Mean (Rata-rata): %.2f\n", mean);

        }
    }

