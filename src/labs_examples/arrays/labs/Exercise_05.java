package labs_examples.arrays.labs;

/**
 *  Traversing Arrays Backwards
 *
 *      Please create and populate an array of your choosing. Then, please demonstrate how to print out every other
 *      element in the array in reverse order.
 *
 */

public class Exercise_05 {
    public static void main(String[] args ) {

        int[] numbers = {10, 9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int i=9; i<numbers.length; i--)
        {
            if(i<0){break;}
            System.out.print(numbers[i] + " ");
        }

    }
}
