package string;

public class CountWords {

    // Method to remove extra spaces from the string
    public static String trimSpaces(String s) {
        int n = s.length();
        int start = 0;
        int end = n - 1;

        // Remove leading spaces
        while (start <= end && s.charAt(start) == ' ') {
            ++start;
        }

        // Remove trailing spaces
        while (start <= end && s.charAt(end) == ' ') {
            --end;
        }

        // Remove multiple spaces between words
        StringBuilder sb = new StringBuilder();
        while (start <= end) {
            char ch = s.charAt(start);
            if (ch != ' ') {
                sb.append(ch);
            } else if (sb.length() > 0 && sb.charAt(sb.length() - 1) != ' ') {
                sb.append(ch); // Append only one space
            }
            start++;
        }
        return sb.toString();
    }

    // Method to count words in a string
    public int countWord(String s) {
        s = trimSpaces(s); // Clean spaces first

        if (s.isEmpty()) {
            return 0;
        }

        return s.split(" ").length; // Count words
    }

    public static void main(String[] args) {
        String s = "  Hello   World   k";
        CountWords solution = new CountWords();
        System.out.println(solution.countWord(s)); // Expected Output: 3
    }
}
