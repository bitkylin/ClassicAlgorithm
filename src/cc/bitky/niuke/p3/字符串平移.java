package cc.bitky.niuke.p3;

public class 字符串平移 {
    public String stringTranslation(String A, int n, int len) {

        return reverse(reverse(A.substring(0, len)) + reverse(A.substring(len)));
    }

    private String reverse(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j)
            swap(chars, i++, j--);
        return new String(chars);
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;

    }
}
