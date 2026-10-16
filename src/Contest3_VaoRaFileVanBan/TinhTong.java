package Contest3_VaoRaFileVanBan;

import java.util.*;
import java.io.*;

public class TinhTong
{
    public static void main(String[] args) throws FileNotFoundException {
        Scanner sc = new Scanner(new File("DATA.in"));
        long tong = 0;
        while (sc.hasNext()) {
            try {
                int x = Integer.parseInt(sc.next());
                tong += x;
            }
            catch (NumberFormatException e) {}
        }
        System.out.println(tong);
    }
}
