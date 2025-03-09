package string;

public class LicenseKeyFormatting {
    public  static String licenseKeyFormatting(String s, int k) {
        StringBuilder res = new StringBuilder();
        int count = 0;
        int n = s.length() - 1;

        for (int i = n; i >= 0; i--) {
            char c = s.charAt(i);
            if (c != '-') {
                if (count > 0 && count % k == 0) {
                    res.append('-');
                }
                res.append(Character.toUpperCase(c));
                count++;
            }
        }

        return res.reverse().toString();
    }
    public static void main(String[] args) {
        String s = "5F3-2s-k";
        int k = 2;
        System.out.println(licenseKeyFormatting(s, k));
    }

}
