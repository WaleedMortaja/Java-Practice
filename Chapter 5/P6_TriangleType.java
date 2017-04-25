/*
P5.6 Write a program that reads in the x- and y-coordinates of three corner points of a
triangle and prints out whether it has an obtuse angle, a right angle, or only acute
angles.
*/

import java.util.Scanner;

public class P6_TriangleType {

    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("This program prompt the x- and y-coordinates of three corner points of a\n"
                + "triangle and checks whether it has an obtuse angle, a right angle, \n"
                + "or only acute angles.\n\n");

        System.out.print("Enter x1: ");
        int x1 = scanValidInt();
        /*scanValidInt is a method checks if the input is valid int,
          otherwise, it terminates the program. It had been defined later in the code.*/

        System.out.print("Enter y1: ");
        int y1 = scanValidInt();

        System.out.print("Enter x2: ");
        int x2 = scanValidInt();

        System.out.print("Enter y2: ");
        int y2 = scanValidInt();

        System.out.print("Enter x3: ");
        int x3 = scanValidInt();

        System.out.print("Enter y3: ");
        int y3 = scanValidInt();

        //Now we know that the inputs are vaild integers. The computing will start from here.
        //Compute the distances between the points 
        double distance1 = Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
        double distance2 = Math.sqrt((x3 - x2) * (x3 - x2) + (y3 - y2) * (y3 - y2));
        double distance3 = Math.sqrt((x1 - x3) * (x1 - x3) + (y1 - y3) * (y1 - y3));

        //checks if the points make a vaild triangle.
        if (distance1 + distance2 > distance3 && distance2 + distance3 > distance1
                && distance3 + distance1 > distance2) {
            double angle1 = Math.round(getAngle(distance3, distance1, distance2) * 100) / 100.0; // getAngle will be defined later
            double angle2 = Math.round(getAngle(distance1, distance2, distance3) * 100) / 100.0;
            double angle3 = Math.round(getAngle(distance2, distance3, distance1) * 100) / 100.0;

            double angleMax = Math.max(angle1, Math.max(angle2, angle3));

            System.out.println(); //just for better result view.

            if (angleMax > 90) {
                System.out.println("The triangle has an obtuse angle.");
            } else if (angleMax < 90) {
                System.out.println("The triangle has acute angles only.");
            } else {
                System.out.println("The triangle a right angle.");
            }
        } else {
            System.out.println("\nThese points do not form a vaild a triangle");
        }

    }

    /**
     * checks if the input is valid int, otherwise, it terminates the program.
     *
     * @return int the scanned integer
     */
    public static int scanValidInt() {
        if (in.hasNextInt()) {
            return in.nextInt();
        } else {
            System.out.println("Invalid input");
            System.exit(0);
        }
        return 0;
    }

    /**
     * find the angle using cosin law
     *
     * @param distance1 the first distance
     * @param distance2 the secoond distance
     * @param distance3 the third distance
     * @return angle the angle between distance2 and distance3
     */
    public static double getAngle(double distance1, double distance2, double distance3) {
        double angle = Math.toDegrees(Math.acos((Math.pow(distance1, 2) + Math.pow(distance2, 2) - Math.pow(distance3, 2)) / (2 * distance1 * distance2))
        );
        return angle;
    }

}
