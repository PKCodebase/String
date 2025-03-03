package string;

public class ValidPalindrome2 {

    public static String trimString(String str){
        str = str.toLowerCase();
        int n = str.length();

        StringBuilder sb = new StringBuilder();
        for(int i=0;i<n;i++){
            char ch = str.charAt(i);
            if(Character.isLetterOrDigit(ch))
                sb.append(ch);
        }
        return sb.toString();
    }
    public boolean isPalindrome(String str){
        str = trimString(str);
        int n = str.length();

        int start = 0;
        int end = n-1;

        while(start<end){
            if(str.charAt(start)!=str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str = "A man, a plan, a canal: Panama";
        ValidPalindrome2 solution = new ValidPalindrome2();
        System.out.println(solution.isPalindrome(str));
    }
}
