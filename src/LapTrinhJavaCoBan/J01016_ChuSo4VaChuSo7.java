package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01016_ChuSo4VaChuSo7
{
    public static  void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String s =  sc.nextLine();
        StringBuilder sb = new StringBuilder(s);
        int demBon = 0;
        int demBay = 0;
        for (int i = 0; i < sb.length();i++)
        {
            char ch = sb.charAt(i);
            if (ch == '4') demBon++;
            if (ch == '7') demBay++;
        }
        if (demBon + demBay == 4 || demBon + demBay == 7)
        {
            System.out.println("YES");
        }
        else System.out.println("NO");
    }
}
