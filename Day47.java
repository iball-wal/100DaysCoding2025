import java.util.Scanner;
public class Day47 {
    
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("=== PROGRAM HARI ===");
            System.out.println("1. Senin");
            System.out.println("2. Selasa");
            System.out.println("3. Rabu");
            System.out.println("4. Kamis");
            System.out.println("5. Jumat");
            System.out.println("6. Sabtu");
            System.out.println("7. Minggu");
            System.out.println("=============================");

            System.out.print("Masukkan angka(1-7): ");
            int angka = sc.nextInt();

            switch(angka){
                case 1:
                    System.out.println("Hari ini adalah hari Senin.");
                    System.out.println("Hari Kerja");
                    break;
                case 2:
                    System.out.println("Hari ini adalah hari Selasa.");
                    System.out.println("Hari kerja");
                    break;
                case 3:
                    System.out.println("Hari ini adalah hari Rabu.");
                    System.out.println("Hari kerja");
                    break;
                case 4:
                    System.out.println("Hari ini adalah hari Kamis.");
                    System.out.println("Hari Kerja");
                    break;
                case 5:
                    System.out.println("Hari ini adalah hari Jumat.");
                    System.out.println("Hari Kerja");
                    break;
                case 6:
                    System.out.println("Hari ini adalah hari Sabtu.");
                    System.out.println("Hari Libur");
                    break;
                case 7:
                    System.out.println("Hari ini adalah hari Minggu.");
                    System.out.println("Hari Libur");
                    break;
                default:
                    System.out.println("Nomor hari tidak valid");
            }
        }

    }

