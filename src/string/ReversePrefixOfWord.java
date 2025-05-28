package string;

public class ReversePrefixOfWord {
    public static void main(String[] args) {
        System.out.println(reversePrefix("abcdefd", 'd'));
    }

    public static String reversePrefix(String word, char ch) {
        int index = word.indexOf(ch);
        StringBuilder sb = new StringBuilder();
        sb.append(word.substring(0, index + 1));
        sb.reverse();
        sb.append(word.substring(index + 1));
        return sb.toString();
    }
}
