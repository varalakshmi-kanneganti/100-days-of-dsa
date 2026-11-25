package Strings;

public class StringCompression {
    public static void main(String args[]){
        String str = "aaabbcccc";
        StringBuilder result = new StringBuilder();
        for (int i = 0; i<str.length();){
            int count = 1;
            while(i+1<str.length() && str.charAt(i) == str.charAt(i+1)){
                count++;
                i++;
            }
            result.append(str.charAt(i));
            if(count > 1){
                result.append(count);
            }
            i++;
        }
        System.out.print(result);
    }
}
