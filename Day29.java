import java.util.Scanner;
public class Day29 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println(">>> SELAMAT DATANG DI WAHANA KEMATIAN <<<");
                System.out.println(">>> Silahkan Masukkan Persyaratan <<<");
                System.out.print("Masukkan tinggi badan : ");
                int tb = sc.nextInt();
                System.out.print("Masukkan berat badan : ");
                int bb = sc.nextInt();

                System.out.println(">>> Data Pengunjung <<<");
                System.out.printf("%-15s : %d cm %n", "Tinggi Badan", tb);
                System.out.printf("%-15s : %d kg %n", "Berat Badan", bb);

                boolean deteksi1 = (tb > 150) & (bb < 80);
                System.out.println("Apakah kamu diizinkan naik? " + (deteksi1));
                
            }
        }
    
