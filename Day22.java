import java.util.Scanner;
public class Day22 {
    public static void main(String[] args) {
        // Hitung Luas Pesegi 
        Scanner in = new Scanner(System.in);
        System.out.print("Maukkan nilai sisi : ");
        double N = in.nextInt();
        double luasPersegi = Math.pow(N, 2);
        System.out.printf("Luas Pesegi = %.1f", luasPersegi);
    }
}
