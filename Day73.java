import java.util.Scanner;

public class Day73 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int tmp = 0;
        while (true) {
            int n = in.nextInt();
            if (n < 0){
                break;
            }
            tmp += n;

        }
        System.out.println("Hail penjumlahan : " + tmp);
    }
}
