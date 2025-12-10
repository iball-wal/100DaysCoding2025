public class Day94 {
    public static void main(String[] args) {
        garisPembatas();
        kotakNama("Iqwal");
        garisPembatas();
        System.out.println("1. New Game\n2. Load Game\n3. Exit");
        garisPembatas();


    }

   static void garisPembatas(){
        System.out.println("-----------------");
    }

    static void kotakNama(String nama) {
        System.out.println("| Player : " + nama + " |");
    }
    
}
