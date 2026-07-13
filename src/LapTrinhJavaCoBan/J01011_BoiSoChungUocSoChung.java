package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01011_BoiSoChungUocSoChung
{
    public static int gcd (int a, int b)
    {
        while (b != 0)
        {
            int r = a % b;
            a = b;
            b = r;
        }
        return a;
    }
    public static int lcm (int a, int b)
    {
        return (a * b) / gcd(a, b);
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int gcd = gcd(a, b);
            int lcm = lcm(a, b);
            System.out.println(lcm + " " + gcd);
        }
    }
}