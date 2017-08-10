package cc.bitky.sort.merge;

import cc.bitky.sort.KySort;

public class MergeSort1 implements KySort {
    public void kySort(int[] a, int size) {
        sort(a, 0, size - 1, new int[a.length]);
    }

    private void sort(int[] a, int left, int right, int[] temp) {
        if (left >= right) return;
        int middle = (left + right) / 2;
        sort(a, left, middle, temp);
        sort(a, middle + 1, right, temp);
        merge(a, left, middle, right, temp);
    }

    private void merge(int[] a, int left, int middle, int right, int[] temp) {
        int k = left;
        int i = left;
        int j = middle + 1;

        while (i <= middle && j <= right) {
            if (a[i] < a[j]) {
                temp[k++] = a[i++];
            } else {
                temp[k++] = a[j++];
            }
        }
        while (i <= middle) {
            temp[k++] = a[i++];
        }
        while (j <= right) {
            temp[k++] = a[j++];
        }

        while (left <= right) {
            a[left] = temp[left];
            left++;
        }
    }
}
