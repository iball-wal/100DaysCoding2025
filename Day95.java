class Day95{
    public static void main(String[] args) {
        Day95 day95  = new Day95();
        day95.gambarSegitiga(5, '#');
        day95.gambarSegitiga(4, '*');
        day95.cetakStruk("Indomie",5,15000);
        day95.cetakStruk("Sedap",2,10000);

    }

    void gambarSegitiga(int tinggi , char simbol){
        for (int i = 1; i <= tinggi; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(simbol);
            }
            System.out.println();
        }
        System.out.println("---------------------");
    }

    void cetakStruk (String barang, int jumlah , int harga){
        System.out.println("Barang : " + barang + "\nQty : " + jumlah + " x " + harga);
        System.out.println("Total : " + (jumlah * harga));
        System.out.println("-------------------------");
    }
}
