package VaoRaNhiPhan;

import java.io.*;
import java.util.*;

public class Bai1 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));

        ArrayList<String> a = (ArrayList<String>) in.readObject();
        TreeSet<Integer> set = new TreeSet<>();

        for (String s : a) {
            String[] words = s.trim().split("\\s+");

            for (String word : words) {
                try {
                    int x = Integer.parseInt(word);
                    set.add(x);
                } catch (NumberFormatException e) {
                }
            }
        }

        in.close();

        for (int x : set) {
            System.out.println(x);
        }
    }
}