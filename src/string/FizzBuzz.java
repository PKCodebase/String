package string;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
    public static List<String> fizzBuzz(int n) {
        List<String> mylist = new ArrayList<>();
        for(int i=1;i<=n;i++){
            if(i%3==0 && i%5==0){
                mylist.add("FizzBuzz");
            }
            else if(i%3==0){
                mylist.add("Fizz");
            }else if(i%5==0){
                mylist.add ("Buzz");
            }
            else{
                mylist.add(String.valueOf(i));
            }
        }
        return mylist;

    }
    public static void main(String[] args) {
        int n = 15;
        List<String> result = fizzBuzz(n);
        System.out.println(result);
    }
}
