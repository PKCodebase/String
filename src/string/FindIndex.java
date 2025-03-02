package string;

public class FindIndex {
    public static void main(String [] args){
        String str = "kaushik";

        System.out.println(str.length());
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(5));

        System.out.println(str.substring(2));

        System.out.println(str.substring(2,6));

        System.out.println(str.indexOf("aushik"));

        System.out.println(str.indexOf("k"));

        System.out.println(str.lastIndexOf("k"));

        System.out.println(str.contains("aus"));

        System.out.println(str.contains("shik"));

        System.out.println(str.contains("hello"));
    }
}
