import java.util.Scanner;
import java.util.Arrays;

public class P5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s = in.next();
        System.out.println("string methods for : " + s);
        System.out.println(".charAt(1) gives character at given position or -1: " + s.charAt(1));
        System.out.println(".toCharArray() converts string to char array: " + Arrays.toString(s.toCharArray()));
        System.out.println(".toUpperCase() converts stirng to upper case: " + s.toUpperCase());
        String b = s.toUpperCase();
        System.out.println(".toLowerCase() converts characters to lower case: " + b + ", " + b.toLowerCase());
        String t = "  xxx   ";
        System.out.println(".trim() trims white space on each side of the string: " + t + " " + t.trim());
        in.close();
    }
}
