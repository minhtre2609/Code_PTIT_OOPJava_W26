package LapTrinhJavaCoBan;

import java.math.BigInteger;
import java.util.Scanner;

public class J01022_XauNhiPhan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        BigInteger[] len = new BigInteger[94];
        len[1] = BigInteger.ONE;
        len[2] = BigInteger.ONE;

        for (int i = 3; i <= 93; i++) {
            len[i] = len[i - 2].add(len[i - 1]);
        }

        while (t-- > 0) {
            int n = sc.nextInt();
            BigInteger k = sc.nextBigInteger();

            while (n > 2) {
                if (k.compareTo(len[n - 2]) <= 0) {
                    n = n - 2;
                } else {
                    k = k.subtract(len[n - 2]);
                    n = n - 1;
                }
            }

            if (n == 1)
                System.out.println(0);
            else
                System.out.println(1);
        }
    }
}
