package string;

public class Gcd {
    public String gcdOfStrings(String str1, String str2) {
        if (!(str1 + str2).equals(str2 + str1)) {
            return "";
        }
        // Find the greatest common divisor (GCD) of the lengths of the two strings
        int gcdLength = gcd(str1.length(), str2.length());
        return str1.substring(0, gcdLength);
    }

    private int gcd(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
    public static void main(String[] args) {
        String str1 = "ABABAB";
        String str2 = "ABAB";
        Gcd solution = new Gcd();
        System.out.println(solution.gcdOfStrings(str1, str2));
    }

}
