package Strings;

public class ExtractFirstName {
    public static void main(String args[]){
        String name = "Varalakshmi Kanneganti";
        int space = name.indexOf(" ");
        System.out.print(name.substring(0,space));
    }
}
