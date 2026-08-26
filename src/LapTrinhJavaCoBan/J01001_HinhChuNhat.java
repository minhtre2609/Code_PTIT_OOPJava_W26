package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01001_HinhChuNhat
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
        int x  = sc.nextInt();
        int y = sc.nextInt();
        long chuVi = (x + y) * 2;
        long dienTich = x * y;
        if (x <= 0 || y <= 0)
        {
            System.out.println(0);
        }
        else
        {
            System.out.println(chuVi + " " +  dienTich);
        }
	}
}
