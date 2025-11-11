import java.util.Scanner;

public class Day65 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan angka fakotiral : ");
        int n = in.nextInt();
        System.out.println("Faktorial dari " + n + "!");
        int tmp = 1;
        for (int i = n; i >= 1; i--) {
            System.out.print(i);
            if(i > 1){
                System.out.print(" x ");
            }
            tmp *= i;
        }
        System.out.print(" = " + tmp);
    }
}
