package Checkpoint2;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Queue;
import java.util.Scanner;

public class Bai7 {
    static ArrayList<String> sinhSo(int n){
        ArrayList<String> result = new ArrayList<>();
        Queue<String> queue = new ArrayDeque<>();
        queue.add("4");
        queue.add("5");
        while(result.size()<n){
            String half = queue.remove();
            String reversed = new StringBuilder(half).reverse().toString();
            result.add(half + reversed);
            queue.add(half + "4");
            queue.add(half + "5");
        }
        return result;
    }
    public static void main(String[] args) throws IOException {
        Scanner in =  new Scanner(System.in);
        int t = in.nextInt();
        int[] tests = new int[t];
        int maxN = 0;
        for (int i = 0; i < t; i++){
            tests[i] = in.nextInt();
            maxN = Math.max(maxN, tests[i]);
        }
        ArrayList<String> numbers = sinhSo(maxN);
        BufferedWriter out = new BufferedWriter(new OutputStreamWriter(System.out));
        for (int n : tests){
            for (int i = 0; i < n; i++){
                if (i > 0){
                    out.write(" ");
                }
                out.write(numbers.get(i));
            }
            out.newLine();
        }
        out.flush();
    }
}
