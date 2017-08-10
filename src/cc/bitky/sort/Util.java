package cc.bitky.sort;

public class Util {
    public static void swap(int[] a, int i, int j) {
        int k = a[i];
        a[i] = a[j];
        a[j] = k;
    }
}
