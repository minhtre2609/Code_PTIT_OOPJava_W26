package Contest1_LamQuenJava;

import java.math.BigInteger;
import java.util.Scanner;

public class Bai3_UocSoChungLonNhatCuaSoNguyenLon
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0)
        {
            BigInteger a = new BigInteger(sc.next());
            BigInteger b = new BigInteger(sc.next());
            System.out.println(a.gcd(b));
        }
    }
}
