package cc.bitky.sort.select;

import cc.bitky.sort.KySort;

import static cc.bitky.sort.Util.swap;

public class SelectSort1 implements KySort {
    public void kySort(int[] a, int size) {
        for (int i = 0; i < size - 1; i++) {
            int min = i;
            for (int j = i + 1; j < size; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            if (i != min) {
                swap(a, i, min);
            }
        }
    }
}
