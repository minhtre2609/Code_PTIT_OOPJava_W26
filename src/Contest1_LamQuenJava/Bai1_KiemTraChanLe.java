package LamQuenJava;

import java.util.Scanner;

public class Bai1_KiemTraChanLe
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        if (n % 2 == 0)
        {
            System.out.println("CHAN");
        }
        else System.out.println("LE");
    }
}
