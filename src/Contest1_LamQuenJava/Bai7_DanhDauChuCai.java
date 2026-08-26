package Contest1_LamQuenJava;

import java.util.Scanner;

public class Bai7_DanhDauChuCai
{
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        String s =  sc.nextLine();
        System.out.println(s.chars().distinct().count());
    }
}
