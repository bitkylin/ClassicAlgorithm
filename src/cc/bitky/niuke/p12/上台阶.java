package cc.bitky.niuke.p12;

import java.util.Scanner;

public class 上台阶 {
    int[] ints;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println(new 上台阶().countWays(scanner.nextInt()));
    }

    public int countWays暴力(int n) {
        if (ints == null) ints = new int[n + 1];
        if (n == 1 || n == 2) return n;
        else return countWays(n - 1) + countWays(n - 2);
    }

    public int countWays3(int n) {
        int s1 = 1;
        int s2 = 2;
        for (int i = 3; i <= n; i++) {
            int s3 = (s1 + s2) % 1000000007;
            s1 = s2;
            s2 = s3;
        }
        return s2;
    }

    public int countWays(int n) {
        if (ints == null) ints = new int[n + 1];
        for (int i = 1; i < n; i++) {
            run(i);
        }
        return run(n);
    }

    private int run(int n) {

        if (n == 1 || n == 2) {
            return n;
        } else {
            if (ints[n] == 0) {
                int res = run(n - 1) + run(n - 2);
                ints[n] = res;
            }
            return ints[n];
        }
    }
}
