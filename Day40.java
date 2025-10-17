import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Masukkan bilangan 1 : ");
        double x = in.nextInt();
        System.out.print("Masukkan operator : ");
        char op = in.next().charAt(0);
        System.out.print("Masukkan bilangan 2 : ");
        double y = in.nextInt();
        double hasil = 0;

        if (op == '*') {
            hasil = x * y;
            System.out.println(x + " * " + y + " = " + hasil);
        }else if (op == '/') {
            if (y !=0){
                hasil = x / y;
                System.out.println(x + " / " + y + " = " + hasil);
            }else {
                System.out.println("Error : tidak bisa membagi dengna 0");
            }
        }else if (op == '+') {
            hasil = x + y;
            System.out.println(x + " + " + y + " = " + hasil);
        }else if (op == '-') {
            hasil = x - y;
            System.out.println(x + " - " + y + " = " + hasil);
        }else if (op == '%') {
            if (y !=0){
                hasil = x % y;
                System.out.println(x + " % " + y + " = " + hasil);
            }else {
                System.out.println("Error : tidak bisa modulo dengna 0");
            }
        }

    }
}
