package Strings;

public class CharsAtEven {
    public static void main(String args[]){
        String str = "varalaskhmi";
        for(int i = 0; i<str.length(); i+=2){
            char ch = str.charAt(i);
            System.out.print(ch);
        }
    }
}
