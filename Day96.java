import java.util.Scanner;

public class Day96 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka 1 : ");
        int x  = in.nextInt();
        System.out.print("Masukkan angka 2 : ");
        int y = in.nextInt();
        System.out.println("Penjumlahan : " + tambah(x,y));
        System.out.println("Pengurangan : " + kurang(x,y));
        System.out.println("Perkalian : " + kali(x,y));
        System.out.println("Pembagian : " + bagi(x,y));



    }

    static int tambah (int a , int b){
        return a + b;
    }

    static int kurang (int a , int b){
        return (a - b);
    }

    static int kali (int a , int b){
        return (a * b);
    }

    static double bagi (int a , int b){
        return (double) a/b;
    }
}
