package string;

public class IntegerToRoman {
    public static String intToRoman(int num) {
        StringBuilder res = new StringBuilder();
        String symbol[] = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        int val[]  = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        for(int i =0;i<val.length;i++){
            while(num>=val[i]){
                num -= val[i];
                res.append(symbol[i]);
            }
        }
        return res.toString();
    }
    public static void main(String[] args) {
        int num = 13;
        System.out.println(intToRoman(num));
    }
}
