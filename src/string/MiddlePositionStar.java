package string;

public class MiddlePositionStar {
    public static String addStar(String s){

        char ch[] = s.toCharArray();
        int n = ch.length;

        StringBuilder sb = new StringBuilder();

        for(int i=0;i<n;i++){
            if(i%2 !=0 ){
                sb.append("*");
            }else{
                sb.append(ch[i]);
            }
        }
        return sb.toString();
    }
    public static void main(String []args){
        String s = "abcdef";
        System.out.println(addStar(s));
    }
}
