package ThucHanh2;

import java.io.*;
import java.util.*;

public class Bai2 {
    public static boolean laThuanNghich(int n) {
        int banDau = n;
        int daoNguoc = 0;

        while (n > 0) {
            daoNguoc = daoNguoc * 10 + n % 10;
            n /= 10;
        }

        return daoNguoc == banDau;
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> danhSach;

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("DAYSO.DAT"))) {

            danhSach = (ArrayList<Integer>) in.readObject();
        }

        TreeSet<Integer> cacSo = new TreeSet<>(danhSach);

        for (int x : cacSo) {
            if (x >= 100 && laThuanNghich(x)) {
                System.out.println(x);
            }
        }
    }
}
