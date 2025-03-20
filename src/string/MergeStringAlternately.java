package string;

public class MergeStringAlternately {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        int len1 = word1.length(), len2 = word2.length();
        while (i < len1 && j < len2) {
            sb.append(word1.charAt(i++));
            sb.append(word2.charAt(j++));
        }
        sb.append(word1.substring(i)).append(word2.substring(j));

        return sb.toString();
    }
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";
        MergeStringAlternately solution = new MergeStringAlternately();
        System.out.println(solution.mergeAlternately(word1, word2));
    }
}
