import java.util.Scanner;

public class Day100 {

    static Integer [] arrayBaru;
    static int n;

    static int retas(int[] arr) {
        n = arr.length;
        arrayBaru = new Integer[n];
        int p = 0;

        for (int x : arr) {
            int idx = x % n;

            if (arrayBaru[idx] == null) {
                arrayBaru[idx] = x;
            } else {
                int kosong = idx;
                do {
                    kosong = (kosong + 1) % n;
                } while (arrayBaru[kosong] != null);

                int i = kosong;
                while (i != idx) {
                    int prev = (i - 1 + n) % n;
                    arrayBaru[i] = arrayBaru[prev];
                    p++;
                    i = prev;
                }

                arrayBaru[idx] = x;
            }
        }
        return p;
    }


    static String susunKode(int p) {
        StringBuilder sb = new StringBuilder();


        for (int i = 0; i < n; i++) {
            if (arrayBaru[i] != null) {
                sb.append(arrayBaru[i]);
            }
        }

        if (p > sb.length()) {
            p = sb.length();
        }

        return sb.substring(0, p);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int p = retas(arr);
        String kode = susunKode(p);
        System.out.println(kode);

    }
}
