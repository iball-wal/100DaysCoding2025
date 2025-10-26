public class Day49 {
    public static void main(String[] args) {
        System.out.println("----Operator ternary (?)----");

        //1. ternary pada int
        int a = 10;
        int b = 20;
        int hasil = (a > b) ? a : b;
        System.out.println("1.Nilai terbesar antara " + a + " dan " + b + " adalah " + hasil);

        //2. ternary pada String
        String status = (a + b > 25) ? "angkanya besar" : "ankganya kecil";
        System.out.println("2.Stasu jumlah :" + status);

        //3 Ternary pada tipe data boolean
        boolean kondisi = (a == b) ? true : false;
        System.out.println("3.Apakah :" + a + "sama dengan " + b + " ? " + kondisi);

        //4. Ternary pada tipe data double
        double suhu = 45.9;
        String kondisiTubuh = (suhu > 37.0) ? "Demam ringan" : "normal";
        System.out.println("4.Suhu tubuh " + suhu + "C : " + kondisiTubuh);

        //5.Ternery bersarang (nested ternery)
        int nilai = 90;
        String konver = (nilai >= 90) ? "A" :
                        (nilai >= 80) ? "B" : (nilai >= 70) ? "C" : "D";
        System.out.println("5.Nilai ujian " + nilai + "konver :" + konver);

        //6.Ternary untuk memilih karakter (char)
        char simbol = (konver.equals("A")) ? '★' : '☆';
        System.out.println("6.Simbol pengharagaan :" + simbol);

        //7. diskon menggunakan ternary
        double harga = 120;
        double diskon = (harga > 100) ? harga * 0.10 : 0;
        System.out.println("7.Total yang harus di bayar : " + (harga - diskon));
        System.out.println(diskon);
    }
}
