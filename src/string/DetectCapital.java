package string;

public class DetectCapital {
    public boolean detectCapitalUse(String word) {
        int n = word.length();
        int count = 0;

        for (char ch : word.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                count++;
            }
        }

        return count == 0 || count == n ||
                (count == 1 && Character.isUpperCase(word.charAt(0)));
    }
    public static void main(String[] args) {
        String word = "USA";
        DetectCapital solution = new DetectCapital();
        System.out.println(solution.detectCapitalUse(word));
    }
}


//Time Complexity: O(N)
//Space Complexity: O(1)