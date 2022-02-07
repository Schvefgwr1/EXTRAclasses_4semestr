package task3;

import java.util.ArrayList;
import java.util.Scanner;

public class Application3 {

    static final char[] Vowels = new char[]{'а', 'е', 'ё', 'и', 'о', 'у', 'ы', 'э', 'ю', 'я', 'А', 'Е', 'Ё', 'И', 'О', 'У', 'Ы', 'Э', 'Ю', 'Я'};
    static ArrayList<Integer> numbers = new ArrayList<Integer>();
    static ArrayList<String> words = new ArrayList<String>();

    public static String changeCharInPosition(int position, char ch, String str){
        char[] charArray = str.toCharArray();
        charArray[position] = ch;
        return new String(charArray);
    }

    public static String HowManyVowels(String string) {
        int k = 0;
        int k2 = 0;
        for(int i = 0; i < string.length(); i++) {
            boolean flag = false;
            for(int j = 0; j < Vowels.length; j++) {
                if(string.charAt(i) == Vowels[j]) {
                    flag = true;
                    if (j < 10) {
                        k2++;
                        if(k2 == 1) {
                            string = changeCharInPosition(i, Vowels[j + 10], string);
                        }
                    }
                }
            }
            if ((string.charAt(i) != ' ') && (flag == true)) {
                k++;
            }
            if((string.charAt(i) == ' ') || (i == string.length() - 1)) {
                numbers.add(k);
                k = 0;
                k2 = 0;
            }
        }
        return string;
    }

    public static void StringToWords(String string) {
        StringBuffer stringBuffer = new StringBuffer();
        for(int i = 0; i < string.length(); i++) {
            if (string.charAt(i) != ' ') {
                stringBuffer.insert(stringBuffer.length(),string.charAt(i));
            }
            if ((string.charAt(i) == ' ') || (i == string.length() - 1)) {
                words.add(stringBuffer.toString());
                stringBuffer.delete(0, stringBuffer.length());
            }
        }
    }

    public static void getSortedWords() {
        for (int j = 0; j < numbers.size(); j++) {
            int max = -1, kmax = -1;
            for (int i = 0; i < numbers.size(); i++) {
                if (numbers.get(i) > max) {
                    max = numbers.get(i);
                    kmax = i;
                }
            }
            System.out.print(words.get(kmax) + " ");
            numbers.set(kmax, -1);
        }
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String string = in.nextLine();
        string = Application3.HowManyVowels(string);
        Application3.StringToWords(string);
        Application3.getSortedWords();
    }
}
