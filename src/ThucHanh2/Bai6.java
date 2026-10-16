package ThucHanh2;

import java.io.*;
import java.util.*;

public class Bai6 {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) throws Exception {
        ArrayList<String> danhSachChu;
        ArrayList<Integer> danhSachSo;

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("DATA1.in"))) {

            danhSachChu = (ArrayList<String>) in.readObject();
        }

        try (ObjectInputStream in = new ObjectInputStream(
                new FileInputStream("DATA2.in"))) {

            danhSachSo = (ArrayList<Integer>) in.readObject();
        }

        TreeSet<String> cacChu = new TreeSet<>(danhSachChu);
        TreeSet<Integer> cacSo = new TreeSet<>(danhSachSo);

        BufferedWriter out = new BufferedWriter(
                new OutputStreamWriter(System.out));

        for (String chu : cacChu) {
            for (int so : cacSo) {
                out.write(chu + so);
                out.newLine();
            }
        }

        out.flush();
    }
}