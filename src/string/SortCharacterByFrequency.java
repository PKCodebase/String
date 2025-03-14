package string;
import java.util.Arrays;

public class SortCharacterByFrequency {
    public static String frequencySort(String s) {
        int[] freq = new int[128];  // Step 1: Store character frequencies (ASCII)
        for (char c : s.toCharArray()) {
            freq[c]++;
        }

        // Step 2: Sort characters based on frequency, and lexicographically for ties
        Character[] chars = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            chars[i] = s.charAt(i);
        }

        Arrays.sort(chars, (a, b) -> {
            if (freq[b] != freq[a]) {
                return freq[b] - freq[a];  // Sort by frequency (descending)
            }
            return a - b; // Sort lexicographically when frequencies are equal
        });

        // Step 3: Build the output string
        StringBuilder result = new StringBuilder();
        for (char c : chars) {
            result.append(c);
        }

        return result.toString();
    }
    public static void main(String[] args) {
        String s = "tree";
        System.out.println(frequencySort(s));
    }

}
