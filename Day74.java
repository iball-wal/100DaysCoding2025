import java.util.Scanner;

public class Day74 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double total = 0;
        int pilihan;

        do {
            System.out.println("\n--- DAFTAR MENU ---");
            System.out.println("1. Nasi kuning Rp 10.000");
            System.out.println("2. Es Teh Panas Rp 5.000");
            System.out.println("3. Kopi Susu Rp 5.000");
            System.out.println("4. Bakso Kuah Rp 10.000");
            System.out.println("5. Selesaikan Pembayaran");
            System.out.print("Pilih menu yang akan anda pesan: ");
             pilihan = in.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Pesanan Nasi Kuning anda berhasil ");
                    total += 10.000;
                    break;
                case 2:
                    System.out.println("Pesanan Es teh panas anda berhasil ");
                    total += 5.000;
                    break;
                case 3:
                    System.out.println("Pesanan Kopi susu anda berhasil ");
                    total += 5.000;
                    break;
                case 4:
                    System.out.println("Pesanan Bakso kuah anda berhasil");
                    total += 10.000;
                    break;
                case 5:
                    if(total == 0){
                        System.out.println("Tidak jadi pesan");
                    }else {
                        System.out.println("Total harga pesanan adna : " + total);
                    }
                    break;
                default:
                    System.out.println("Pesanan anda tidak valid");
            }
        }while(pilihan != 5);
    }
}
