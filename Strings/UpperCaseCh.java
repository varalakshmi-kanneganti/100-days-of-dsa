package Strings;

public class UpperCaseCh {
    public static void main(String[] args) {
        String str = "hello";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            result.append(Character.toUpperCase(ch));
        }
        System.out.println(result);
    }
}
