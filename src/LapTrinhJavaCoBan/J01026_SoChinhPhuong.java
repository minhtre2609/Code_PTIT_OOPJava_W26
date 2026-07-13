package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01026_SoChinhPhuong
{
    public static boolean chinhPhuong(int n)
    {
        int can = (int)Math.sqrt(n);
        return can * can == n;
    }
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while(t-- > 0)
        {
            int n = input.nextInt();
            if (chinhPhuong(n)) System.out.println("YES");
            else System.out.println("NO");
        }
    }
}