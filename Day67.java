import java.util.Scanner;

public class Day67 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang horizontal : ");
        int n = in.nextInt();
        int i = 0;
        do{
            System.out.print("_");
            i++;
        }while(i < n);
    }
}
