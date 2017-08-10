package cc.bitky.sort.Heap;

import cc.bitky.sort.KySort;

import static cc.bitky.sort.Util.swap;

public class HeapSort1 implements KySort {
    public void kySort(int[] A, int n) {
        for (int i = n / 2; i >= 0; i--) {
            heapAdjust(A, i, n - 1);
        }
        for (int i = n - 1; i > 0; i--) {
            swap(A, 0, i);
            heapAdjust(A, 0, i - 1);
        }
    }

    private void heapAdjust(int[] a, int index, int n) {
        int temp = a[index];
        for (int child = index * 2 + 1; child <= n; child = index * 2 + 1) {
            if (child < n && a[child] < a[child + 1]) {
                child++;
            }
            if (temp > a[child]) break;
            a[index] = a[child];
            index = child;
        }
        a[index] = temp;
    }
}
