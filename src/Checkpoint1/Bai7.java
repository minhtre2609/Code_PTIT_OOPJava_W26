package Checkpoint1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Bai7
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashSet<String> set = new HashSet<>();
        Pattern p = Pattern.compile("\\d{2}:\\d{2}:\\d{2}");
        while(sc.hasNext())
        {
            String s = sc.next();
            Matcher m = p.matcher(s);
            while(m.find())
            {
                String t = m.group();
                int h = Integer.parseInt(t.substring(0, 2));
                int m1 = Integer.parseInt(t.substring(3, 5));
                int s1 = Integer.parseInt(t.substring(6, 8));
                if (h < 24 && m1 < 60 && s1 < 60)
                {
                    set.add(t);
                }
            }
        }
        ArrayList<String> a = new ArrayList<>(set);
        Collections.sort(a);
        for (String x : a)
        {
            System.out.println(x);
        }
    }
}
