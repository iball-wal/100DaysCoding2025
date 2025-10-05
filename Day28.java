import java.util.Scanner;
public class Day28 {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Masukkan value a : ");
            int a= sc.nextInt();
            System.out.print("Masuukan value b : b: ");
            int b= sc.nextInt();

            boolean c= a == b;
            boolean d= a!= b;
            System.out.println("Apakah "+a+" sama dengan "+b+"? "+c);
            System.out.println("Apakah "+a+" tidak sama dengan "+b+"? "+d);
        }
    }


    
