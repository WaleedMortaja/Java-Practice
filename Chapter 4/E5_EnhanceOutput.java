/*
E4.5 Enhance the output of Exercise E4.4 so that the numbers are properly aligned:
Sum: 45
Difference: -5
Product: 500
Average: 22.50
Distance: 5
Maximum: 25
Minimum: 20
*/

/**
 *
 * @author Waleed Mortaja,
 *contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 */

import java.util.Scanner;  // import Scanner Class.

public class E5_EnhanceOutput {

    public static void main(String[] args) {
        int x, y;  // define two integer variables with the names of x and y.
        Scanner in = new Scanner(System.in);  // define Scanner object with the name of in.
        System.out.print("Enter the first integer : ");
        if (in.hasNextInt()) {  // checks if the input is integer or not.
            x = in.nextInt();  // store the input in x.

            System.out.print("Enter the second integer : ");
            if (in.hasNextInt()) {
                y = in.nextInt();  // store the input in x.

                System.out.printf("The sum :     %5d\n", (x + y));  // use printf method to enhance the output
.                System.out.printf("Difference :  %5d\n", (x - y));
                System.out.printf("The product : %5d\n", (x * y));
                System.out.printf("The average : %8.2f\n", (x + y) / 2.0);
                System.out.printf("Distance :    %5d\n", Math.abs(x - y));
                System.out.printf("Maximum :     %5d\n", Math.max(x, y));
                System.out.printf("Minimum :     %5d\n", Math.min(x, y));
            } else {
                System.out.println("Invaild Inputs, please try again.");
            }

        } else {
            System.out.println("Invaild Inputs, please try again.");
        }
    }
}
