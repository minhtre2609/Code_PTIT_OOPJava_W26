package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01021_TinhLuyThua
{
    static final long MOD = 1000000007L;
    public static long mu(long a, long b)
    {
        long res = 1;
        a = a % MOD;
        while(b > 0)
        {
            if (b % 2 == 1) res = (res * a) % MOD;
            a = (a * a) % MOD;
            b /= 2;
        }
        return res;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            if (a == 0 && b == 0) break;
            System.out.println(mu(a, b));
        }
    }
}
