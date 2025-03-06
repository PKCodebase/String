package string;

public class RomanToInteger {

    public int romanToInt(String s) {
        int sum = 0;
        int previousNum = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            int num =0;
            switch (s.charAt(i)) {
                case 'I':
                    num = 1;
                    break;
                case 'V':
                    num = 5;
                    break;
                case 'X':
                    num = 10;
                    break;
                case 'L':
                    num = 50;
                    break;
                case 'C':
                    num = 100;
                    break;
                case 'D':
                    num = 500;
                    break;
                case 'M':
                    num = 1000;
                    break;
            }
            if (num < previousNum) {
                sum -= num;
            } else {
                sum += num;
            }
            previousNum = num;
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "XXVI";
        RomanToInteger solution = new RomanToInteger();
        System.out.println(solution.romanToInt(s));

    }
}

//Time : O(n)
//Space: O(1)
