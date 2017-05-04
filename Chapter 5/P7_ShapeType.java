/*
Write a program that reads in the x- and y-coordinates of four corner points of a
quadrilateral and prints out whether it is a square, a rectangle, a trapezoid, a rhombus,
or none of those shapes.

PS : still under maintenece ...
*/

/**
 *
 * @author Waleed Mortaja,
 *contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 */

import java.util.Scanner;

public class P7_ShapeType {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter x1: ");
        int x1 = in.nextInt();
        System.out.print("Enter y1: ");
        int y1 = in.nextInt();

        System.out.print("Enter x2: ");
        int x2 = in.nextInt();
        System.out.print("Enter y2: ");
        int y2 = in.nextInt();

        System.out.print("Enter x3: ");
        int x3 = in.nextInt();
        System.out.print("Enter y3: ");
        int y3 = in.nextInt();

        System.out.print("Enter x4: ");
        int x4 = in.nextInt();
        System.out.print("Enter y4: ");
        int y4 = in.nextInt();

        if (x1 == x3 && y1 == y2 && x2 - x1 == x4 - x3 && y3 - y1 == y4 - y2 && x2-x1==y3-y1) {
            System.out.println("Square");
        }
        else if (x1 == x3 && y1 == y2 && x2 - x1 == x4 - x3 && y3 - y1 == y4 - y2) {
            System.out.println("Rectangle");
        }
        
        else if (x2 - x1 == x4 - x3 && y3 - y1 == y4 - y2) {
            System.out.println("متوازي أضلاع");
            
        }    
        else { System.out.println("شكل غير الأشكال المطلوبة");}
        
        
    }
}
