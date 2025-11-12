import java.util.Scanner;

public class Day66 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan panjang bvertikal sebesar angka N :");
        int n =  in.nextInt();
        int i = 0;
        while(i < n){
            System.out.println("|");
            i++;
        }
    }
}
