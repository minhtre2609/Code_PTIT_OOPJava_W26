package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01006_TinhSoFibonacci
{
    public static long fibonacci(long n)
    {
        if (n == 0) return 0;
        if (n == 1) return 1;
        long a = 0;
        long b = 1;
        for (int i = 2; i <= n; i++)
        {
            long c = a + b;
            a = b;
            b = c;
        }
        return b;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long n = sc.nextLong();
            System.out.println(fibonacci(n));
        }
    }
}
