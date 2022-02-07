package task2;

import java.util.Scanner;

public class Application2 {
    public static int inputNumber() {
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        String string = in.next();
        double buffer_number = Double.parseDouble(string);
        int number = (int) buffer_number;
        while (buffer_number != number) {
            System.out.println("Incorrect number. Please retry:");
            string = in.next();
            buffer_number = Double.parseDouble(string);
            number = (int) buffer_number;
        }
        in.close();
        return number;
    }
    public static void SimpleNumbers(int input) {
        System.out.print("Simple multipliers of number: ");
        int del = 2;
        while (input > 1) {
            if (input % del == 0) {
                input /= del;
                System.out.print(del + " ");
            } else if (del + 1 % 2 == 0) {
                del += 2;
            } else {
                del++;
            }
        }
    }
    public static void main(String[] args) {
        int number = Application2.inputNumber();
        Application2.SimpleNumbers(number);
    }
}
