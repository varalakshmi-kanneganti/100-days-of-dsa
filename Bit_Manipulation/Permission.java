package Bit_Manipulation;

public class Permission {
    public static void main(String[] args) {
        int READ = 1;
        int WRITE = 2;
        int EXECUTE = 4;
        int permissions = READ | WRITE;
        System.out.println(permissions);
    }

}
