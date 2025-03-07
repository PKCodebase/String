    package string;

    public class CheckBinaryString {
        public boolean checkOnesSegment(String s) {
            int n= s.length();
            for(int i=1;i<n;i++){
                if(s.charAt(i-1) =='0' && s.charAt(i) == '1'){
                    return false;
                }
            }
            return true;
        }
        public static void main(String[] args) {
            String s = "110";
            CheckBinaryString solution = new CheckBinaryString();
            System.out.println(solution.checkOnesSegment(s));
        }
    }

