package cc.bitky.niuke.one;

public class StrMain {
    public static void main(String[] args) {
        String s = "he is a man and I am a apple";
        String sReverse = reverse(s);
        String[] strings = sReverse.split(" ");
        StringBuffer buffer = new StringBuffer();
        for (String string : strings) {
            buffer.append(reverse(string));
            buffer.append(" ");

        }
        System.out.print(buffer);
    }

    static String reverse(String str) {
        char[] chars = str.toCharArray();
        int i = 0;
        int j = chars.length - 1;
        while (i < j) {
            char temp = chars[i];
            chars[i] = chars[j];
            chars[j] = temp;
            i++;
            j--;
        }
        return String.valueOf(chars);
    }
}
