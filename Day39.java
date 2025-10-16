import java.util.Scanner;
public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("-----Pilihan Menu-----");
        System.out.println("|    1. Es Teh       |");
        System.out.println("|    2. Es Jeruk     |");
        System.out.println("|    3. Kopi Susu    |");
        System.out.println("----------------------");

        System.out.print("Ketik No menu anda : ");
        String menu = input.nextLine();
        if(menu.equals("1")){
            System.out.println("Anda memesan es teh dengan harga 5.000");
        } else if (menu.equals("2")) {
            System.out.println("Anda memasan es jeruk dengan harga 7.000");
        }else if (menu.equals("3")) {
            System.out.println("Anda memesan Kopi susu dengan harga 8.000");
        }else {
            System.out.println("Pilihlan tidak valid");
        }
    }
}
