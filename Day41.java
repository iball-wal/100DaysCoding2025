import java.util.Scanner;

public class Day41 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka :");
        int n = input.nextInt();
        if (n % 2 == 0){
            System.out.println("bilangan genap");
        }else {
            System.out.println("Bilangan ganjil");
        }
    }
}
