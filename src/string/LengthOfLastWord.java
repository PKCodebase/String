package string;

public class LengthOfLastWord {
    public static int lengthOfLastWord(String s) {
        int i = s.length()-1;
        int length=0;
        while(i>=0){
            if(s.charAt(i) == ' '){
                if(length==0){
                    i--;
                }else{
                    break;
                }
            }else{
                length++;
                i--;
            }

        }
        return length;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        System.out.println(LengthOfLastWord.lengthOfLastWord(s));
    }
}
