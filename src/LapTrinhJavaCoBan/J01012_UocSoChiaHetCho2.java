package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01012_UocSoChiaHetCho2
{
    public static int demUocSoChiaHetCho2(int n)
    {
        int cnt = 0;
        for (int i = 1; i <= n; i++)
        {
            if (n % i == 0)
            {
                if (i % 2 == 0)
                {
                    cnt++;
                }
            }
        }
        return cnt;
    }
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            int n = sc.nextInt();
            System.out.println(demUocSoChiaHetCho2(n));
        }
    }
}
