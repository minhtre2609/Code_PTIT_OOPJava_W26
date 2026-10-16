package Checkpoint1;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.Collections;

class CongNhan implements Comparable<CongNhan>
{
    private String id;
    private String name;
    private int workMinutes;
    private String status;
    public CongNhan(String id, String name, String timeIn, String timeOut)
    {
        this.id = id;
        this.name = name;
        String[] in = timeIn.trim().split(":");
        String[] out = timeOut.trim().split(":");
        int inMin = Integer.parseInt(in[0]) * 60 +  Integer.parseInt(in[1]);
        int outMin = Integer.parseInt(out[0]) * 60 +  Integer.parseInt(out[1]);
        this.workMinutes = outMin - inMin - 60;
        if (this.workMinutes >= 480)
        {
            this.status = "DU";
        }
        else
        {
            this.status = "THIEU";
        }
    }
    public int getHours()
    {
        return this.workMinutes / 60;
    }
    public int getMinutes()
    {
        return this.workMinutes % 60;
    }
    @Override
    public int compareTo(CongNhan c)
    {
        if (this.workMinutes != c.workMinutes)
        {
            return Integer.compare(c.workMinutes, this.workMinutes);
        }
        return this.id.compareTo(c.id);
    }
    @Override
    public String toString()
    {
        return id + " " + name + " " + getHours() + " gio " + getMinutes() + " phut " + status;
    }
}
public class Bai8
{
    public static void main(String[] args) throws Exception
    {
        Scanner sc = new Scanner(System.in);
        if (!sc.hasNextLine()) return;
        int n = Integer.parseInt(sc.nextLine().trim());
        List<CongNhan> list = new ArrayList<>();
        for (int i = 0; i < n; i++)
        {
            String id = sc.nextLine().trim();
            String name = sc.nextLine().trim();
            String timeIn = sc.nextLine().trim();
            String timeOut = sc.nextLine().trim();
            list.add(new CongNhan(id, name, timeIn, timeOut));
        }
        Collections.sort(list);
        for (CongNhan c : list)
        {
            System.out.println(c);
        }
        sc.close();
    }
}
