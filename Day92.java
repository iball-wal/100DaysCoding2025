public class Day92 {
    public static void main(String[] args) {
        Day92 day92 = new Day92();
        int a = 12;
        int b = 15;
        int hasil =day92.jumlahBilangan(a,b);
        System.out.println(a + " + " + b + " = " + hasil);
    }
    
    int jumlahBilangan (int x, int y){
        return x + y;
    }
}
