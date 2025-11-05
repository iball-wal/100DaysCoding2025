import java.util.Scanner;

public class Day59 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan angka N : ");
        int n = in.nextInt();
        System.out.print("angka ganji : ");
        for(int i = 0; i <= n; i++){
            if(i % 2 ==1){
                System.out.print(i +" ");
            }
        }
        System.out.println();
        System.out.print("angka genap : ");
        for(int i = 0; i <= n; i++){
            if(i % 2 == 0 && i != 0){
                System.out.print(i + " ");
            }
        }
    }
}
