package string;

public class ValidPalindrome {

    public static boolean isPalindrome(String s){

        int str = s.length();
        int start = 0;
        int end = str-1;

        while(start<end){
            if(s.charAt(start) != s.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }


    public static void main(String []args){
        String s = "abba";
        System.out.println(isPalindrome(s));

    }
}
