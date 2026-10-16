package Contest3_VaoRaFileVanBan;

import java.io.File;
import java.util.Scanner;

public class VaoRaFileVanBan
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("DATA.in"));
        while (sc.hasNextLine())
        {
            System.out.println(sc.nextLine());
        }
        sc.close();
    }
}
