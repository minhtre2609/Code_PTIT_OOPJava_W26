package Contest3_VaoRaFileVanBan;

import java.util.*;
import java.io.*;

public class TinhTongSoLong
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("DATA.in"));
        long tong = 0;
        while (sc.hasNext())
        {
            String s = sc.next();
            try {
                long x = Long.parseLong(s);
                if (x > Integer.MAX_VALUE)
                {
                    tong += x;
                }
            }
            catch (Exception e) {}
        }
        System.out.println(tong);
    }
}
