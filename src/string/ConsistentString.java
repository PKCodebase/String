package string;

import java.util.HashSet;
import java.util.Set;

public class ConsistentString {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> myset = new HashSet<>();
        int count = 0;

        // Add allowed characters to the set
        for (char ch : allowed.toCharArray()) {
            myset.add(ch);
        }

        // Check each word
        for (String word : words) {
            boolean consistent = true;

            for (char ch : word.toCharArray()) {
                if (!myset.contains(ch)) {
                    consistent = false;
                    break;
                }
            }

            if (consistent) {
                count++;
            }
        }

        return count;
    }
    public static void main(String[] args) {
        String allowed = "ab";
        String[] words = {"ad", "bd", "aaab", "baa", "badab"};
        ConsistentString solution = new ConsistentString();
        System.out.println(solution.countConsistentStrings(allowed, words));
    }

}
