package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J03035_DienChuSo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            String a = sc.next();
            String b = sc.next();

            long[] dp = new long[3];
            dp[1] = 1;

            for (int i = 0; i < a.length(); i++) {
                long[] next = new long[3];

                int start, end;

                if (a.charAt(i) == '?') {
                    start = (i == 0) ? 1 : 0;
                    end = 9;
                } else {
                    start = a.charAt(i) - '0';
                    end = start;
                }

                int bd = b.charAt(i) - '0';

                for (int digit = start; digit <= end; digit++) {
                    for (int state = 0; state < 3; state++) {

                        if (dp[state] == 0) {
                            continue;
                        }

                        int newState = state;

                        if (state == 1) {
                            if (digit < bd) {
                                newState = 0;
                            } else if (digit > bd) {
                                newState = 2;
                            }
                        }

                        next[newState] += dp[state];
                    }
                }

                dp = next;
            }

            System.out.println(dp[2]);
        }
    }
}