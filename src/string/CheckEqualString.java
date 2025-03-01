package string;

public class CheckEqualString {

    public static void main(String[] args){
        String s1 = "kaushik";
        String s2 = "kaushik";
        String s3 = new String("kaushik");

        System.out.println(s1 == s2);
        System.out.println(".............");
        System.out.println(s1.equals(s2));
        System.out.println(".............");
        System.out.println(s1==s3);
        System.out.println(".............");
        System.out.println(s1.equals(s3));


    }

}
