package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01013_TongUocSo1
{
    public static long phanTich (int n)
    {
        long sum = 0;
        for (int i = 2; i * i <= n; i++)
        {
            if (n % i == 0)
            {
                while (n % i == 0)
                {
                    sum += i;
                    n /= i;
                }
            }
        }
        if (n > 1)
        {
            sum += n;
        }
        return sum;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long tong = 0;
        int t = sc.nextInt();
        for (int i = 1; i <= t; i++)
        {
            int n = sc.nextInt();
            tong += phanTich(n);
        }
        System.out.println(tong);
    }
}
