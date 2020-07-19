import java.util.Arrays;

public class Anagram {
    static boolean anagramChecker(String first, String second){

        int number1 = first.length();
        int number2 = second.length();

        if (number1 != number2)
            return false;
        else {
            char[] ch1 = new char[number1];
            char[] ch2 = new char[number2];

            for (int i = 0; i < number1; i++) {
                ch1[i] = first.charAt(i);
                ch2[i] = second.charAt(i);
            }

            Arrays.sort(ch1);
            Arrays.sort(ch2);

            for (int i = 0; i < number1; i++)
                if (ch1[i] != ch2[i])
                    return false;

            return true;
        }
    }
}
