package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 7: First vowel
 *
 *      Take in a word from the user and using a "while" loop, find the first vowel in the word.
 *      Once you find the vowel, print out the word and the first vowel.
 *
 *      Hints:
 *          - there are a few helpful methods in the String class called length(), charAt() and indexOf()
 *          - you'll likely want to use a String that contains all the vowels:
 *              - ie: String vowels = "aeiou";
 *
 */

public class Exercise_07 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        String word;
        System.out.print("Enter a word: ");
        word = scanner.nextLine();
        //System.out.println(word);

        int i=0;
        while (i<word.length())
        {
            if(word.charAt(i) == 'a' | word.charAt(i) == 'e' | word.charAt(i) == 'i' |
            word.charAt(i) == 'o' | word.charAt(i) == 'u')
            {
                System.out.println("Word is: " + word);
                System.out.println("Char is: " + word.charAt(i));
                break;
            }
            else {
                if(i == word.length()-1)
                {
                    System.out.println("No vowel chars in word!");
                    break;
                }
            }
            i++;
        }

    }

}
