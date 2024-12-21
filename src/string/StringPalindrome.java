package string;

public class StringPalindrome {
    public static boolean isPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-zA-Z0-9]", "");
        int left = 0;
        int right = str.length() - 1;
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public static void main(String[] args) {
        String str1 = "A man, a plan, a canal: Panama";
//        String str2 = "hello";
        System.out.println("Is '" + str1 + "' a palindrome? " + isPalindrome(str1));
        //  System.out.println("Is '" + str2 + "' a palindrome? " + isPalindrome(str2));

    }
}
