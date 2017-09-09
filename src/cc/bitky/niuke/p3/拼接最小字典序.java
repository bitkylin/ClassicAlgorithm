package cc.bitky.niuke.p3;

import java.util.Arrays;
import java.util.Comparator;

//对于一个给定的字符串数组，请找到一种拼接顺序，使所有小字符串拼接成的大字符串是所有可能的拼接中字典序最小的。
//给定一个字符串数组strs，同时给定它的大小，请返回拼接成的串。
public class 拼接最小字典序 {
    public String findSmallest(String[] strs, int n) {
        Arrays.sort(strs, new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return (o1 + o2).compareTo(o2 + o1);
            }
        });
        StringBuilder builder = new StringBuilder();
        for (String s : strs) {
            builder.append(s);
        }
        return builder.toString();
    }
}
