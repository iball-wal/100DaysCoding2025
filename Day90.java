public class Day90 {
    public static void main(String[] args) {
        Day90 day90 = new Day90();
        int max = day90.maxx(20,30);
        int min = day90.minn(20,30);
        System.out.println("Nilai max : " + max);
        System.out.println("Nilai min : " + min);
    }

    int maxx(int a, int b){
        int max = (a > b) ? a : b;
        return max;
    }

    int minn(int a, int b){
        int min = (a < b) ? a : b;
        return min;
    }
}
