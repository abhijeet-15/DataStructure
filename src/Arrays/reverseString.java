package Arrays;

import java.util.Scanner;

public class reverseString {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String data = scanner.nextLine();
        System.out.println(reverse(data));
    }

    public static String reverse(String data){
        String s = "";
        for(int i = data.length() -1 ; i >=0; i--)
            s = s + data.charAt(i);
        System.out.println("Reversed String is " + s);
        return s;
    }
}
