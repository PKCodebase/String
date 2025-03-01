package string;

public class CheckEqualString {

    public static void main(String[] args){
        String s1 = "kaushik";
        String s2 = "kaushik";
        String s3 = new String("kaushik");


        System.out.println(s1 == s2);  //True
        System.out.println(".............");
        System.out.println(s1.equals(s2)); //True
        System.out.println(".............");
        System.out.println(s1==s3);  //False
        System.out.println(".............");
        System.out.println(s1.equals(s3)); //True
        System.out.println(".............");

        String s4 = "Hello";
        String s5 = "Guys";

        System.out.println(s4 == s5); //False
        System.out.println(".............");

        String s6 = "Hello Guys";
        String s7 = s4.concat(s5);  //False
        System.out.println(s6 == s7);
        System.out.println(".............");

        String s8 = "Hello".concat("Guys"); //False
        System.out.println(s6 == s8);

        System.out.println(".............");
        System.out.println(s7 == s8);  //False

        System.out.println(".............");


        String s9 = "Kundan kumar";
        String s10 = "Kundan " + "kumar";
        System.out.println(s9==s10); //True



    }

}
