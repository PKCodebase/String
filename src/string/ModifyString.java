package string;

public class ModifyString {
    public static void main (String [] args){
        String str = "kaushik";

        System.out.println(str.length());
        char ch[]= str.toCharArray();

        for(int i =0;i<ch.length;i++) {
            System.out.print(ch[i] + " ");
            ch[0] = 'K';
            ch[6] = 'K';
        }
        System.out.print("\n");

            for(int i =0;i<ch.length;i++){
                System.out.print(ch[i]+" ");
            }
            System.out.print("\n");
            System.out.println(str);//Original string doesn't change

    }
}
