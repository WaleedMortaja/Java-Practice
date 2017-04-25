/*
E4.13 Write a program that reads a number between 1,000 and 999,999 from the user, where
the user enters a comma in the input. Then print the number without a comma.
Here is a sample dialog; the user input is in color:
Please enter an integer between 1,000 and 999,999: 23,456
23456
*/


import java.util.Scanner;

public class E13_DeleteThousandsComma {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter an integer between 1,000 and 999,999: ");
        String s = in.next();

        int length = s.length();

        String s1 = s.substring(0, length - 4);
        String s2 = s.substring(length - 3);
        System.out.println(s1 + s2);
        String s3 = s.replace(",", "");
        System.out.println(s3);
    }

}
/* It could also be solved using replace method to as
        s = s.replace( "," , "" );
        System.out.println(s);
 */
