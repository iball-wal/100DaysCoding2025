package Evaluasi1;

import java.util.Scanner;
public class Soal2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        // soal 1
        final String judul = input.nextLine();
        char inisal = input.next().charAt(0);
        int jarak = input.nextInt();
        byte cc = input.nextByte();
        double tabungan = input.nextDouble();
        float jajan = input.nextFloat();
        short umur = input.nextShort();
        input.nextLine();
        long semester = input.nextLong();
        input.nextLine();
        boolean sakit = input.nextBoolean();



        System.out.println("judul : " + judul  + ". Disuatu hari mahasiswa dari kampus universitas sulawesi barat, sering terlambat datagn ke kampus di karenakan " +
                " dia tidak mempunyai kendaraan untuk menuju kampus tersebut. \ndan dia harus menempuh perjalnan se jauh " + jarak + " km "
                + ". dia ingin sekali memiliki kendaraan yang ber cc" + cc + "tetapi jumlah tabunganya hanya senilai " + tabungan + "\ndia pun selalu mengirit uang jajannya, jumlah uang jajan yagn dia keluarkan setiap hari hanya " + jajan
                + "inisal dari mahasiswa tersebut adalah" + inisal + " \ndan umur dari mahasiwa terserut " + umur
                + "sekarang dia sudah semester " + semester + "teamanya bertanhya apakah dia sedagn sakit " + sakit);
        
        //Soal 2
        
        System.out.print("Masukkan universitas : ");
        String univ =input.nextLine();
        System.out.print("Masukkan nama :");
        String nama =input.nextLine();
        System.out.print("Masukkan NIM : ");
        String Nim = input.nextLine();
        System.out.print("Masukkan Semester: ");
        int Semester = input.nextInt();
        System.out.print("Masukkan SKS : ");
        int sks = input.nextInt();
       System.out.print("Masukkan tahun masuk : ");
       int tahunMasuk = input.nextInt();
       System.out.print("Masukkan IPK : ");
      double ipk = input.nextDouble();
        System.out.print("Masukkan tinggi Badan : ");
        double tinggi = input.nextDouble();
        System.out.print("Masukkan gender (L/P) : ");
        char gender = input.next().charAt(0);
        System.out.print("Masukkan Status perkuliahan : ");
        boolean status = input.nextBoolean();

        System.out.println("==========BIODATA MAHASISWA============");
        System.out.printf("Universitas\t: %s \n",univ);
        System.out.printf("Nama\t\t: %s\n",nama);
        System.out.printf("NIm\t\t\t: %s\n",Nim);
       System.out.printf("Semester\t: %d\n",Semester);
         System.out.printf("SKS\t\t\t: %d\n",sks);
       System.out.printf("Tahun Masuk\t: %d\n",tahunMasuk);
        System.out.printf("IPK\t\t\t: %f.2\n",ipk);
        System.out.printf("Tinggi Badan: %f.2\n",tinggi);
         System.out.printf("Gender\t\t: %c\n",gender);
        System.out.printf("Status\t\t: %b",status);
        
        
        
        // soal 3
        System.out.print("Masukkan Nama : ");
        final String namaa =input.nextLine();
        System.out.print("Masukkan Umur : ");
        int umurr = input.nextInt();
        System.out.print("Masukkan Tinggi Badan : ");
        final int tinggii = input.nextInt();
        System.out.print("Masukkan Berat Badan : ");
        int berat = input.nextInt();
        input.nextLine();
        System.out.print("Masukkan Warna Mata : ");
        String warna = input.nextLine();
        System.out.println("Masukkan Golongan darah : ");
        char golongan = input.next().charAt(0);
        System.out.print("Masukkan Gender : ");
        char genderr = input.next().charAt(0);
        System.out.print("Masukkan Status : ");
        boolean statuss = input.nextBoolean();


        System.out.printf("Seorang remaja berumur %d tahun dengan nama %s memiliki tinggi \n" +
                "%d cm dengan berat %d kg. Ia memiliki mata %s dan ia juga \n" +
                "bergolongan darah %c dengan gender %c.  \n" +
                "Status (hidup / meninggal) : %b \n\n",umurr,namaa,tinggii,berat,warna,golongan,genderr,statuss);

        umurr = 20;
        berat = 34;
        warna = "hijau";
        golongan = 'A';
        genderr = 'P';
        statuss = false;

        System.out.printf("Seorang remaja berumur %d tahun dengan nama %s memiliki tinggi \n" +
                "%d cm dengan berat %d kg. Ia memiliki mata %s dan ia juga \n" +
                "bergolongan darah %c dengan gender %c.  \n" +
                "Status (hidup / meninggal) : %b",umurr,namaa,tinggii,berat,warna,golongan,genderr,statuss);



    }
}
