package LapTrinhJavaCoBan;

import java.util.Scanner;
import java.math.BigInteger;

public class J03033_BoiSoChungNhoNhat {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();

            BigInteger gcd = a.gcd(b);

            BigInteger lcm = a.divide(gcd).multiply(b);

            System.out.println(lcm);
        }
    }
}