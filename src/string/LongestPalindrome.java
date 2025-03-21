package string;

import java.util.HashSet;

public class LongestPalindrome {
    public int longestPalindrome(String s) {
        int[] count = new int[128]; // ASCII size to store frequency

        // Count frequency of each character
        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int length = 0;
        boolean hasOdd = false;

        // Process counts
        for (int freq : count) {
            length += (freq / 2) * 2; // Add even part of frequency
            if (freq % 2 == 1) {
                hasOdd = true; // Track if we have at least one odd frequency
            }
        }

        // If there's an odd frequency character, add 1 to the palindrome
        return hasOdd ? length + 1 : length;

    }
    public static void main(String[] args) {
        String s = "abccccdd";
        LongestPalindrome solution = new LongestPalindrome();
        System.out.println(solution.longestPalindrome(s));
    }
}
