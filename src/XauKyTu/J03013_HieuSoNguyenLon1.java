package XauKyTu;

import java.math.BigInteger;
import java.util.Scanner;

public class J03013_HieuSoNguyenLon1 {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0)
        {
            String x = sc.next();
            String y = sc.next();

            BigInteger a = new BigInteger(x);
            BigInteger b = new BigInteger(y);

            String s = a.subtract(b).abs().toString();

            int len = Math.max(x.length(), y.length());
            while (s.length() < len) s = "0" + s;

            System.out.println(s);
        }
    }
}
