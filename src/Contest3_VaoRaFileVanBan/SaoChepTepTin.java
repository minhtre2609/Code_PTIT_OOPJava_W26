package Contest3_VaoRaFileVanBan;
import java.io.*;
import java.util.Scanner;
public class SaoChepTepTin
{
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(new File("PTIT.in"));
        PrintWriter out = new PrintWriter("PTIT.out");

        while (sc.hasNextLine()) {
            out.println(sc.nextLine());
        }

        sc.close();
        out.close();
    }
}
