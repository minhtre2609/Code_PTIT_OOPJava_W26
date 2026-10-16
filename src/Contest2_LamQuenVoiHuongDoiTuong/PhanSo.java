package Contest2_LamQuenVoiHuongDoiTuong;

import java.util.Scanner;

class PS
{
    private long tu, mau;
    public PS(long tu, long mau)
    {
        this.tu = tu;
        this.mau = mau;
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
public class PhanSo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long tu = sc.nextLong();
        long mau = sc.nextLong();
        PS p = new PS(tu, mau);
        p.rutGon();
        p.in();
    }
}
