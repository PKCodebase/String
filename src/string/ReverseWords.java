package string;

import static java.util.Collections.reverse;

public class ReverseWords {
    String reverseWords(String s){
       StringBuilder res = new StringBuilder();
       int start = s.length()-1;
       while(start>=0){
           while(start>=0 && s.charAt(start) ==' '){
               start--;
           }
           if(start<=0){
               break;
           }
           int end = start;
           while(start>=0 && s.charAt(start) != ' '){
               start--;
           }
           if(res.length()==0){
               res.append(s.substring(start+1,end+1));
           }
           else{
               res.append(" ");
               res.append(s.substring(start+1, end+1));
           }
       }
       return res.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        ReverseWords solution = new ReverseWords();
        System.out.println(solution.reverseWords(s));
    }
}
