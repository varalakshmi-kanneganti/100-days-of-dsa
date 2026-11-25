package Strings;

public class CountUpperCase {
    public static void main (String args[]){
        String str = "VaRaLaksHmi";
        int count = 0; 
        for(int i = 0 ; i<str.length(); i++){
            char ch = str.charAt(i);
        if (ch >= 'A' && ch <= 'Z'){
            count++;
        }
        }
        System.out.println(count);
    }
}
