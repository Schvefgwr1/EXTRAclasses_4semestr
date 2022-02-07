package task1;

import java.util.Scanner;

public class Application1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Input string: ");
        String string = in.next();
        int sum = 0;
        for (int i = 0; i < string.length(); i++) {
            if((string.charAt(i) >= '1') && (string.charAt(i) <= '9')) {
                sum += Integer.parseInt(String.valueOf(string.charAt(i)));
            }
        }
        System.out.println("Summary of number in string: " + sum);
        in.close();
    }
}
