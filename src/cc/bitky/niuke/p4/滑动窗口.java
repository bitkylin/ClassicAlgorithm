package cc.bitky.niuke.p4;

import java.util.Arrays;
import java.util.LinkedList;

public class 滑动窗口 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new 滑动窗口().slide(new int[]{357, 564, 212, 500, 96}, 5, 3)));
    }

    public int[] slide(int[] arr, int n, int w) {
        LinkedList<Integer> stack = new LinkedList<>();
        int[] res = new int[arr.length - w + 1];
        for (int i = 0; i < arr.length; i++) {
            while (!stack.isEmpty() && arr[stack.peek()] <= arr[i]) {
                stack.pop();
            }
            stack.push(i);
            while (i - w >= stack.peekLast()) stack.pollLast();
            if (i - w + 1 >= 0)
                res[i - w + 1] = arr[stack.peekLast()];
        }
        return res;
    }
}
