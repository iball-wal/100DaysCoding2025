import java.util.Scanner;
public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Apakah anda memiliki kartu akses ? : ");
        boolean kartuAkses = input.nextBoolean();
        if(kartuAkses){
            System.out.print("oke nice\nsekarang,apakah sekarang jadwal anda untuk piket ? : ");
            boolean jadwalPaket = input.nextBoolean();
            if(jadwalPaket == true){
                System.out.print("good\n langkah terkahir silahkan Masukkan kode anda : ");
                int kodeAkses = input.nextInt();
                if(kodeAkses == 111){
                }else {
                    System.out.println("Pin yang anda masukan salah ");
                }
            }else {
                System.out.println("Jadwal anda bukan hari ini ");
            }
        }else {
            System.out.println("Kartu anda tidak valid");
        }
    }
}
