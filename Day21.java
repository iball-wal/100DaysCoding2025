package Latihan_Pertemuan1;

public class Day21 {
    public static void main(String[] args) {
        // cara aritmatika

        int nilai1 = 12;
        int nilai2 = 10;

        System.out.println("---Nilai sebelum di tukar--- ");
        System.out.println("Nilai 1: " + nilai1);
        System.out.printf("Nilai 2: " + nilai2);
        System.out.println("");

        nilai1 = nilai1 + nilai2;
        nilai2 = nilai1 - nilai2;
        nilai1 = nilai1 - nilai2;


        System.out.println("---Nilai setelah di tukar---");
        System.out.println("nilai 1 : " + nilai1);
        System.out.println("nilai 2 : " + nilai2);

        // cara XOR (bitwes XOR)
        int a = 20;
        int b = 22;

        System.out.println("---Nilai sebelum di tukar--- ");
        System.out.println("Nilai a : " + a);
        System.out.printf("Nilai 2 : " + b);
        System.out.println("");

        a = a^b;
        b = a ^ b;
        a = a^b;

        System.out.println("---Nilai setelah di tukar---");
        System.out.println("nilai a :  " + a);
        System.out.println("nilai b :  " + b);


    }
}
