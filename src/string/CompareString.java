package string;

public class CompareString {
    public static void main(String [] args){
        String s1 = "HELLO";
        String s2 = "HELLO";
        String s3 = "Hello";

        System.out.println(s1.equals(s2));
        System.out.println("__________________");
        System.out.println(s1.equals(s3));
        System.out.println("__________________");
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println("__________________");
        System.out.println(s1.compareTo(s2));
        System.out.println("__________________");
        System.out.println(s1.compareTo(s3)); // Compare the ASCII value
        System.out.println("__________________");


    }
}
