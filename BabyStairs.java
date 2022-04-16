import java.awt.*;

public class BabyStairs {
    public static void main(String[] args) {
        // Declare a drawing panel -> canvas / whiteboard
        DrawingPanel canvas = new DrawingPanel(700, 700);

        // Set the background color of your "canvas" here
        // Color.<your color here in all caps>
        canvas.setBackground(Color.GRAY);

        // Get the "brush" for the "canvas"
        Graphics brush = canvas.getGraphics();

        // Draws the first row
        drawRow(50, 50, 20, brush);

        // Draws the second row
        // drawRow(275, 370, 40, brush);
    }

    /**
     * Draws a single row of stairs with alternating color between
     * Magenta and Yellow.
     *
     * Implementation details:
     * Each row consists of 4 pairs of Magenta and Yellow square.
     *
     * Drawing two squares at a time makes it easier to draw them with alternating
     * color.
     *
     * Notes to reader:
     * Parameter here is used so that the method can be re-used to draw multiple
     * rows with slightly different details (starting coordinate, size, etc)
     *
     * Any value that needs to be changed from one row to another will be made
     * as a parameter.
     *
     * It might seem strange that you have to pass in the "brush", but you
     * don't need to pass in the Canvas. Don't think too much about it :)
     *
     * @param startingX - pass in the starting x coordinate of the row
     * @param startingY - pass in the starting y coordinate of the row
     * @param size      - pass in the size (width and height) of each square
     * @param brush     - pass in the Graphics object to draw the squares
     */
    public static void drawRow(int startingX, int startingY, int size, Graphics brush) {
        for (int i = 1; i <= 4; i++) {
            // Set the color of the brush to Magenta
            // prior to drawing the first square of the pair
            brush.setColor(Color.MAGENTA);

            // Draw the first square of the pair
            System.out.println("This is pair number " + i);
            System.out.println("Prior to drawing the first square, the value of starting x is " + startingX);
            System.out.println("Prior to drawing the first square, the value of starting y is " + startingY);
            brush.fillRect(startingX, startingY, size, size);

            // After drawing the first pair of the square,
            // update the starting x coordinate and the starting y
            // coordinate prior to drawing the second square of the pair
            startingX = startingX + size;
            startingY = startingY + size;

            // Set the brush color to yellow
            // prior to drawing the second square of the pair
            brush.setColor(Color.YELLOW);

            // Draw the first square of the pair
            System.out.println("Prior to drawing the second square, the value of starting x is " + startingX);
            System.out.println("Prior to drawing the second square, the value of starting y is " + startingY);
            brush.fillRect(startingX, startingY, size, size);

            // After drawing the second pair of the square,
            // update the starting x coordinate and the starting y
            // coordinate prior to drawing the first square of the next pair
            startingX = startingX + size;
            startingY = startingY + size;
        }
    }

}