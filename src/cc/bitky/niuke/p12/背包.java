package cc.bitky.niuke.p12;

public class 背包 {
    public static void main(String[] args) {
        int[] w = {20, 5, 5, 10};
        int[] v = {20, 5, 5, 10};
        int cap = 39;
        int n = 4;
        System.out.println(new 背包().maxValue(w, v, n, cap));
    }

    public int maxValue(int[] w, int[] v, int n, int cap) {
        int[] dp = new int[cap + 1];
        for (int i = 0; i < n; i++) {
            for (int weight = cap; weight >= w[i]; weight--) {
                dp[weight] = Math.max(dp[weight], dp[weight - w[i]] + v[i]);
            }
        }
        return dp[cap];
    }
}
