package string;

import java.util.ArrayList;
import java.util.List;

public class FIndWordsContainingCharacters {
    public List<Integer> findWordsContaining(String[] words, char x) {
        List<Integer> ans = new ArrayList<>();
        int i=0;
        for(String word:words){
            for(char ch:word.toCharArray()){
                if(ch==x){
                    ans.add(i);
                    break;
                }
            }
            i++;
        }
        return ans;

    }
    public static void main(String[] args) {
        String[] words = {"leet","code"};
        char x = 'e';
        FIndWordsContainingCharacters f = new FIndWordsContainingCharacters();
        System.out.println(f.findWordsContaining(words, x));
    }
}
