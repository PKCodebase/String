package string;

public class AddStrings {
    public static String addStrings(String num1, String num2) {
        StringBuilder sb = new StringBuilder();
        int carry = 0;
        int a = num1.length() - 1;
        int b = num2.length() - 1;
        while (a >= 0 || b >= 0) {
            int sum = carry;
            if (a >= 0) sum += num1.charAt(a--) - '0';
            if (b >= 0) sum += num2.charAt(b--) - '0';
            sb.append(sum % 10);
            carry = sum / 10;
        }
        if (carry != 0) sb.append(carry);
        return sb.reverse().toString();
    }

    public static void main(String[] args) {
        String num1 = "11";
        String num2 = "123";
        System.out.println(addStrings(num1, num2));
    }
}
