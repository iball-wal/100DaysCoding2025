import java.util.Scanner;
public class Day55 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=== Soal Pertama ===");
            System.out.print("Batas bawah: ");
            int b = sc.nextInt();
            System.out.print("Batas atas: ");
            int a = sc.nextInt();
            System.out.print("Angka: ");
            int angka = sc.nextInt();
            if (angka > b && angka < a) {
                System.out.println("YAYAYAYA");
            } else {
                System.out.println("NONONONO");
            }

            System.out.println("\n=== Soal kedua ===");
            System.out.print("Masukkan nilai : ");
            int nilai = sc.nextInt();

            if (nilai > 70) {
                System.out.println("Ujian Kroco Ji Pale");
            } else {
                System.out.println("Sa Jappo'ka Aih");
            }

            System.out.println("\n=== Soal Tiga ===");
            System.out.print("Masukkan angka : ");
            int angka1 = sc.nextInt();

            if (angka1 % 2 == 0) {
                System.out.println("Iyaji");
            } else {
                System.out.println("Tidakji");
            }

        }
    }
