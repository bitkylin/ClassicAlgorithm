package cc.bitky.niuke.p2;

import cc.bitky.sort.KySort;

/**
 * 计数排序
 */
public class CountingSort implements KySort {
    public void kySort(int[] A, int n) {
        int[] k = new int[1000];
        for (int i = 0; i < n; i++) {
            k[A[i]]++;
        }

        int j = 0;
        for (int i = 0; i < 1000; i++) {
            while (k[i]-- > 0) {
                A[j++] = i;
            }
        }
    }
}
