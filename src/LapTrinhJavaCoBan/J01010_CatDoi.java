package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01010_CatDoi
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            String s = sc.next();
            StringBuilder result = new StringBuilder();
            boolean valid = true;
            for (int i = 0; i < s.length(); i++)
            {
                char c = s.charAt(i);

                if (c == '0' || c == '8' || c == '9')
                {
                    result.append('0');
                }
                else if (c == '1')
                {
                    result.append('1');
                }
                else
                {
                    valid = false;
                    break;
                }
            }
            if (!valid)
            {
                System.out.println("INVALID");
                continue;
            }
            int i = 0;
            while (i < result.length() && result.charAt(i) == '0')
            {
                i++;
            }
            if (i == result.length())
            {
                System.out.println("INVALID");
            }
            else
            {
                System.out.println(result.substring(i));
            }
        }
    }
}
