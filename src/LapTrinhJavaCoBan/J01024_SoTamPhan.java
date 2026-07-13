package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01024_SoTamPhan
{
    public static boolean checkTamPhan (String s)
    {
        for (int i = 0; i < s.length(); i++)
        {
            char c = s.charAt(i);
            if (c != '0' && c != '1' && c != '2') return false;
        }
        return true;
    }
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            String s = sc.next();
            if (checkTamPhan(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}