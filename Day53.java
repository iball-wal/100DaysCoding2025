import java.util.Scanner;

public class Day53 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan warna anda : ");
        String warna = input.nextLine();

        // Break menggunakan swtic cases
        switch(warna.toLowerCase()) {
            case "red" :
                System.out.println("Warna yang anda pilih warna merah");
                break;
            case "blue" :
                System.out.println("Warna yang anda pilih biru");
                break;
            case "yellow" :
                System.out.println("Warna yang anda pilih kuning");
                break;
            case "pink" :
                System.out.println("Warna yang anda pilih pink");
                break;
            default :
                System.out.println("warna tidak valid");
                break;
        }
        System.out.print("Masukkan angka yang anda cari :");
        int n = input.nextInt();
        // break menggunakan for
        for (int i = 1; i <= 5; i++) {
            if (i == n){
                System.out.println("Angka yang di cari telah di temukan yaitu : " + i);
                System.out.println("Break saat i = " + i);
                break;
            }
        }
        System.out.println("Loop for selesai\n");

        // break menggunakan while
        System.out.print("Masukkan angka ke 2 yang ingin di cari : ");
        int o = input.nextInt();
        int i = 1;
        while (i <=  5) {
            if (i == o){
                System.out.println("Break saat i = " +  i);
                System.out.println("Angka yang di cari telah diemukan yaitu : " + i);
                break;
            }
            i++;
        }
        System.out.println("Loop while selesai\n");

        // break menggunakan do-while
        System.out.print("Masukkan angka ke 3 yang di cari : ");
        int p = input.nextInt();
        int j = 1;
        do {
            if (j == p ){
                System.out.println("Break saat j = " +  j);
                System.out.println("Angka yang anda cari telah di temukan yaitu :" + j);
                break;
            }
            j++;

        }while (j <= 5);
        System.out.println("Loop do-while selesai");
    }
}
