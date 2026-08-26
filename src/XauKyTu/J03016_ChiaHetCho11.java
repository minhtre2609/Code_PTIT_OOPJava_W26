package XauKyTu;

import java.util.Scanner;

public class J03016_ChiaHetCho11
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            String s = sc.next();
            int tongLe = 0;
            int tongChan = 0;
            for(int i = 0; i < s.length(); i++)
            {
                int d = s.charAt(i) - '0';
                if (i % 2 == 0) tongChan += d;
                else tongLe += d;
            }
            if ((tongLe - tongChan) % 11 == 0) System.out.println(1);
            else System.out.println(0);
        }
    }
}
