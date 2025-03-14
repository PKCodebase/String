package string;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseWord1 {
    public String reverseWords(String s) {
        return Arrays.stream(s.split(" "))
                .map(word-> new StringBuilder(word).reverse().toString())
                .collect(Collectors.joining(" "));
    }
    public static void main(String[] args) {
        ReverseWord1 reverseWord1 = new ReverseWord1();
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWord1.reverseWords(s));
    }
}
