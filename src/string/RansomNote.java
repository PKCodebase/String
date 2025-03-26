package string;

public class RansomNote {
    public boolean canConstruct(String ransomNote, String magazine) {
        int[] count = new int[26];

        // Count letters in magazine
        for (char ch : magazine.toCharArray()) {
            count[ch - 'a']++;
        }

        // Check if ransomNote can be formed
        for (char ch : ransomNote.toCharArray()) {
            if (count[ch - 'a'] == 0) {
                return false; // If a letter is not available, return false
            }
            count[ch - 'a']--; // Use the letter
        }

        return true; // If all letters are available, return true
    }

    public static void main(String[] args) {
        String ransomNote = "abcr";
        String magazine = "abcd";
        RansomNote solution = new RansomNote();
        System.out.println(solution.canConstruct(ransomNote, magazine)); // Output: true
    }
}
