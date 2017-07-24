import java.util.ArrayList;

public class ReverseString {

    static void reverseStrings(String []strings){
        for(int i=strings.length;i>=1;i--) {
            System.out.print(strings[i-1] + " ");
        }
    }

    public static void main (String []args){
        String []  s = {"1", "2", "3", "4"};
        reverseStrings(s);
    }
}
