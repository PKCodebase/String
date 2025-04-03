package string;

import java.util.Arrays;

public class LongestStringChain {
    public int longestStrChain(String[] words) {
        Arrays.sort(words, (a, b) -> (a.length() - b.length()));

        // for(String word: words){
        //     System.out.println(word);
        // }

        int n = words.length;
        int[] dp = new int[n];

        int ans = 1;
        for(int i = 0; i<n; i++){
            dp[i] = 1;
            for(int prev = i-1; prev >= 0; prev--){
                if(words[i].length() - 1 == words[prev].length()){
                    int count = 0;

                    int x = 0, y = 0;
                    String a = words[i], b = words[prev];
                    while(x < a.length() && y < b.length()){
                        if(a.charAt(x) != b.charAt(y)){
                            x++;
                            count++;

                            if(count > 1){
                                break;
                            }
                        }else{
                            x++;
                            y++;
                        }
                    }

                    if(count <= 1){
                        dp[i] = Math.max(dp[i], 1 + dp[prev]);
                    }
                }
            }
            // System.out.print(dp[i] + " ");

            ans = Math.max(ans, dp[i]);
        }

        return ans;
    }
    public static void main(String[] args) {
        String[] words = {"a","b","ba","bca","bda","bdca"};
        LongestStringChain obj = new LongestStringChain();
        System.out.println(obj.longestStrChain(words));
    }
}
