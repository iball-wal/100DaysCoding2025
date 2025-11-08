import java.util.Scanner;

public class Day62 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan : ");
        int n = in.nextInt();
        int tmp = 0;
        System.out.println("Total jumlah dari 1 sampai " + n + " adalah : ");
        for (int i = 1; i <= n; i++) {
            tmp += i;
            System.out.print(i);
            if(i < n){
                System.out.print( " + ");
            }
        }
        System.out.print(" = " + tmp);
    }
}
