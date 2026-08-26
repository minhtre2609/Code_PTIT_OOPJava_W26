package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01011_BoiSoChungUocSoChung
{
    public static long gcd (long a, long b)
    {
        while (b != 0)
        {
            long r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static long lcm (long a, long b)
    {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long gcd = gcd(a, b);
            long lcm = lcm(a, b);
            System.out.println(lcm + " " + gcd);
        }
    }
}