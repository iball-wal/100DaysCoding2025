import java.util.Scanner;

public class Day52 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int angkaRahasia = 7;
        System.out.print("Masukkan angka tebakan : ");
        int angkaTebakan = sc.nextInt();

        while(angkaTebakan != angkaRahasia){
            System.out.println("Tebak angka rahisa dari (1-10)");
            angkaTebakan = sc.nextInt();
        }
        System.out.println("Selamat tebakan anda benar!!!");
    }
}
