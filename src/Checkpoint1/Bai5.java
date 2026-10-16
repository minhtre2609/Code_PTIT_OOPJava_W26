package Checkpoint1;
import java.io.File;
import java.util.Scanner;
import java.math.BigInteger;

public class Bai5
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("DAYSO.in"));
        int n = sc.nextInt();
        BigInteger min = null;
        BigInteger max = null;
        BigInteger sum = BigInteger.ZERO;
        for (int i = 0; i < n; i++)
        {
            BigInteger x = new BigInteger(sc.next());
            if (min == null || x.compareTo(min) < 0) min = x;
            if (max == null || x.compareTo(max) > 0) max = x;
            sum = sum.add(x);
        }
        System.out.println(min);
        System.out.println(max);
        System.out.println(sum);
    }
}
