package string;

public class FirstOccurrenceString {
    public int strStr(String haystack, String needle) {
        int hayLength = haystack.length();
        int needleLength = needle.length();
        if (hayLength < needleLength) {
            return -1;
        }
        for (int i = 0; i <= hayLength - needleLength; i++) {
            int j = 0;
            while (j < needleLength && haystack.charAt(i + j) == needle.charAt(j)) {
                j++;
            }
            if (j == needleLength) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String haystack1 = "sadbutsad";
        String needle1 = "sad";
        FirstOccurrenceString solution = new FirstOccurrenceString();
        int result1 = solution.strStr(haystack1, needle1);
        System.out.println("Example 1: " + result1);
    }
}
