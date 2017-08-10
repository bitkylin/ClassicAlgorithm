package cc.bitky.sort.bubble;

import cc.bitky.sort.KySort;

import static cc.bitky.sort.Util.swap;

public class BubbleSort2 implements KySort {
    public void kySort(int[] a, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = size - 1; j > i; j--) {
                if (a[j - 1] > a[j]) {
                    swap(a, j - 1, j);
                }
            }
        }
    }
}
