public class Day25 {
    public static void main(String[] args) {
        int a = 2;
        a++;
        int b = 2;
        b--;
        System.out.println("nilai increment :" + a);
        System.out.println("nilai decrement :" + b);
        
        System.out.println(" pre-post");
        
        
        
        --b;
        ++a;
        System.out.println("nilai increment :" + a);
        System.out.println("nilai decrement :" + b);
    }
}
