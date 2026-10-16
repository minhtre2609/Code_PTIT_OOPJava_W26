package Checkpoint2;

import java.io.*;
import java.util.ArrayList;
import java.util.InputMismatchException;

class Pair<T, U> {
    private final T first;
    private final U second;
    public Pair(T first, U second) {
        this.first = first;
        this.second = second;
    }
    @Override
    public String toString() {
        return "(" + first + "," + second + ")";
    }
}
public class Bai1
{
    static class FastScanner{
        private final BufferedInputStream in = new BufferedInputStream (System.in);
        int nextInt() throws IOException {
            int c;
            do{
                c = in.read();
            } while (c <= 32 && c != -1);
            if (c == -1)
                throw new EOFException();
            int sign = 1;
            if (c == '-') {
                sign = -1;
                c = in.read();
            }
            int value = 0;
            while (c > 32 && c != -1){
                value = value * 10 + c - '0';
                c = in.read();
            }
            return value * sign;
        }
    }
    public static void main(String[] args) throws IOException {
        FastScanner in = new FastScanner();
        int n = in.nextInt();
        ArrayList<Pair<Integer,Integer>> edges = new ArrayList<>();
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= n; j++){
                int value = in.nextInt();
                if (i < j && value == 1)
                {
                    edges.add(new Pair<>(i, j));
                }
            }
        }
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        for(Pair<Integer, Integer> edge : edges){
            out.write(edge.toString());
            out.newLine();
        }
        out.flush();
    }
}
