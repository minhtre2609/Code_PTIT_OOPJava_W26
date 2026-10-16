package ThucHanh2;

import java.io.*;
import java.util.*;

public class Bai5 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("MATRIX.in"));

        int t = sc.nextInt();
        StringBuilder ketQua = new StringBuilder();

        while (t-- > 0) {
            int n = sc.nextInt();
            int m = sc.nextInt();
            int cot = sc.nextInt();

            Matrix matrix = new Matrix(n, m);
            matrix.nhap(sc);
            matrix.sapXepCot(cot);

            ketQua.append(matrix);
        }

        System.out.print(ketQua);
        sc.close();
    }
}

class Matrix {
    private int n, m;
    private int[][] a;

    public Matrix(int n, int m) {
        this.n = n;
        this.m = m;
        this.a = new int[n][m];
    }

    public void nhap(Scanner sc) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                a[i][j] = sc.nextInt();
            }
        }
    }

    public void sapXepCot(int cot) {
        // De danh so cot tu 1, mang Java danh so tu 0.
        int j = cot - 1;

        int[] giaTri = new int[n];

        for (int i = 0; i < n; i++) {
            giaTri[i] = a[i][j];
        }

        Arrays.sort(giaTri);

        for (int i = 0; i < n; i++) {
            a[i][j] = giaTri[i];
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (j > 0) {
                    sb.append(' ');
                }

                sb.append(a[i][j]);
            }

            sb.append('\n');
        }

        return sb.toString();
    }
}
