package LapTrinhJavaCoBan;

import java.util.Scanner;

public class J01013_TongUocSo1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();
        int[] a = new int[t];

        int max = 0;

        for (int i = 0; i < t; i++) {
            a[i] = sc.nextInt();
            max = Math.max(max, a[i]);
        }

        int[] prime = new int[max + 1];
        int[] sum = new int[max + 1];

        for (int i = 2; i <= max; i++) {
            if (prime[i] == 0) {
                for (int j = i; j <= max; j += i) {
                    if (prime[j] == 0) {
                        prime[j] = i;
                    }
                }
            }
        }

        for (int i = 2; i <= max; i++) {
            sum[i] = sum[i / prime[i]] + prime[i];
        }

        long ans = 0;

        for (int i = 0; i < t; i++) {
            ans += sum[a[i]];
        }

        System.out.println(ans);
    }
}