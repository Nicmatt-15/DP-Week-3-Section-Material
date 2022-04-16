## How to Use Drawing Panel

1. If you are working on your computer using Jgrasp (or other IDE), don't forget to add `DrawingPanel.java` into the <u>**same**</u> folder as your Java code.

   To add `DrawingPanel.java`:

   1. Click [this website](http://www.buildingjavaprograms.com/drawingpanel/DrawingPanel.java).
   2. Copy all the code
   3. Make a new file in the folder you are currently workin in.
   4. Paste the file
   5. Save the file as `DrawingPanel.java`
   6. Compile `DrawingPanel.java`

2. In your main method, declare a new DrawingPanel object. The code template for this is:

   ```java
   DrawingPanel yourCanvasName = new DrawingPanel(<width>, <height>);
   ```

   > You can think about this variable as the canvas that you will draw on.

3. After setting up your "canvas", you want to set up the background color of your "canvas". The code template for this is:

   ```java
   yourCanvasName.setBackground(Color.<SOME_COLOR_HERE>);
   ```

   > If you are working in your IDE, make sure that you have the code `import java.awt.*` before `public class ... {}`.

4. After you create a DrawingPanel object, you should get the "paint brush" associated to your DrawingPanel. The code template for this is:

   ```java
   Graphics yourBrushName = yourCanvasName.getGraphics();
   ```

5. Set the Color of your brush before you start drawing any figure. The code template to do this is:

   ```java
   yourBrushName.setColor(Color.<SOME_COLOR_HERE>)
   ```

6. Start drawing your shapes. Here are the options:

   - To draw a square without any filling color, the code template is:

     ```java
     yourBrushName.drawRect(<xStartingCoordinate, yStartingCoordinate>, <width>, <height>);
     ```

   - To draw a square with filling color, the code template is:

     ```java
     yourBrushName.fillRect(<xStartingCoordinate, yStartingCoordinate>, <width>, <height>);
     ```

   - To draw a line, the code template is:

     ```java
     yourBrushName.drawLine(<xStartingCoordinate, yStartingCoordinate>, <xEndingCoordinate>, <yEndingCoordinate>);
     ```

7. Repeat step 5 & 6 as needed.

   > Remember to change your "brush" (Graphics) color prior to drawing another figure if they are of a different color!

---

## Today's Drawing:

![Image](/Stairs.png)

Single layer stairs:

1. Starting x: 50 and 275
2. Starting y: 50 and 370
3. Size: 20 and 40
4. Color: Magenta and Yellow

Multi layer stairs:

1. Starting x: 300
2. Starting y: 50
3. Size: 45
4. Color:
   - Row 1 and 3 -> Magenta, Yellow
   - Row 2 and 4 -> Yellow, Magenta (flipped)

> Code from Section: [BabyStairs.java](/BabyStairs.java)

> Code for Extra Section: [Stairs.java](/Stairs.java)
