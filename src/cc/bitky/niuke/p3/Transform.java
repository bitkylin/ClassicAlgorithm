package cc.bitky.niuke.p3;

//对于两个字符串A和B，如果A和B中出现的字符种类相同且每种字符出现的次数相同，则A和B互为变形词，请设计一个高效算法，检查两给定串是否互为变形词。
//给定两个字符串A和B及他们的长度，请返回一个bool值，代表他们是否互为变形词。

public class Transform {
    public boolean chkTransform(String A, int lena, String B, int lenb) {
        if (lena != lenb) return false;
        char[] charsA = A.toCharArray();
        char[] charsB = B.toCharArray();

        int[] ints = new int[256];
        for (char c : charsA) {
            ints[c]++;
        }
        for (char c : charsB) {
            if (ints[c]-- == 0) return false;
        }
        return true;
    }
}
