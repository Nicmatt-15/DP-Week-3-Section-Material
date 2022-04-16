public class CafeWall {
    // The MORTAR class constant dictates the space
    // between one row and another when drawing a grid of rows
    public static final int MORTAR = 2;

    public static void main(String[] args) {
        // Do some DrawingPanel set up here

        // Draw the first row (first call to the method you use to draw the row)

        // draw the second row (second call to the method you use to draw the row)

        // Draw the first grid (first call to the method you use to draw the grid)

        // Draw the second grid (second call to the method you use to draw the grid)

        // Draw the third grid (third call to the method you use to draw the grid)

        // Draw the fourth grid (fourth call to the method you use to draw the grid)
    }

    // This method will be used to draw a row of black and white squares
    // This method will take a total of 5 parameters
    public static void<methodNameHere>(<parameters here>) {
        // Loop as much as how many pairs of squares needed to be drawn
        // for each iteration:
            // draw the black square

            // draw the blue X
            // (don't change the starting x and y coordinate before drawing the blueX)

            // change the starting x and y coordinate before drawing the white box

            // draw the white box

            // change hte starting x and y coordinate after drawing the white box
    }

    // This method will be used to draw a grid of rows
    // This method will take a total of 6 parameters
    public static void<methodNameHere>(<parameters here>) {
        // loop as much as how many pairs of lines needed to be drawn
        // for each iteration:
            // draw the first row of the pair

            // update the starting y coordinate before drawing the second row of the pair
            // make sure to incorporate the MORTAR when updating the starting y coordinate

            // draw the second row of the pair
            // make sure to incorporate the offset when drawing the second row of the pair

            // update the starting y coordinate before repeating the loop and drawing the next pairs of line
            // make sure to incorporate the MORTAR when updating the starting y coordinate
    }
}
