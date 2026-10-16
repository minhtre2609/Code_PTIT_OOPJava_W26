package Contest3_VaoRaFileVanBan;

import java.io.*;
import java.util.*;

public class LoaiBoSoNguyen
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        ArrayList<String> a = new ArrayList<>();
        while (sc.hasNext()) {
            String s = sc.next();
            try{
                Integer.parseInt(s);
            }
            catch(Exception e){
                a.add(s);
            }
        }
        Collections.sort(a);
        for (String s : a){
            System.out.print(s + " ");
        }
    }
}
