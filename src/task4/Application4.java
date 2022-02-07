package task4;

import java.util.Scanner;

public class Application4 {
    public static void main(String[] args) {
        Number[] Numbers = new Number[] {null, null, null, null, null, null, null, null, null, null};
        Scanner in = new Scanner(System.in);
        System.out.println("Input string of numbers: ");
        String string = in.nextLine();
        char max = '0';
        for(int i = 0; i < string.length(); i++) {
            Number number = new Number(string.charAt(i), false);
            if(Numbers[Integer.parseInt(String.valueOf(string.charAt(i)))] == null ) {
                Numbers[Integer.parseInt(String.valueOf(string.charAt(i)))] = number;
            }
            if(string.charAt(i) > max) {
                max = string.charAt(i);
            }
        }
        Numbers[Integer.parseInt(String.valueOf(max))] = new Number(max, true);
        for(int i = 0; i < 5; i++) {
            for(int j = 0; j < string.length(); j++) {
                System.out.print(Numbers[Integer.parseInt(String.valueOf(string.charAt(j)))].getOurNumber()[i].toString() + " ");
            }
            System.out.println();
        }
    }
}
