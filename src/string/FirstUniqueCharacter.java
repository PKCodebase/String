package string;

public class FirstUniqueCharacter {
    public int firstUniqChar(String s) {
        int[] freq = new int[26];
        char [] ch =  s.toCharArray();
        for (char c :ch) {
            freq[c - 'a']++;
        }
        for (int i = 0; i < s.length(); i++) {
            if (freq[s.charAt(i) - 'a'] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveleetcode";
        FirstUniqueCharacter solution = new FirstUniqueCharacter();
        System.out.println(solution.firstUniqChar(s));
    }
}
