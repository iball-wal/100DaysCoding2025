import java.util.Scanner;

public class Day75 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan nama kamu: ");
        String nama = in.nextLine();

        System.out.println("Panjang karakter: " + nama.length());
        System.out.println("Huruf kapital : " + nama.toUpperCase());
        System.out.println("Huruf kecil   : " + nama.toLowerCase());
    }
}
