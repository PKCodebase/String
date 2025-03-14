package string;

public class ReverseWord2 {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            result.append(new StringBuilder(word).reverse()).append(" ");
        }

        return result.toString().trim();
    }
    public static void main(String[] args) {
        ReverseWord2 reverseWord2 = new ReverseWord2();
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWord2.reverseWords(s));
    }
}
