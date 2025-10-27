import java.util.Scanner;

public class Day50 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkank angka : ");
        int n = input.nextInt();
        String hasil = (n % 2 == 0) ? "genap" : "ganjil";
        System.out.println("angka " + n + " adalah bilangan " + hasil);
    }
}
