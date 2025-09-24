import java.util.Scanner;

public class Day17 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("masukkan jumlah murid : ");
        int jumlahMurid = input.nextInt();
        System.out.print("Masukkan jumlah permen : ");
        int jumlahPermen = input.nextInt();

        int permenSetiapMurid = jumlahMurid / jumlahPermen;
        System.out.println("permen setiap murid : " + permenSetiapMurid);
        int sisaPermen = jumlahMurid % jumlahPermen;
        System.out.println("sisa murid : " + sisaPermen);
        
    }
}
