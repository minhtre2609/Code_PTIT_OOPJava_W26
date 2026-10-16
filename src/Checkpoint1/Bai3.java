package Checkpoint1;

import java.io.File;
import java.util.Scanner;
import java.util.*;
class Matrix
{
    private int n, m;
    private int[][] a;
    public Matrix(int n, int m)
    {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }
    public void nextMatrix(Scanner sc)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                a[i][j] = sc.nextInt();
            }
        }
    }
    public void sortColumn(int colIndex)
    {
        int[] col =  new int[n];
        for (int i = 0; i < n; i++)
        {
            col[i] = a[i][colIndex];
        }
        Arrays.sort(col);
        for (int i = 0; i < n; i++)
        {
            a[i][colIndex] = col[i];
        }
    }
    public void print()
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < m; j++)
            {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
public class Bai3 {
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("MATRIX.in"));
        if (sc.hasNextInt())
        {
            int t =  sc.nextInt();
            while (t-- > 0)
            {
                int n = sc.nextInt();
                int m = sc.nextInt();
                int k = sc.nextInt() - 1;
                Matrix matrix = new Matrix(n, m);
                matrix.nextMatrix(sc);
                matrix.sortColumn(k);
                matrix.print();
            }
        }
        sc.close();
    }
}
