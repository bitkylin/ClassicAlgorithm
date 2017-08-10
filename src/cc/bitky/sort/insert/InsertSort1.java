package cc.bitky.sort.insert;

import cc.bitky.sort.KySort;

public class InsertSort1 implements KySort {
    public void kySort(int[] a, int size) {
        for (int i = 1; i < size; i++) {
            int temp = a[i];
            int j = i;
            while (j > 0 && a[j - 1] > temp) {
                a[j] = a[j - 1];
                j--;
            }
            a[j] = temp;
        }
    }
}
