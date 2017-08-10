package cc.bitky.sort.insert;

import cc.bitky.sort.KySort;

public class InsertSort2 implements KySort {
    public void kySort(int[] a, int size) {
        for (int i = 1; i < size; i++) {
            int temp = a[i];
            for (int j = i; j >= 0; j--) {
                if (j > 0 && a[j - 1] > temp) {
                    a[j] = a[j - 1];
                } else {
                    a[j] = temp;
                    break;
                }
            }
        }
    }
}
