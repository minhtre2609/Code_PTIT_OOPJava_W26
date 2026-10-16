package Contest2_LamQuenVoiHuongDoiTuong;

import java.util.Scanner;

class PhSo
{
    private long tu, mau;
    public PhSo(long tu, long mau)
    {
        this.tu = tu;
        this.mau = mau;
    }
    public PhSo tong(PhSo p)
    {
        return new PhSo(tu * p.mau + p.tu * mau, (mau * p.mau));
    }
    public PhSo nhan(PhSo p)
    {
        return new PhSo(tu * p.tu, mau * p.mau);
    }
    public PhSo binhPhuong()
    {
        return new PhSo(tu * tu, mau * mau);
    }
    public void rutGon()
    {
        long a = Math.abs(tu);
        long b = Math.abs(mau);
        while (b != 0)
        {
            long r = a % b;
            a = b;
            b = r;
        }
        tu /= a;
        mau /= a;
    }
    public String toString()
    {
        return tu + "/" + mau;
    }
}
public class TinhToanVoiPhanSo
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0)
        {
            long a = sc.nextLong();
            long b = sc.nextLong();
            long c = sc.nextLong();
            long d  = sc.nextLong();
            PhSo A = new PhSo(a, b);
            PhSo B = new PhSo(c, d);
            PhSo C = A.tong(B).binhPhuong();
            C.rutGon();
            PhSo D = A.nhan(B).nhan(C);
            D.rutGon();
            System.out.println(C + " " + D);
        }
    }
}
