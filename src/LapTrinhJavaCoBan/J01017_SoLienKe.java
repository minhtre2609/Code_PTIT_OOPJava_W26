package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01017_SoLienKe
{
    public static boolean check (String s)
    {
        for (int i = 0; i < s.length() - 1; i++)
        {
            int a = s.charAt(i) - '0';
            int b = s.charAt(i + 1) - '0';
            if (Math.abs(a - b) != 1) return false;
        }
        return true;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            String s = sc.next();
            if (check(s)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}
