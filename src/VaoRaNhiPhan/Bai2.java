package VaoRaNhiPhan;

import java.io.*;
import java.util.*;

public class Bai2 {
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
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

        for (int x : a) {
            cnt1[x]++;
        }

        for (int x : b) {
            cnt2[x]++;
        }

        for (int i = 2; i <= 10000; i++) {
            if (isPrime(i) && cnt1[i] > 0 && cnt2[i] > 0) {
                System.out.println(i + " " + cnt1[i] + " " + cnt2[i]);
            }
        }

        in1.close();
        in2.close();
    }
}
