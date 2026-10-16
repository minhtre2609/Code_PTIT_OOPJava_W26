package Checkpoint1;
import java.io.*;
import java.util.*;
public class Bai2
{
    static class SinhVien implements Comparable<SinhVien>
    {
        String ten;
        int bai, sub;
        SinhVien(String ten, int bai, int sub)
        {
            this.ten = ten;
            this.bai = bai;
            this.sub = sub;
        }
        public int compareTo(SinhVien i)
        {
            if (this.bai != i.bai)
            {
                return i.bai - this.bai;
            }
            if (this.sub != i.sub)
            {
                return this.sub - i.sub;
            }
            return this.ten.compareTo(i.ten);
        }
    }
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(new File("LUYENTAP.in"));
        int n = sc.nextInt();
        ArrayList<SinhVien> ds = new ArrayList<>();
        for (int i = 0;i <n; i++)
        {
            String ten = sc.nextLine().trim();
            while (ten.isEmpty())
            {
                ten = sc.nextLine().trim();
            }
            int bai = sc.nextInt();
            int sub = sc.nextInt();
            ds.add(new SinhVien(ten, bai, sub));
        }
        sc.close();
        Collections.sort(ds);
        for (SinhVien i : ds)
        {
            System.out.println(i.ten + " " + i.bai + " " + i.sub);
        }
    }
}
