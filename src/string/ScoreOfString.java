package string;

public class ScoreOfString {
    public static int scoreOfString(String s) {

        int score = 0;
        int n = s.length()-1;
        for (int i = 0; i < n; i++) {
            score += Math.abs(s.charAt(i) - s.charAt(i + 1));
        }
        return score;
    }
    public static void main(String[] args) {
        String s = "hello";
        int result = scoreOfString(s);
        System.out.println(result);
    }

}
