import java.util.Scanner;

public class Dy78 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("------Daftar akun------");
        System.out.print("\nMasukkakn user name : ");
        String text = in.nextLine();
        text = text.trim();

        if(text.isEmpty()){
            System.out.println("Error!!, user name tidak boleh kosong.");
            return;
        }

        if (text.length() > 12){
            System.out.println("Error!!, Username terlalu panjang max 12.");
            return;
        }

        System.out.print("Masukkan pasword: ");
        String pw = in.nextLine();

        if(pw.length() < 8){
            System.out.println("Error!!, Paaword minimal 8 charater.");
            return;
        }
        
        if (pw.toLowerCase().contains("admin")){
            System.out.println("Error!!. Passsword tidak boleh mengandung kata 'admin'");
            return;
        }
        
        if (!Character.isUpperCase(pw.charAt(0))) {
            System.out.println("Error: Password harus dimulai dengan huruf kapital.");
            return;
        }

        System.out.print("Ulangi Password: ");
        String repeatPw = in.nextLine();
        
        if (!pw.equals(repeatPw)) {
            System.out.println("Error, Password tidak cocok.");
            return;
        }

        System.out.println("\nSukses...Pendaftaran berhasil");
        System.out.println("Username '" + text.toUpperCase() + "' telah aktif.");

    }
}
