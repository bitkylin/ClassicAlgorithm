package cc.bitky.sort;

import cc.bitky.sort.merge.MergeSort1;

public class SortMain {
    private int[] a;//定义一个数组

    private SortMain(int... values) {   //构造函数
        a = values;
    }

    public static void main(String[] args) {
        SortMain arr = new SortMain(5, 4, 3, 2, 1, 0);    //初始化数组
        arr.display();                 //展示数据
        arr.kySort(new MergeSort1());
        arr.display();                 //展示排序后的数据
        System.out.println("--------");
        arr = new SortMain(54, 35, 48, 36, 27, 12, 44, 44, 8, 14, 26, 17, 28);    //初始化数组
        arr.display();                 //展示数据
        arr.kySort(new MergeSort1());
        arr.display();                 //展示排序后的数据
    }

    private void display() {
        for (int i : a) {   //遍历数组中每一个元素
            System.out.print(i + " ");   //展示
        }
        System.out.println();
    }

    private void kySort(KySort sorter) {
        sorter.kySort(a, a.length);
    }
}