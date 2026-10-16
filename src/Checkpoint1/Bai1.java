package Checkpoint1;
import java.io.File;
import java.math.BigInteger;
import java.util.HashSet;
import java.util.Scanner;
import java.util.*;

public class Bai1
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        HashSet<BigInteger> set = new HashSet<>();
        while (sc.hasNext())
        {
            set.add(new BigInteger(sc.next()));
        }
        BigInteger sum = BigInteger.ZERO;
        BigInteger tich = BigInteger.ONE;
        for (BigInteger i : set)
        {
            sum = sum.add(i);
            tich = tich.multiply(i);
        }
        System.out.println(sum);
        System.out.println(tich);
        sc.close();
    }
}
