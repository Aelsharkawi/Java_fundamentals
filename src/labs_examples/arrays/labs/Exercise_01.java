package labs_examples.arrays.labs;

import java.util.Scanner;

/**
 * Arrays calculator
 *
 *      Take in 10 numbers from the user. Place the numbers in an array. Using the loop of your choice,
 *      calculate the sum of all of the numbers in the array as well as the average.
 *
 *      Print the results to the console.
 *
 */

public class Exercise_01 {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        double average=0;
        int[] numbers = new int[10];
        for(int i=0; i<numbers.length; i++)
        {
            System.out.print("Enter number "+(i+1) + " : ");
            numbers[i] = scanner.nextInt();
        }

        for(int i=0; i<numbers.length; i++)
        {
            sum += numbers[i];
        }
        average = sum/numbers.length;
        System.out.println("Sum = "+sum);
        System.out.println("Average = "+average);
    }
}