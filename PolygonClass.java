import java.awt.*;

/**
 * A polygon that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2019.09.18 - Updated by Galesi / Tan
 */

public class PolygonClass
{
    boolean isVisible;
    int[] xValues;
    int[] yValues;
    int numSides;
    String color;

    /**
     * Create a new polygon at a specified position.
     * 
     * @param numSides the number of sides of the polygon. 
     * @param xValues an array of x values for each point on the polygon.
     * Use int[] {x1, x2, x3, etc...} to enter the values.
     * @param yValues an array of y values for each point on the polygon.
     * Use int[] {y1, y2, y3, etc...} to enter the values.
     * @param color a String color value for the polygon.
     * 
     */
    public PolygonClass(int numSides, int[] xValues, int[] yValues, String color)
    {
        this.numSides = numSides;
        this.xValues = xValues;
        this.yValues = yValues;
        this.color = color;
        isVisible = true;
        this.draw();
    }

    /**
     * Make this polygon visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }

    /**
     * Make this polygon invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }

    /**
     * Move the polygon 20 pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the polygon 20 pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the polygon 20 pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the polygon 20 pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the polygon horizontally by 'distance' pixels.
     * 
     * @param distance the distance translated, in pixels.
     * 
     */
    public void moveHorizontal(int distance)
    {
        erase();
        for (int i = 0; i < xValues.length; i++)
        {
            xValues[i] += distance;
        }
        draw();
    }

    /**
     * Move the polygon vertically by 'distance' pixels.
     * 
     * @param distance the distance translated, in pixels.
     * 
     */
    public void moveVertical(int distance)
    {
        
        for (int i = 0; i < yValues.length; i++)
        {
            erase();
            yValues[i] += distance;
        }

        draw();
    }

    /**
     * Slowly move the polygon horizontally by 'distance' pixels.
     * 
     * @param distance the distance translated, in pixels.
     * 
     */
    public void slowMoveHorizontal(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            for (int j = 0; j < xValues.length; j++)
            {
                xValues[j] += delta;
            }
            draw();
        }
    }

    /**
     * Slowly move the polygon vertically by 'distance' pixels.
     * 
     * @param distance the distance translated, in pixels.
     * 
     */
    public void slowMoveVertical(int distance)
    {
        int delta;

        if(distance < 0) 
        {
            delta = -1;
            distance = -distance;
        }
        else 
        {
            delta = 1;
        }

        for(int i = 0; i < distance; i++)
        {
            for (int j = 0; j < yValues.length; j++)
            {
                yValues[j] += delta;
            }
            draw();
        }
    }

    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     * 
     * @param newColor the new color of the ellipse. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     * 
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /**
     * Draw the polygon with current specifications on screen.
     */
    private void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color, new Polygon(xValues, yValues, numSides));
            canvas.wait(10);
        }
    }

    /**
     * Erase the polygon on screen.
     */
    public void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
