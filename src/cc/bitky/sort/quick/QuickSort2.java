package cc.bitky.sort.quick;

import cc.bitky.sort.KySort;

public class QuickSort2 implements KySort {
    public void kySort(int[] a, int size) {
        quickSort(a, 0, size - 1);
    }

    private void quickSort(int[] a, int left, int right) {
        if (left >= right) return;
        int temp = a[left];
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && a[j] >= temp) {
                j--;
            }
            if (i < j) {
                a[i] = a[j];
                i++;
            }

            while (i < j && a[i] <= temp) {
                i++;
            }
            if (i < j) {
                a[j] = a[i];
                j--;
            }
        }
        a[i] = temp;
        quickSort(a, left, i - 1);
        quickSort(a, i + 1, right);
    }
}
