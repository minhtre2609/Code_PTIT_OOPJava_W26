package Contest3_VaoRaFileVanBan;

import java.io.*;
import java.util.*;

class LienLac {
    String ten;
    String sdt;
    String ngay;

    LienLac(String ten, String sdt, String ngay) {
        this.ten = ten;
        this.sdt = sdt;
        this.ngay = ngay;
    }
}

public class SaoChepDanhBa {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("SOTAY.txt"));

        ArrayList<LienLac> a = new ArrayList<>();

        String ngay = "";

        while (sc.hasNextLine()) {
            String s = sc.nextLine();

            if (s.startsWith("Ngay")) {
                ngay = s.substring(5);
            } else if (!s.isEmpty()) {
                String ten = s;
                String sdt = sc.nextLine();

                a.add(new LienLac(ten, sdt, ngay));
            }
        }

        sc.close();

        Collections.sort(a, new Comparator<LienLac>() {
            public int compare(LienLac x, LienLac y) {
                String[] p1 = x.ten.split(" ");
                String[] p2 = y.ten.split(" ");

                int c = p1[p1.length - 1].compareTo(p2[p2.length - 1]);

                if (c != 0)
                    return c;

                return x.ten.compareTo(y.ten);
            }
        });

        PrintWriter out = new PrintWriter("DIENTHOAI.txt");

        for (LienLac x : a) {
            out.println(x.ten + ": " + x.sdt + " " + x.ngay);
        }

        out.close();
    }
}
