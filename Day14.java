public class Day14 {
    public static void main(String[] args) {
        String tipeTeks = "123";
        String tipeTeks2 ="12.2";
        String tipeTeks3 ="true";

        byte b = Byte.parseByte(tipeTeks);
        short s = Short.parseShort(tipeTeks);
        int i = Integer.parseInt(tipeTeks);
        long l = Long.parseLong(tipeTeks);
        double d=  Double.parseDouble(tipeTeks2);
        float f = Float.parseFloat(tipeTeks2);
        boolean boo= Boolean.parseBoolean(tipeTeks3);


        System.out.println("Nilai byte : " + b);
        System.out.println("Nilai short : " + s);
        System.out.printf("nilai int : " + i);
        System.out.println("nilai long : " + l);
        System.out.println("nilai float : " + f);
        System.out.println("nilai double : " + d);
        System.out.println("nilai boolean : " + boo);


    }
}
