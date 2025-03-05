package string;

public class FirstUniqueCharacter1 {
    public int firstUniqChar(String s) {
        int[] freq = new int[58];
        char [] ch =  s.toCharArray();
        for (char c :ch) {
            freq[c - 65]++;
        }
        for (int i = 0; i < s.length(); i++) {
            char ch1 = s.charAt(i);
            if (freq[ch1 - 65] == 1) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveLEeTcode";
        FirstUniqueCharacter1 solution = new FirstUniqueCharacter1();
        System.out.println(solution.firstUniqChar(s));
    }
}
