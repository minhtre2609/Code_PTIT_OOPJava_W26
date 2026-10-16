package Checkpoint2;

import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Bai4 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        BufferedReader br = new BufferedReader(new FileReader("VANBAN.in"));
        Set<String> a = new TreeSet<>();
        String s;
        while ((s = br.readLine()) != null) {
            StringTokenizer token = new StringTokenizer(s);
            while (token.hasMoreTokens()) {
                String x = token.nextToken();
                if (x.matches(".*[0-9].*") && !x.matches(".*[.,!?:].*")) {
                    a.add(x);
                }
            }
        }
        br.close();
        for (String x : a){
            System.out.println(x);
        }
    }
}
