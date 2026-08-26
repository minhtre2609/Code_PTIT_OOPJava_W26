package LapTrinhJavaCoBan;

import java.util.*;

public class J01023_ToanLopBa {

    static ArrayList<String> gen(String s) {
        ArrayList<String> a = new ArrayList<>();

        if (s.charAt(0) == '?') {
            for (char c = '1'; c <= '9'; c++) {
                a.add(c + "" + s.charAt(1));
            }
        } else {
            a.add(s);
        }

        if (s.charAt(1) == '?') {
            ArrayList<String> b = new ArrayList<>();

            for (String x : a) {
                for (char c = '0'; c <= '9'; c++) {
                    b.add(x.charAt(0) + "" + c);
                }
            }

            return b;
        }

        return a;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String op = sc.next();
            String b = sc.next();
            sc.next();
            String c = sc.next();

            ArrayList<String> x = gen(a);
            ArrayList<String> y = gen(b);
            ArrayList<String> z = gen(c);

            String ops;

            if (op.equals("?"))
                ops = "+-";
            else
                ops = op;

            boolean ok = false;

            for (String i : x) {
                for (String j : y) {
                    for (String k : z) {

                        int n1 = Integer.parseInt(i);
                        int n2 = Integer.parseInt(j);
                        int n3 = Integer.parseInt(k);

                        for (int p = 0; p < ops.length(); p++) {
                            char o = ops.charAt(p);

                            if (o == '+' && n1 + n2 == n3) {
                                System.out.println(i + " + " + j + " = " + k);
                                ok = true;
                                break;
                            }

                            if (o == '-' && n1 - n2 == n3) {
                                System.out.println(i + " - " + j + " = " + k);
                                ok = true;
                                break;
                            }
                        }

                        if (ok)
                            break;
                    }

                    if (ok)
                        break;
                }

                if (ok)
                    break;
            }

            if (!ok)
                System.out.println("WRONG PROBLEM!");
        }
    }
}
