import java.util.Scanner;

public class Day63 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan bilangan N : ");
        int n = input.nextInt();
        int tmp = 1;
        for (int i = 1; i <= n; i++) {
            tmp *= i;
            System.out.print(i);
            if(i < n ){
                System.out.print( " x ");
            }


        }
        System.out.println(" = " + tmp);
    }
}
