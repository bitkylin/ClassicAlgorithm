package cc.bitky.sort;

import cc.bitky.sort.Heap.HeapSort1;

public class SortMain {
    private static KySort sorter;
    private int[] a;//定义一个数组

    private SortMain(int... values) {   //构造函数
        a = values;
    }

    public static void main(String[] args) {
        setSorter(new HeapSort1());
        SortMain arr;
        arr = new SortMain(5, 4, 3, 2, 1, 0);
        arr.display();
        arr.kySort();
        arr.display();
        System.out.println("--------");
        arr = new SortMain(54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28);
        arr.display();
        arr.kySort();
        arr.display();
        System.out.println("--------");
        arr = new SortMain(32, 103, 24, 88, 95, 70, 97, 15, 102, 6, 79, 46, 51, 37, 93, 108, 9, 58, 53, 58, 79, 36, 58, 91, 78, 58, 61, 81);    //初始化数组
        arr.display();
        arr.kySort();
        arr.display();
    }

    private static void setSorter(KySort sorter) {
        SortMain.sorter = sorter;
    }

    private void display() {
        for (int i : a) {   //遍历数组中每一个元素
            System.out.print(i + " ");   //展示
        }
        System.out.println();
    }

    private void kySort() {
        sorter.kySort(a, a.length);
    }
}