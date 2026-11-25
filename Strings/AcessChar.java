package Strings;
import java.util.*;
public class AcessChar {
    public static void main(String args[]){
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter a word: ");
       String str = sc.nextLine();
       char ch = str.charAt(6);
       System.out.println(ch);  
    }
}
