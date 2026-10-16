package Checkpoint1;

import java.util.HashMap;
import java.util.Scanner;

public class Bai6
{
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String[] username = new String[n];
        String[] pass = new String[n];
        int[] k = new int[n];
        HashMap<String, Integer> pos = new HashMap<>();
        for(int i=0;i<n;i++)
        {
            username[i] = sc.next();
            pass[i] = sc.next();
            pos.put(username[i], i);
        }
        int m = sc.nextInt();
        for(int i=0;i<m;i++)
        {
            String u = sc.next();
            String p = sc.next();
            if (pos.containsKey(u))
            {
                int l = pos.get(u);
                if (pass[l].equals(p))
                {
                    k[l]++;
                }
            }
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(k[i]+(i == n - 1 ?"":" "));
        }
    }
}
