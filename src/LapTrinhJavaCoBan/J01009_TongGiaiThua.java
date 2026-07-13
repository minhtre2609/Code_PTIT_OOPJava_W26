package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01009_TongGiaiThua
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long tong = 0;
        long tich = 1;
        for (int i = 1; i <= n; i++)
        {
            tich *= i;
            tong += tich;
        }
        System.out.println(tong);
    }
}
