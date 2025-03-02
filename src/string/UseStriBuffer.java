package string;

public class UseStriBuffer {
    public static void main(String []args){
        StringBuffer sb = new StringBuffer("kaushik ");
        StringBuffer sb1 = new StringBuffer("kaushik");

        System.out.println(sb==sb1);
        System.out.println(sb.equals(sb1));

        sb.append("kumar");
        System.out.println(sb);

        sb.reverse();
        System.out.println(sb);

    }
}
