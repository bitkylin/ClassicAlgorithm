package cc.bitky.niuke.p12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 找零钱 {
    public static void main(String[] args) {
        int[] penny = {1, 2, 5};
        int n = 3;
        int aim = 10;
        System.out.println(new 找零钱().countWays完整(penny, n, aim));

    }

    public int countWays(int[] penny, int n, int aim) {
        Arrays.sort(penny);
        int[] ints = new int[aim + 1];
        ints[0] = 1;
        for (int i = 0; i < n; i++) {
            for (int k = penny[i]; k <= aim; k++) {
                ints[k] += ints[k - penny[i]];
            }
        }
        return ints[aim];
    }

    private List<int[]> countWays完整(int[] penny, int n, int aim) {
        Arrays.sort(penny);
        List<int[]>[] lists = new ArrayList[aim + 1];//new int[aim + 1][penny.length];
        lists[0] = new ArrayList<>();
        lists[0].add(new int[penny.length]);
        for (int i = 0; i < n; i++) {
            for (int k = penny[i]; k <= aim; k++) {
                int finalK = k;
                int finalI = i;
                if (lists[finalK] == null) lists[finalK] = new ArrayList<>();
                lists[k - penny[i]].forEach(item -> {
                    int[] ints = Arrays.copyOf(item, item.length);
                    ints[finalI]++;
                    lists[finalK].add(ints);
                });
            }
        }
        return lists[aim];
    }
}
