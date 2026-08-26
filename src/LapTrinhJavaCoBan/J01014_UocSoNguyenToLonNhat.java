package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01014_UocSoNguyenToLonNhat {

    static long timUocLonNhat(long n) {
        long max = 1;

        while (n % 2 == 0) {
            max = 2;
            n /= 2;
        }

        for (long i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                max = i;
                n /= i;
            }
        }

        if (n > 1) {
            max = n;
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long n = sc.nextLong();
            System.out.println(timUocLonNhat(n));
        }
    }
}