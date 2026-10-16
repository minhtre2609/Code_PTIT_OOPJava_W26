package VaoRaNhiPhan;

import java.io.*;
import java.util.*;

public class Bai6 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(
                new BufferedInputStream(new FileInputStream("DAYSO.DAT")));

        ArrayList<Integer> a = (ArrayList<Integer>) in.readObject();
        in.close();

        int n = 1000000;

        boolean[] prime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            prime[i] = true;
        }

        for (int i = 2; i * i <= n; i++) {
            if (prime[i]) {
                for (int j = i * i; j <= n; j += i) {
                    prime[j] = false;
                }
            }
        }

        boolean[] used = new boolean[n + 1];

        for (int x : a) {
            if (x >= 100 && prime[x]) {
                used[x] = true;
            }
        }

        StringBuilder sb = new StringBuilder();

        for (int i = 100; i <= n; i++) {
            if (used[i]) {
                sb.append(i).append('\n');
            }
        }

        System.out.print(sb);
    }
}