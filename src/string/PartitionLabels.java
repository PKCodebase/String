package string;

import java.util.ArrayList;
import java.util.List;

public class PartitionLabels {
    public List<Integer> partitionLabels(String s) {
        int [] lastOccurance = new int[26];
        int n  = s.length();
        for(int i=0;i<n;i++){
            lastOccurance[s.charAt(i)-'a'] = i;
        }
        int start=0 ,end = 0;
        List<Integer> ans = new ArrayList<>();
        for(int i=0;i<n;i++){
            end = Math.max(end,lastOccurance[s.charAt(i)-'a']);
            if(i==end){
                ans.add(i-start+1);
                start = i+1;
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        PartitionLabels p = new PartitionLabels();
        List<Integer> result = p.partitionLabels(s);
        System.out.println(result);
    }
}
