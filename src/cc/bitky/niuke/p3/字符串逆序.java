package cc.bitky.niuke.p3;

//对于一个字符串，请设计一个算法，只在字符串的单词间做逆序调整，也就是说，字符串由一些由空格分隔的部分组成，你需要将这些部分逆序。
// 给定一个原字符串A和他的长度，请返回逆序后的字符串。
public class 字符串逆序 {
    public static void main(String[] args) {
        new 字符串逆序().reverseSentence("abc xyz def", 11);
    }

    public String reverseSentence(String A, int n) {
        String[] strings = reverse(A).split(" ");
        StringBuilder builder = new StringBuilder();
        for (String s1 : strings) {
            builder.append(reverse(s1)).append(" ");
        }
        return builder.toString().trim();
    }

    private String reverse(String s) {
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            swap(chars, i++, j--);
        }
        return new String(chars);
    }

    private void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}
