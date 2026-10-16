package ThucHanh2;

import java.io.*;
import java.util.*;

public class Bai1 {
    public static boolean laNguyenTo(int n) {
        if (n < 2) return false;

        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
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
            if (x >= 100 && laNguyenTo(x)) {
                System.out.println(x);
            }
        }
    }
}
