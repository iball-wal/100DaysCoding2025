import java.util.Scanner;
public class Day79 {
    public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                System.out.println("=== Sistem Registrasi Akun ===");
                String usn;
                String pass;

                while(true){
                    System.out.print("Buat Username: ");
                    usn = sc.nextLine();
                    if (usn.isEmpty()) {
                        System.out.println("Username tidak boleh kosong!");
                    }else{
                        break;
                    }
                }

                while(true){
                    System.out.print("Buat Password: ");
                    pass = sc.nextLine();
                    if (pass.isEmpty()) {
                        System.out.println("Password tidak boleh kosong!");
                    }else{
                        break;
                    }
                }

                System.out.println("Akun Berhasil dibuat!");
                System.out.println("========================");
                String username,password;
                while(true){
                    System.out.println("=== Login ke Akun ===");
                    System.out.print("Masukkan Username: ");
                    username = sc.nextLine();
                    System.out.print("Masukkan Password: ");
                    password = sc.nextLine();

                    if (username.equals(usn) && password.equals(pass)) {
                        System.out.println("Login Berhasil! Selamat datang, "+usn+"!");
                        break;
                    }else{
                        System.out.println("Gagal: Username atau Passwprd Salah! Silahkan coba lagi.");
                    }

                }
                System.out.println("Sistem Selesai");
            }
        }
