package cc.bitky.niuke.p12;

import java.util.Scanner;

//求最长子序列
public class Lis {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = scanner.nextInt();
        }

        int kyMax[] = new int[n];
        for (int i = 0; i < n; i++) {
            kyMax[i] = 1;
            for (int k = 0; k < i; k++) {
                if (a[k] < a[i] && kyMax[k] + 1 > kyMax[i]) {
                    kyMax[i] = kyMax[k] + 1;
                }
            }
        }

        int value = 1;
        for (int i = 0; i < n; i++) {
            if (value < kyMax[i]) {
                value = kyMax[i];
            }
        }
        System.out.println(value);
    }
}
