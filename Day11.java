import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        // String
        System.out.print("dari prodi akuntansi ki toh, btw nama ta' siapa ? kalau saya dari prodi : ");
        String nama = in.nextLine();

        // byte
        System.out.print("ohhh kalau saya angkatan : ");
        byte angkatan = in.nextByte();

        // short
        System.out.print("ku tebak pasti umur ta' : ");
        short tahu = in.nextShort();

        // int
        System.out.print("apa tahun lahir ku ?, kalau saya lahir tahun : ");
        int lahir = in.nextInt();

        // long
        System.out.print("hahaha balle-balle ja' yang benar itu tahun : ");
        long real = in.nextLong();

        // double
        System.out.print("eh ada gah matkul ta nanti jam : ");
        double matkul = in.nextDouble();

        // float
        System.out.print("oo ada, kalau jam : ");
        float jam = in.nextFloat();

        // boolean
        System.out.print("bisa ka ajakki codingi Code date eaaaaaaaa (true/false): ");
        boolean balasan = in.nextBoolean();

        // char (dari string, ambil huruf ke-3)
        System.out.print("code (minimal 3 huruf): ");
        String lambang = in.next();
        char hurufKetiga = lambang.charAt(2);

        // Output
        System.out.println("\n=== HASIL INPUT ===");
        System.out.println(nama);
        System.out.println(angkatan);
        System.out.println(tahu);
        System.out.println(lahir);
        System.out.println(real);
        System.out.println(matkul);
        System.out.println(jam);
        System.out.println(balasan);
        System.out.println(hurufKetiga);

        in.close();
    }
}
