package cc.bitky.sort.bubble;

import cc.bitky.sort.KySort;

import static cc.bitky.sort.Util.swap;

public class BubbleSort3 implements KySort {
    public void kySort(int[] a, int size) {
        for (int i = size - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }
}
