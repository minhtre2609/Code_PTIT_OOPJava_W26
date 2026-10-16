package ThucHanh2;

import java.io.*;
import java.util.*;

public class Bai3 {
    public static boolean laSoDep(int n) {
        if (n < 10) return false;

        int phai = n % 10;
        n /= 10;

        while (n > 0) {
            int trai = n % 10;

            if (trai < phai) {
                return false;
            }

            phai = trai;
            n /= 10;
        }

        return true;
    }

    @SuppressWarnings("unchecked")
    public static int[] demTrongFile(String tenFile) throws Exception {
        int[] dem = new int[10000];

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream(tenFile))) {

            ArrayList<Integer> danhSach =
                    (ArrayList<Integer>) in.readObject();

            for (int x : danhSach) {
                dem[x]++;
            }
        }

        return dem;
    }

    public static void main(String[] args) throws Exception {
        int[] dem1 = demTrongFile("DATA1.in");
        int[] dem2 = demTrongFile("DATA2.in");

        for (int x = 10; x < 10000; x++) {
            if (dem1[x] > 0 && dem2[x] > 0 && laSoDep(x)) {
                System.out.println(x + " " + dem1[x] + " " + dem2[x]);
            }
        }
    }
}
