package cc.bitky.sort.shell;

import cc.bitky.sort.KySort;

import static cc.bitky.sort.Util.swap;

public class ShellSort2 implements KySort {
    public void kySort(int[] a, int size) {
        for (int step = size / 2; step > 0; step /= 2) {
            for (int i = step; i < size; i++) {
                for (int j = i; j >= step; j -= step) {
                    if (a[j - step] > a[j]) {
                        swap(a, j - step, j);
                    } else {
                        break;
                    }
                }
            }
        }

    }
}
