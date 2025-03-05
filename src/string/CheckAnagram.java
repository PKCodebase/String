package string;

public class CheckAnagram {

    public static boolean isAnagram(String a, String b) {
        int m = a.length();
        int n = b.length();
        if (m != n)
            return false;

        int count[] = new int[26];
        for (char ch : a.toCharArray())
            count[ch - 'a']++;

        for (char ch : b.toCharArray())
            count[ch - 'a']--;

        for (int val : count)
            if (val != 0) {
                return false;
            }
        return true;
    }
    public static void main(String[] args) {
        String a = "anagram";
        String b = "agaram";
        System.out.println(isAnagram(a, b));
    }

}
