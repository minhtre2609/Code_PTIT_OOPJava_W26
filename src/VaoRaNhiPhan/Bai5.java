package VaoRaNhiPhan;

import java.io.*;
import java.util.*;

public class Bai5 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in1 = new ObjectInputStream(new FileInputStream("DATA1.in"));
        ObjectInputStream in2 = new ObjectInputStream(new FileInputStream("DATA2.in"));

        ArrayList<String> a = (ArrayList<String>) in1.readObject();
        ArrayList<Integer> b = (ArrayList<Integer>) in2.readObject();

        TreeSet<String> set = new TreeSet<>();

        for (String s : a) {
            for (Integer x : b) {
                set.add(s + x);
            }
        }

        for (String s : set) {
            System.out.println(s);
        }

        in1.close();
        in2.close();
    }
}
