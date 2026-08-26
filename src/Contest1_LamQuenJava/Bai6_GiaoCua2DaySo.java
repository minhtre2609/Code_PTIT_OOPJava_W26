package Contest1_LamQuenJava;

import java.util.Scanner;

public class Bai6_GiaoCua2DaySo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        boolean[] a = new boolean[1001];
        boolean[] b = new boolean[1001];
        for (int i = 0; i < n; i++) {
            a[sc.nextInt()] = true;
        }
        for (int i = 0; i < m; i++) {
            b[sc.nextInt()] = true;
        }
        for (int i = 0; i <= 1000; i++)
        {
            if (a[i] && b[i])
            {
                System.out.print(i + " ");
            }
        }
    }
}
