package string;

public class ReverseString {
    public void reverseString(char[] s) {
        int start = 0;
        int end = s.length-1;

        while(start<end){
            char ch = s[start];
            s[start] = s[end];
            s[end] = ch;
            start++;
            end--;
        }
    }
    public static void main(String[] args) {
        char[] s = {'h','e','l','l','o'};
        ReverseString solution = new ReverseString();
        solution.reverseString(s);
        System.out.println(s);
    }
}

//Time complexity = O/n2 = O(n)
//Space Complexity = O(1)

