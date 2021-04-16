import java.awt.*;

/**
 * A rectangle that can be manipulated and that draws itself on a canvas.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2019.09.18 - Updated by Galesi / Tan
 */

public class Rect
{
    private int length, width;
    private int xPosition;
    private int yPosition;
    private String color;
    private boolean isVisible;

    /**
     * Create a new square at default position with default color.
     * 
     * @param topLeftX the x coordinate of the top left pixel of the rectangle.
     * @param topLeftY the y coordinate of the top left pixel of the rectangle.
     * @param length the length of the rectangle in pixels.
     * @param width the width of the rectangle in pixels.
     * @param color the color of the rectangle.     
     * 
     */
    public Rect(int topLeftX, int topLeftY, int length, int width, String color)
    {
        this.length = length;
        this.width = width;
        this.xPosition = topLeftX;
        this.yPosition = topLeftY;
        this.color = color;
        this.isVisible = true;
        this.makeVisible();
    }

    /**
     * Make this square visible. If it was already visible, do nothing.
     */
    public void makeVisible()
    {
        isVisible = true;
        draw();
    }
    
    /**
     * Make this square invisible. If it was already invisible, do nothing.
     */
    public void makeInvisible()
    {
        erase();
        isVisible = false;
    }
    
    /**
     * Move the rectangle 20 pixels to the right.
     */
    public void moveRight()
    {
        moveHorizontal(20);
    }

    /**
     * Move the rectangle 20 pixels to the left.
     */
    public void moveLeft()
    {
        moveHorizontal(-20);
    }

    /**
     * Move the rectangle 20 pixels up.
     */
    public void moveUp()
    {
        moveVertical(-20);
    }

    /**
     * Move the rectangle 20 pixels down.
     */
    public void moveDown()
    {
        moveVertical(20);
    }

    /**
     * Move the rectangle horizontally by 'distance' pixels.
     * 
     * @param distance the distance translated, in pixels.
     * 
     */
    public void moveHorizontal(int distance)
    {
        erase();
        xPosition += distance;
        draw();
    }

    /**
     * Move the rectangle vertically by 'distance' pixels.
     * 
     * @param distance the distance translated, in pixels.
     * 
     */
    public void moveVertical(int distance)
    {
        erase();
        yPosition += distance;
        draw();
    }

    /**
     * Slowly move the rectangle horizontally by 'distance' pixels.
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
            xPosition += delta;
            draw();
        }
    }

    /**
     * Slowly move the rectangle vertically by 'distance' pixels.
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
            yPosition += delta;
            draw();
        }
    }

    /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     * 
     * @param newLength the new width of the rectangle.
     * 
     */
    public void changeLength(int newLength)
    {
        erase();
        length = newLength;
        draw();
    }

     /**
     * Change the size to the new size (in pixels). Size must be >= 0.
     * 
     * @param newWidth the new width of the rectangle.
     * 
     */
    public void changeWidth(int newWidth)
    {
        erase();
        width = newWidth;
        draw();
    }
    
    /**
     * Change the color. Valid colors are "red", "yellow", "blue", "green",
     * "magenta" and "black".
     * 
     * @param newColor the new color to make the rectangle.
     * 
     */
    public void changeColor(String newColor)
    {
        color = newColor;
        draw();
    }

    /**
     * Draw the rectangle with current specifications on screen.
     */
    public void draw()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.draw(this, color,
                        new Rectangle(xPosition, yPosition, length, width));
            canvas.wait(10);
        }
    }

    /**
     * Erase the rectangle on screen.
     */
    public void erase()
    {
        if(isVisible) {
            Canvas canvas = Canvas.getCanvas();
            canvas.erase(this);
        }
    }
}
