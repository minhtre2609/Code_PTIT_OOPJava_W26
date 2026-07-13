package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01014_UocSoNguyenToLonNhat
{
    public static boolean nguyenTo(int n)
    {
        for (int i = 2; i <= Math.sqrt(n); i++)
        {
            if (n % i == 0) return false;
        }
        return n > 1;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0)
        {
            int n = input.nextInt();
            int maxx = -1000000;
            for (int i = 1; i <= n; i++)
            {
                if (n % i == 0)
                {
                    if (nguyenTo(i) && i > maxx)
                    {
                        maxx = i;
                    }
                }
            }
            System.out.println(maxx);
        }
    }
}
