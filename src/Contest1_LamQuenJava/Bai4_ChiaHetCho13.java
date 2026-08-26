package LamQuenJava;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai4_ChiaHetCho13
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        BigInteger m = BigInteger.valueOf(13);
        while(t-->0)
        {
            BigInteger n = sc.nextBigInteger();
            boolean ok = false;
            for (int i = 0; i <= 1000; i++)
            {
                if (n.mod(m).equals(BigInteger.ZERO))
                {
                    System.out.println(n);
                    ok = true;
                    break;
                }
                String s = n.toString();
                String r = new StringBuilder(s).reverse().toString();
                n = n.add(new BigInteger(r));
            }
            if(!ok)
            {
                System.out.println(-1);
            }
        }
    }
}
