package ThucHanh2;

import java.io.*;
import java.util.*;

public class Bai14 {
    public static void main(String[] args) throws Exception {
        DocDuLieu in = new DocDuLieu();

        int n = in.nextInt();

        ArrayList<Pair<Integer, Integer>> cacCanh =
                new ArrayList<>();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int x = in.nextInt();

                if (i < j && x == 1) {
                    Pair<Integer, Integer> canh =
                            new Pair<>(i + 1, j + 1);

                    cacCanh.add(canh);
                }
            }
        }

        StringBuilder ketQua = new StringBuilder();

        for (Pair<Integer, Integer> canh : cacCanh) {
            ketQua.append(canh).append('\n');
        }

        System.out.print(ketQua);
    }
}

class Pair<T, U> {
    private T first;
    private U second;

    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }

    public T getFirst() {
        return first;
    }

    public U getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}

class DocDuLieu {
    private BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));

    private StringTokenizer st;

    public int nextInt() throws IOException {
        while (st == null || !st.hasMoreTokens()) {
            st = new StringTokenizer(br.readLine());
        }

        return Integer.parseInt(st.nextToken());
    }
}
