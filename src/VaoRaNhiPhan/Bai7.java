package VaoRaNhiPhan;

import java.io.*;
import java.util.*;

public class Bai7 {
    public static boolean thuanNghich(int n) {
        int x = n;
        int dao = 0;

        while (n > 0) {
            dao = dao * 10 + n % 10;
            n /= 10;
        }

        return x == dao;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));

        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();

        TreeSet<Integer> set = new TreeSet<>();

        for (int x : a) {
            if (x >= 100 && thuanNghich(x)) {
                set.add(x);
            }
        }

        for (int x : set) {
            System.out.println(x);
        }

        in.close();
    }
}
