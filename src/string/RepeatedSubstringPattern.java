package string;

public class RepeatedSubstringPattern {
    public static boolean repeatedSubstringPattern(String s) {
        int n  = s.length();

        for(int i = n/2;i>=1;i--){
            if(n%i==0){
                String substr = s.substring(0,i);
                StringBuilder sb = new StringBuilder();
                for(int j=1;j<=n/i;j++)
                    sb.append(substr);

                if(sb.toString().equals(s))
                    return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("aba"));
    }
}
