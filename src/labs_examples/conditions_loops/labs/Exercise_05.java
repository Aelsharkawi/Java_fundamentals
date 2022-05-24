package labs_examples.conditions_loops.labs;

import java.util.Scanner;

/**
 * Conditions and Loops Exercise 5: Calculator
 *
 *      Take two numbers from the user, an upper and lower bound. Using a "for-loop", calculate the sum
 *      of numbers from the lower bound to the upper bound. Also, calculate the average of numbers.
 *      Print the results to the console.
 *
 *      For example, if a user enters 1 and 100, the output should be:
 *
 *      The sum is: 5050
 *      The average is: 50.5
 *
 *
 */

public class Exercise_05 {
    public static void main(String args[])
    {
        Scanner scanner = new Scanner(System.in);
        int lower=0, upper=0, count=0, validation=0, sum=0;
        double average=0;
        System.out.print("Enter lower number: ");
        lower = scanner.nextInt();
        System.out.print("Enter upper number: ");
        upper = scanner.nextInt();

        //validation condition
        if(lower>upper)
        {
            validation = upper;
            upper=lower;
            lower = validation;
        }

        for(count=lower; count<=upper; count++ )
        {
            sum +=count;
        }
        average = (double)sum/(count-1);
        System.out.println("Sum= "+sum);
        System.out.println("Average= "+average);
    }



}
