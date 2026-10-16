package VaoRaNhiPhan;

import java.io.*;
import java.util.*;

public class Bai3 {
    public static boolean khongGiam(int n) {
        String s = String.valueOf(n);

        if (s.length() < 2)
            return false;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) < s.charAt(i - 1))
                return false;
        }

        return true;
    }

    public static void main(String[] args) throws Exception {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<Integer> a = (ArrayList<Integer>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();

        int[] cnt1 = new int[10001];
        int[] cnt2 = new int[10001];

        for (int x : a)
            cnt1[x]++;

        for (int x : b)
            cnt2[x]++;

        for (int i = 10; i <= 9999; i++) {
            if (cnt1[i] > 0 && cnt2[i] > 0 && khongGiam(i)) {
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
            }
        }

        in1.close();
        in2.close();
    }
}
