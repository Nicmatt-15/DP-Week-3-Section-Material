import java.awt.*;

public class Stairs {
    public static void main(String[] args) {
        DrawingPanel canvas = new DrawingPanel(700, 700);
        canvas.setBackground(Color.GRAY);

        Graphics brush = canvas.getGraphics();

        // Draws to rows in two different places
        drawRow(brush, 50, 50, 20, Color.MAGENTA, Color.YELLOW);
        drawRow(brush, 275, 370, 40, Color.MAGENTA, Color.YELLOW);

        // Draws a "grid" of rows
        drawGrid(brush, 300, 50, 45);
    }

    /**
     * Draws a single row of stairs made out of 8 squares.
     *
     * Implementation detail:
     * This method will draw the squares in pair. In other words, instead
     * of drawing 1 square at a time for 8 times, it will print out 2 squares at a
     * time for 4 times.
     *
     * Compared to the BabyStairs.java, this method has been parameterized even
     * further
     * to allow us to customize the color of the first and second square of each
     * pair.
     *
     * @param brush        - pass in the Graphics object to draw the square
     * @param startingX    - pass in the starting x coordinate of the first square
     *                     of the row
     * @param startingY    - pass in the starting y coordinate of the first square
     *                     of the row
     * @param size         - pass in the size (width and height) of each square in
     *                     the row
     * @param firstSquare  - pass in the Color for the first square of each pair
     * @param secondSquare - pass in the Color for the second square of each pair
     */
    public static void drawRow(Graphics brush, int startingX, int startingY, int size, Color firstSquare,
            Color secondSquare) {
        for (int i = 1; i <= 4; i++) {
            brush.setColor(firstSquare);
            brush.fillOval(startingX, startingY, size, size);

            startingX += size;
            startingY += size;

            brush.setColor(secondSquare);
            brush.fillOval(startingX, startingY, size, size);

            startingX += size;
            startingY += size;
        }
    }

    /**
     * Draws a grid of "rows" by calling the drawRow() method.
     *
     * Implementation details:
     * This method will draw 4 rows of stairs. However, it will print them in pairs.
     * In other words, instead of printing 1 rows at a time for 4 times, it will
     * print 2 rows at a time for 2 times.
     *
     * The main reason why we draw 2 row at a time is to make it easier for us
     * to alternate between the Magenta-Yellow pattern for the odd row and the
     * Yellow-Magenta pattern for the even row.
     *
     * @param brush     - pass in the Graphics object from main -> drawGrid ->
     *                  drawRow
     * @param startingX - pass in the starting x coordinate of the first row of
     *                  the grid
     * @param startingY - pass in the starting y coordinate of the first row of
     *                  the grid
     * @param size      - pass in the size (width and height) of each square in the
     *                  grid
     */
    public static void drawGrid(Graphics brush, int startingX, int startingY, int size) {
        for (int i = 1; i <= 2; i++) {
            // Draws the first row of the pair
            drawRow(brush, startingX, startingY, size, Color.MAGENTA, Color.YELLOW);

            // Updates the starting y coordinate prior to drawing the second
            // row of the pair
            startingY += size;

            // Draws the second row of the pair
            drawRow(brush, startingX, startingY, size, Color.YELLOW, Color.MAGENTA);

            // Updates the starting y coordinate prior to drawing the first
            // row of the next pair
            startingY += size;
        }
    }
}