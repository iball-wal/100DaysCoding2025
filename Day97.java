import java.util.Scanner;

public class Day97 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("-- Program Hitung Luas Persegi --");
        System.out.print("Masukkan panjang sisi : ");
        int m = in.nextInt();
        int luas = hitungLuas(m);
        System.out.print("Luas persegi dengan sisi " + m + " adalah " + luas);
    }

    static int hitungLuas(int a){
        return  a*a;
    }
}
