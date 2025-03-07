package string;

public class MakeTheStringGreat {

    public static String makeGood(String s) {
        StringBuilder sb = new StringBuilder(s);
        int i = 0;
        while(i<sb.length()-1){
            int diff = Math.abs(sb.charAt(i) - sb.charAt(i+1));
            if(diff==32){
                sb.delete(i,i+2);
                if(i>0) i--;
            }
            else i++;
        }
        return sb.toString();

    }
    public static void main(String[] args) {
        System.out.println(makeGood("leEeetcode"));
    }
}
