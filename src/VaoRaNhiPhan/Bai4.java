package VaoRaNhiPhan;

import java.io.*;
import java.util.*;

public class Bai4 {
    public static void main(String[] args) throws Exception {
        ObjectInputStream in = new ObjectInputStream(new FileInputStream("DATA.in"));

        ArrayList<String> a = (ArrayList<String>) in.readObject();

        for (String s : a) {
            StringBuilder binary = new StringBuilder();

            for (char c : s.toCharArray()) {
                if (c == '0' || c == '1') {
                    binary.append(c);
                }
            }

            long value = 0;

            for (int i = 0; i < binary.length(); i++) {
                value = value * 2 + (binary.charAt(i) - '0');
            }

            System.out.println(binary + " " + value);
        }

        in.close();
    }
}
