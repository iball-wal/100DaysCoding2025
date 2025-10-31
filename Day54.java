import java.util.Scanner;

public class Day54 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Masukkan huruh awal :");
        String huruf = in.nextLine();
        for (int i = 0; i < huruf.length(); i++) {
            char c = huruf.charAt(i);
            String s = String.valueOf(c);
            if(s.equalsIgnoreCase("A") || s.equalsIgnoreCase("D")){
                continue;
            }
            System.out.println("Huruf sekarang \" " + s  + " \" ");
        }
        System.out.println("");
        System.out.println("while");
        int i = 0;
         while(i < huruf.length()){
             char c = huruf.charAt(i);
             String s = String.valueOf(c);

             if(s.equalsIgnoreCase("B") || s.equalsIgnoreCase("C")){
                 i++;
                 continue;
             }
             System.out.println("Hurruf sekarang \" " + s  + " \" ");
             i++;

         }
        System.out.println("");
        System.out.println("do-while");
        int j = 0;
        do{
            char c = huruf.charAt(j);
            String s = String.valueOf(c);
            if(s.equalsIgnoreCase("E") || s.equalsIgnoreCase("G")){
                j++;
                continue;
            }
            System.out.println("Hurruf sekarang \" " + s  + " \" ");
            j++;
        }while(j < huruf.length());
    }
}
