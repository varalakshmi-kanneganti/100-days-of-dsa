package Strings;
//Time Complexity -->O(n^2)
public class Palindrome1 {
    public static void main (String args[]){
        String str = "LEVEL";
        String rev = "";
        for(int i = str.length()-1; i>=0; i--){
            rev = rev + str.charAt(i);
        }
        if(str.equals(rev)){
            System.out.println("String is Palindrome");
        }else{
            System.out.println("String is not Palindrome");
        }
    }
}
