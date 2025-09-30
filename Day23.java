import java.util.Scanner;

public class Day23 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Masukkan panjang :  ");
        int n = sc.nextInt();

        System.out.print("Masukkan lebar : ");
        int x = sc.nextInt();

        int hasil = n * x;
        System.out.println("Luas persegi Panjang = " + hasil);
    }
}
