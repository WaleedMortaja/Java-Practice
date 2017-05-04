/*
P2.4 The intersection method computes the intersection of two rectangles—that is, the
rectangle that would be formed by two overlapping rectangles if they were drawn, as
shown at right.
You call this method as follows:
Rectangle r3 = r1.intersection(r2);
Write a program IntersectionPrinter that constructs two
rectangle objects, prints them as described in Exercise P2.1,
and then prints the rectangle object that describes the
intersection. Then the program should print the result of the
intersection method when the rectangles do not overlap.
Add a comment to your program that explains how you can
tell whether the resulting rectangle is empty.
*/

/**
 * @author Waleed Mortaja, contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 */

import java.awt.Rectangle;

public class P4_RectangleIntersectionPrinter {

    public static void main(String[] args) {
        System.out.println("When the Rectangles are overlapping :\n");
        Rectangle r1 = new Rectangle(10, 10, 15, 15);
        Rectangle r2 = new Rectangle(12, 12, 20, 20);
        System.out.println(r1);
        System.out.println(r2);
        Rectangle r3 = r1.intersection(r2);
        System.out.println("\nthe intersection is the regtangle : \n" + r3);
        System.out.println();
        System.out.println();

        System.out.println("When the Rectangles are NOT overlapping : \n");

        //Change the position of r2
        
        r2.translate(18, 18);
        System.out.println(r1);
        System.out.println(r2);

        r3 = r1.intersection(r2);
        System.out.println("\nthe intersection is the regtangle : \n" + r3);

        /*
            if either the width or height of the intersection rectangle made from two rectangles is NEGATIVE,
            then the two regtangles are NOT overlapping.
        
         */
        
        if (r3.getWidth() < 0 || r3.getHeight() < 0) {
            System.out.println("\nThe Rectangles are NOT overlapping");
        }
        
        /*
            if either the width or height of the intersection rectangle made from two rectangles is NEGATIVE,
            then the two regtangles are NOT overlapping.
        
         */
        
        System.out.println("\n\nWe can notice that if either the width or height of the intersection rectangle made from the two rectangles is NEGATIVE.\nThen,the two regtangles are NOT overlapping.\n");
    }
}
