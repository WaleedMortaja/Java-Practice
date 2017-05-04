/*
E2.9 In the Java library, a color is specified by its red, green, and blue components
between 0 and 255 (see Table 4 on page 66). Write a program BrighterDemo that
constructs a Color object with red, green, and blue values of 50, 100, and 150. Then
apply the brighter method of the Color class and print the red, green, and blue values
of the resulting color. (You won’t actually see the color—see Exercise E2.10 on how
to display the color.)

E2.10 : display your code
*/

/**
 * @author Waleed Mortaja, contact Email : <a href="mailto:waleed.mortaja@gmail.com">waleed.mortaja@gmail.com</a>
 */

import java.awt.Color;
import javax.swing.JFrame;

public class E10_BrighterDemo {

    public static void main(String[] args) {
        JFrame frame = new JFrame(); // Make new object from Jframe class which will be the work area for our color
        frame.setSize(200, 200);  // Set frame size (by default, frame size equals (0,0) which is a point
        Color myColor = new Color(50, 100, 150);  // Define new Color with 50 degree for red and 100 for green and 150 for blue
        myColor = myColor.brighter(); // This function makes the color brighter, as required in the code in E 2.9
        frame.getContentPane().setBackground(myColor); // Set the background of the frame as the color we previously defined
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  // Close the program if the frame closed
        frame.setVisible(true);  // frame is hidden by default, so you have to make it visible using this code
    }
}
