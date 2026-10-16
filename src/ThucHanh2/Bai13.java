package ThucHanh2;

import java.io.*;
import java.util.*;

public class Bai13 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        ArrayList<String> danhSach;

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("DATA.in"))) {

            danhSach = (ArrayList<String>) in.readObject();
        }

        TreeSet<Integer> cacSo = new TreeSet<>();

        for (String dong : danhSach) {
            String[] cacTu = dong.trim().split("\\s+");

            for (String tu : cacTu) {
                try {
                    int x = Integer.parseInt(tu);
                    cacSo.add(x);
                } catch (NumberFormatException e) {
                }
            }
        }

        for (int x : cacSo) {
            System.out.println(x);
        }
    }
}