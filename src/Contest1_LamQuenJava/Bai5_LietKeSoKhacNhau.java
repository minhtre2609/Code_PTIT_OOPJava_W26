package Contest1_LamQuenJava;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Bai5_LietKeSoKhacNhau
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        int t = sc.nextInt();
        Set<Integer> set = new TreeSet<>();
        while(t-->0)
        {
            int x = sc.nextInt();
            set.add(x);
        }
        for (int x : set)
        {
            System.out.print(x + " ");
        }
    }
}
