import java.util.Scanner;
public class Day60 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan inputan N :");
        int n = input.nextInt();
        System.out.print("Angka ganjil : ");

        for (int i = n; i> 0; i--){
            if (i % 2 == 1){
                System.out.print(i + " ");
            }
        }
        System.out.println("");
        System.out.print("angka genap : ");
        for (int i = n; i > 0; i--){
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }

    }
}
