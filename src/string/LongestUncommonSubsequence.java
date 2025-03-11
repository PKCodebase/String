package string;

public class LongestUncommonSubsequence {
    public int findLUSlength(String a, String b) {
        if(a.equals(b))
            return -1;

        if(a.length()>b.length())
            return a.length();
        else
            return b.length();
    }
    public static void main(String[] args) {
        String a = "aba";
        String b = "cdc";
        LongestUncommonSubsequence solution = new LongestUncommonSubsequence();
        System.out.println(solution.findLUSlength(a, b));
    }
}
