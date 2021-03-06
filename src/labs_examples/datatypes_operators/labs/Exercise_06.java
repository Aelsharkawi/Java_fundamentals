package labs_examples.datatypes_operators.labs;

/**
 * Fundamentals Exercise 4: Volume and Surface Area
 *
 *      Write the necessary code to calculate the volume and surface area of a cylinder
 *      with a radius of 3.14 and a height of 5. Print out the result.
 *
 */

public class Exercise_06 {

    public static void main(String[] args) {

        // write code here
        double radius = 3.14d;
        int height = 5;
        double volume, area ;

        volume = Math.PI * (radius * radius) * height;
        System.out.println("Volume of cylinder = " + volume);

        area = 2 * ( Math.PI * radius * height ) + 2 * ( Math.PI * ( radius * radius) );
        System.out.println("Area of Cylinder = " + area);

    }
}