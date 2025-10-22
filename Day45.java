import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----Nama nama hari-----");
        System.out.println("|     1.Hari Senin     |");
        System.out.println("|     2.Hari Selasa    |");
        System.out.println("|     3.Hari Rabu      |");
        System.out.println("|     4.Hari Kamis     |");
        System.out.println("|     5.Hari Jumat     |");
        System.out.println("|     6.Hari Sabtu     |");
        System.out.println("|     7.Hari Ahad      |");
        System.out.println("------------------------");
        System.out.println("");
        System.out.print("Masukkan angka 1-7 : ");
        int n = input.nextInt();
        String day;

        switch (n) {
            case 1:
                day = "Hari ini hari senin";
                break;
            case 2:
                day = "Hari ini hari selasa";
                break;
            case 3:
                day = "Hari ini hari Rabu";
               break;
            case 4:
                day = "Hari ini hari Kamis";
                break;
            case 5:
                day = "Hari ini hari Jumat";
                break;
            case 6:
                day = "Hari ini hari Sabtu";
                break;
            case 7:
                day = "Hari ini hari Ahad";
                break;
            default:
                day = "jumlah hari hanya 7";
        }

        System.out.println(day);

    }
}
