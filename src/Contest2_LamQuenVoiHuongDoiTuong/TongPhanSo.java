package Contest2_LamQuenVoiHuongDoiTuong;

import java.util.Scanner;

class PSo
{
    private long tu, mau;
    public PSo(long tu, long mau)
    {
        this.tu = tu;
        this.mau = mau;
    }
    public PSo tong(PSo p)
    {
        return new PSo(tu * p.mau + p.tu * mau, (mau * p.mau));
    }
    public void rutGon()
    {
        long a = tu;
        long b = mau;
        while (b != 0)
        {
            long r = a % b;
            a = b;
            b = r;
        }
        tu /= a;
        mau /= a;
    }
    public void in()
    {
        System.out.println(tu + "/" + mau);
    }
}
public class TongPhanSo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        long c = sc.nextLong();
        long d = sc.nextLong();
        PSo p1 = new PSo(a, b);
        PSo p2 = new PSo(c, d);
        PSo p = p1.tong(p2);
        p.rutGon();
        p.in();
    }
}
