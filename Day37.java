import java.util.Scanner;

public class Day37 {
    public static void main(String[] args) {
        System.out.print("Masukkan inputan angka anda : ");
        Scanner in  = new Scanner(System.in);
        int n = in.nextInt();
        if(n%2==0){
            System.out.println(n + " : adalah bilangan genap");
        }else{
            System.out.println(n + " : adalah bilangan ganjil");
        }
    }
}
