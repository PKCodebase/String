package string;

public class ReverseWords2 {
    public String reverseWords(String s) {
        String[] arr = s.split(" ");
        StringBuilder res = new StringBuilder();
        for (int i = arr.length-1; i >= 0; i--) {
            if(arr[i].length() == 0){
                continue;
            }if(res.length() == 0){
                res.append(arr[i]);
            }else{
                res.append(" ");
                res.append(arr[i]);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        String s = "the sky is blue";
        ReverseWords2 solution = new ReverseWords2();
        System.out.println(solution.reverseWords(s));
    }
}
