public class Day81 {
    public static void main(String[] args) {
                int []nilaiSiswa = new int [5];
                nilaiSiswa[0]=85;
                nilaiSiswa[1]=90;
                nilaiSiswa[2]=78;
                nilaiSiswa[3]=88;
                nilaiSiswa[4]=95;

                System.out.println("=== Data Nilai Awal ===");
                System.out.println("Nilai Siswa pertama: "+nilaiSiswa[0]);
                System.out.println("Nilai Siswa Terakhir: "+nilaiSiswa[4]);

                System.out.println("=== Update Data ===");
                System.out.println("Nilai lama siswa ke-3: "+nilaiSiswa[2]);
                nilaiSiswa[2] = 100;
                System.out.println("Nilai baru siswa ke-3: "+nilaiSiswa[2]);

                System.out.println("=== Operasi Matematika ===");
                System.out.println("Rata-rata Nilai Siswa 1 & 2 : "+((nilaiSiswa[0]+nilaiSiswa[1])/2.0));
            }
        }
 
