package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01007_KiemTraSoFibonacci
{
    public static boolean checkFibonacci(long n)
    {
        long a = 0;
        long b = 1;
        while (a <= n)
        {
            if (a == n) return true;
            long c = a + b;
            a = b;
            b = c;
        }
        return false;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-- > 0)
        {
            long n = sc.nextLong();
            if (checkFibonacci(n))
            {
                System.out.println("YES");
            }
            else
            {
                System.out.println("NO");
            }
        }
    }
}
