package Contest3_VaoRaFileVanBan;

import java.io.*;
import java.util.*;

public class LietKeTuKhacNhau {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("VANBAN.in"));
        TreeSet<String> set = new TreeSet<>();

        while (sc.hasNext()) {
            String s = sc.next().toLowerCase();
            set.add(s);
        }

        sc.close();

        for (String s : set) {
            System.out.println(s);
        }
    }
}
