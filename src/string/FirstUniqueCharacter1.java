package string;

public class FirstUniqueCharacter1 {
    public int firstUniqChar(String s) {
        int[] freq = new int[58];
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            freq[ch-65]++;
        }
        for (int i = 0; i < freq.length; i++) {
           if(freq[i]>0){
               char ch = (char)(i+65);
               int index = s.indexOf(ch);
               if(index!=-1 && s.indexOf(ch,index+1)==-1){
                   return index;
               }
           }
        }
        return -1;
    }
    public static void main(String[] args) {
        String s = "loveLEeTcode";
        FirstUniqueCharacter1 solution = new FirstUniqueCharacter1();
        System.out.println(solution.firstUniqChar(s));
    }
}
