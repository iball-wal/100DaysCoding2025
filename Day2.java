public class Day2 {
    public static void main (String[]args){
        // 1. Print Line
        System.out.println("------SOAL 1-------");
        System.out.println("Saya akan bertahan selama 100 Hari Ngoding , dan akan menjadi anggota resmi ISC ");
        System.out.println();
        // 2. print
        System.out.println("------SOAL 2-------");
        System.out.print("Selamat telah menjadi anggota ISC ");
        System.out.print("Selamat telah menjadi anggota ISC ");
        System.out.println("");

        // 3.printf
        System.out.println("------SOAL 3-------");
        // data diri
        String nama = "Muhammad iqwal";
        String nim = "D0224025";
        char kelas = 'C';
        int umur = 19;
        double tinggiBadan = 170.2;

        // Mwncetak menggunakan printf
        System.out.printf("|%-5s : %-18s |%n", "Nama",nama);
        System.out.printf("|%-5s : %-18s |%n", "NIM", nim);
        System.out.printf("|%-5s : %-18c |%n", "Kelas", kelas);
        System.out.printf("|%-5s : %-18d |%n", "Umur", umur);
        System.out.printf("|%-5s : %-18.1f | ", "TB" , tinggiBadan);



    }
}
