public class Day91 {
    public static void main(String[] args) {
        Day91 d = new Day91();
        d.hitungGaji("Iqwal",5);
        d.hitungGaji("Adam",8);
    }

    void hitungGaji(String nama, int jumlahJamKerja){
        double gaji = jumlahJamKerja * 50.000;
        System.out.printf("Karyawan %s bekerja %d jam mendapatkan gaji : %.3f \n",nama,jumlahJamKerja,gaji);
    }

}
