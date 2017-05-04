/*
P4.13 The dew point temperature Td can be calculated (approximately) from the relative
humidity RH and the actual temperature T by
td = (B * f(t, rh)) / (A - f(t, rh))
f(t,rh) = (A * t) / (B + t) + ln(rh)
where a = 17.27 and b = 237.7° C.
Write a program that reads the relative humidity (between 0 and 1) and the temperature
(in degrees C) and prints the dew point value. Use the Java function log to
compute the natural logarithm.
*/

/**
 *
 * @author Waleed Mortaja,
 *contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 */

import java.util.Scanner;

public class P13_ClaculateDewPointTemperature {

    static final double A = 17.27;
    static final double B = 237.7;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the relative humidity(between 0 and 1): ");
        if (in.hasNextDouble()) { //check if rh is double
            double rh = in.nextDouble();
            if (0 <= rh && rh <= 1) { // check if relative humidity is between 0 and 1 
                System.out.print("Enter the temperature: ");
                if (in.hasNextDouble()) {
                    double t = in.nextDouble();
                    
                    // now the inputs are vaild and the computing will start from here
                    
                    double td = (B * f(t, rh)) / (A - f(t, rh)); //f is a function will defined later in the code
                    System.out.println(td);
                } else {
                    System.out.println("Invaild input.");
                }

            } else {
                System.out.println("Invaild input.");
            }
        } else {
            System.out.println("Invaild input.");
        }
    }

    public static double f(double t, double rh) {

        return (A * t) / (B + t) + Math.log(rh);
    }
}
