package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01012_UocSoChiaHetCho2
{
    public static long demUocSoChiaHetCho2(long n)
    {
        if (n % 2 != 0)
        {
            return 0;
        }

        long k = 0;

        while (n % 2 == 0)
        {
            n /= 2;
            k++;
        }

        long cnt = 1;

        for (long i = 3; i * i <= n; i += 2)
        {
            if (n % i == 0)
            {
                long mu = 0;

                while (n % i == 0)
                {
                    n /= i;
                    mu++;
                }

                cnt *= (mu + 1);
            }
        }

        if (n > 1)
        {
            cnt *= 2;
        }

        return k * cnt;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0)
        {
            long n = sc.nextLong();
            System.out.println(demUocSoChiaHetCho2(n));
        }
    }
}