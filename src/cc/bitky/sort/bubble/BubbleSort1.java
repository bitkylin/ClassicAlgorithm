package cc.bitky.sort.bubble;

import cc.bitky.sort.KySort;

import static cc.bitky.sort.Util.swap;

public class BubbleSort1 implements KySort {
    public void kySort(int[] a, int size) {
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(a, j, j + 1);
                }
            }
        }
    }
}
