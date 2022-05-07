package labs_examples.fundamentals.labs;


/**
 * Fundamentals Exercise 5: Working with Strings
 *
 *      Please follow the instructions in the comments below
 *
 */

public class Exercise_05 {

    public static void main(String[] args) {

        String str = "hello!";
        // please declare an int variable below, and set it to the value of the length of "str"

        String str2 = "hello";
        // please initialize a boolean variable and test whether str is equal to str2
        boolean bool = true;
        bool = str.equalsIgnoreCase(str2);
        System.out.println("Is str is equal to str2: " + bool);
        // please concatenate str & str2 and set the result to a new String variable below
        String newstr = "";
        newstr = str + str2;
        System.out.println(newstr);
        // please demonstrate the use of any other method that is available to us in the String class
        // for example, replac e(), substring(), contains(), indexOf() etc
        String replaceString = str.replace("l","p");
        System.out.println("Str after replace: " + replaceString);
        System.out.println("Substring newstr from index 6: " + newstr.substring(6));
        System.out.println(newstr.contains("M"));
        System.out.println(newstr.indexOf('l'));
    }


}