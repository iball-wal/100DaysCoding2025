import java.util.Scanner;

public class Day87 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("masukkan judul buku yang i cari  : ");
        String bukuX = in.nextLine();
        String daftarBulu [] = {"Harry Potther","Lord of the Rings",
                                "Alchemist","Sherlock Holmes","Hobbit"};
        boolean status = false;
        for(int i = 0; i < daftarBulu.length; i++){
//
            if(bukuX.equalsIgnoreCase(daftarBulu[i])){
                System.out.println("Buku '" + daftarBulu[i] + "' di temukan di index ke : " + i);
                status = true;
                break;
            }
        }

        if(!status){
            System.out.println("Buku tidak ditemukan");
        }

    }
}
