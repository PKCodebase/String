package string;

public class IsSubsequence {

    public static boolean isSubsequence(String s, String t) {
        int start= 0,start1=0;
        int m = s.length();
        int n = t.length();
        while(start<m && start1<n){
            if(s.charAt(start) == t.charAt(start1)){
                start++;
                start1++;
            }
            else{
                start1++;
            }
        }
        return start == m;
    }
    public static void main(String[] args) {
        String s = "abc";
        String t = "ahbgdc";
        System.out.println(isSubsequence(s,t));
    }
}
