package Checkpoint2;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import java.util.TreeSet;

public class Bai3 {
    private static boolean isPalindrome(int n){
        if (n < 100) return false;
        String s = String.valueOf(n);
        int l = 0, r = s.length() - 1;
        while (l < r){
            if (s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        }
        return true;
    }
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("DAYSO.DAT"));
        ArrayList<Integer> list = (ArrayList<Integer>) ois.readObject();
        ois.close();
        TreeSet<Integer> set = new TreeSet<>();
        for (Integer i : list) {
            if (isPalindrome(i)) set.add(i);
        }
        for (int x : set){
            System.out.println(x);
        }
    }
}
