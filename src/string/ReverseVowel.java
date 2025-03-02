package string;

public class ReverseVowel {
    public boolean  isVowel(char ch) {
        boolean  b = ch=='a' || ch=='e' || ch=='i' ||ch=='o'||ch=='u'||ch=='A' || ch=='E' || ch=='I' ||ch=='O'||ch=='U';
        return b;

    }
    public String reverseVowels(String str){
        char [] charArr = str.toCharArray();

        int n = charArr.length;

        int start = 0;
        int end = n-1;

        while (start<end){
            while(start<n && !isVowel(charArr[start])){
                start++;
            }
            while(end>=0 && !isVowel(charArr[end])){
                end--;
            }
            if(start<end){
                char temp = charArr[start];
                charArr[start] = charArr[end];
                charArr[end]=temp;
            }
            start++;
            end--;
        }
        String mystr = new String(charArr);
        return mystr;
    }
    public static void main(String[] args) {
        String str = "kaushik";
        ReverseVowel solution = new ReverseVowel();
        System.out.println(solution.reverseVowels(str));
    }

}
