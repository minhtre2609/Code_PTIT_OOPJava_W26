package ThucHanh2;

import java.io.*;
import java.util.*;

class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}

class Polygon {
    private Point[] p;

    public Polygon(Point[] p) {
        this.p = p;
    }

    public String getArea() {
        long tong = 0;
        int n = p.length;

        for (int i = 0; i < n; i++) {
            int j = (i + 1) % n;

            tong += (long) p[i].getX() * p[j].getY()
                    - (long) p[i].getY() * p[j].getX();
        }

        double dienTich = Math.abs(tong) / 2.0;

        return String.format(java.util.Locale.US, "%.3f", dienTich);
    }
}

public class Bai8 {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner in = new Scanner(new File("POLYGON.in"));

        int t = in.nextInt();

        while (t-- > 0) {
            int n = in.nextInt();
            Point[] p = new Point[n];

            for (int i = 0; i < n; i++) {
                p[i] = new Point(in.nextInt(), in.nextInt());
            }

            Polygon poly = new Polygon(p);
            System.out.println(poly.getArea());
        }
    }
}