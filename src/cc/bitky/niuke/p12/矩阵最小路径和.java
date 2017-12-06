package cc.bitky.niuke.p12;

public class 矩阵最小路径和 {
    public int getMin(int[][] map, int n, int m) {
        int[][] min = new int[n][m];
        min[0][0] = map[0][0];
        for (int i = 1; i < n; i++) {
            min[i][0] = min[i - 1][0] + map[i][0];
        }
        for (int i = 1; i < m; i++) {
            min[0][i] = min[0][i - 1] + map[0][i];
        }
        for (int i = 1; i < n; i++) {
            for (int j = 1; j < m; j++) {
                min[i][j] = map[i][j] + Math.min(min[i - 1][j], min[i][j - 1]);
            }
        }
        return min[n - 1][m - 1];
    }
}
