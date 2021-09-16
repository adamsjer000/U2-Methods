import javax.swing.*;
import java.text.DecimalFormat;

public class TrianglePerimeter {

    /*
    Create a program which when given three coordinates of a triangle, calculates the perimeter.

    (2,3) , (5, 7) , (-2, 8) -> 18.47

    Program should round to 2 decimals and include two methods,
    one for returning the distance between two points and another
    for calculating the perimeter of a triangle.
     */

    /* THE PLAN

        1. Get the inputs - x1, y1, x2, y2, x3, y3
        2. Calculate the distance - 1 -> 2, 2 -> 3, 3 -> 1
        3. Calculate Perimeter - side1 + side2 + side3
        4. display results/output

    */

    public static void main(String[] args) {

        int x1 = getInput("Point 1, x: ");
        int y1 = getInput("Point 1, y: ");

        int x2 = getInput("Point 2, x: ");
        int y2 = getInput("Point 2, y: ");

        int x3 = getInput("Point 3, x: ");
        int y3 = getInput("Point 3, y: ");

        double distance1 = distance(x1, y1, x2, y2);
        double distance2 = distance(x2, y2, x3, y3);
        double distance3 = distance(x1, y1, x3, y3);

        double perimeter = perimeter(distance1, distance2, distance3);

        output(perimeter);
    }

    public static int getInput(String prompt){

        return Integer.parseInt(JOptionPane.showInputDialog(prompt));
    }

    public static double distance(int x1, int y1, int x2, int y2){

        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2-y1, 2));
    }

    public static double perimeter(double side1, double side2, double side3){

        return side1 + side2 + side3;
    }

    public static void output(double perimeter){
        DecimalFormat round = new DecimalFormat("#,###.00");
        JOptionPane.showMessageDialog(null, "The perimeter is " + perimeter);
    }
}
