package string;

public class RemoveVowels {

    public boolean  isVowel(char ch) {
        boolean  b = ch=='a' || ch=='e' || ch=='i' ||ch=='o'||ch=='u'||ch=='A' || ch=='E' || ch=='I' ||ch=='O'||ch=='U';
        return b;

    }
    public String removeVowels(String str) {
        int n = str.length();

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < n; i++) {
            char ch = str.charAt(i);
            if (!isVowel(ch)) {
                sb.append(ch);
            }

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str = "kaushik";
        RemoveVowels solution = new RemoveVowels();
        System.out.println(solution.removeVowels(str));
    }

}
