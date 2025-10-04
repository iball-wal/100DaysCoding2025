import java.util.Scanner;

public class Day27 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan nilai panjang : ");
        int p = input.nextInt();
        System.out.print("Masukkan nilai Lebar : ");
        int l = input.nextInt();
        int a = 2;

        int luasPersegiPanjang = p*l;
        double total = luasPersegiPanjang/ Math.pow(a,2);
        int hasil = (int)total;
        System.out.println("Total : " + total);
        System.out.println(hasil);
    }
}
