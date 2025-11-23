import java.util.Scanner;
public class Day77 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan inputan : ");
        String teks = in.nextLine();
        System.out.println(teks);
        teks = teks.trim();
        teks = teks.replaceAll("-", " ");
        teks = teks.substring(1);
        teks = teks.toUpperCase();
        System.out.println("\n------Data setelah cleaning------");
        System.out.println(teks );

    }
}
