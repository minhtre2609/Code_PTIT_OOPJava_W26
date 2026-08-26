package XauKyTu;

import java.math.BigInteger;
import java.util.Scanner;

public class J03006_SoDep1
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            String s = sc.next();
            boolean check = true;
            for (int i = 0; i <= s.length() / 2; i++)
            {
                if (s.charAt(i) != s.charAt(s.length() - i - 1) || (s.charAt(i) - '0') % 2 != 0)
                {
                    check = false;
                    break;
                }
            }
            if (check == true)
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
