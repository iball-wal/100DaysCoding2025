public class Day15 {
    public static void main(String[] args) {
        String ang1 = "12";
        String ang2 = "30";

        String hasilBefore = ang1 + ang2;
        System.out.println("sebelum parse : " +hasilBefore);

        int ang1Int = Integer.parseInt(ang1);
        int ang2Int = Integer.parseInt(ang2);

        int hasilpenjumlahan = ang1Int + ang2Int;
        int hasilPengurangan = ang1Int - ang2Int;

        System.out.println("hasil penjumlahlan setelah parse : " + hasilpenjumlahan);
        System.out.println("hasil pengurangna setelah parse : " + hasilPengurangan);
    }
}
