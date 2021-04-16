;
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kšlling and David J. Barnes
 * @version 2019.09.18 - Updated by Galesi / Tan
 */
public class Picture
{
    private Rect sky;
    private Circle sun;
    private Rect grass;
    private IsoscelesTriangle grassOne;
    private IsoscelesTriangle grassTwo;
    private IsoscelesTriangle grassThree;
    private IsoscelesTriangle grassFour;
    private IsoscelesTriangle grassFive;
    private IsoscelesTriangle grassSix;
    private IsoscelesTriangle grassSeven;
    private IsoscelesTriangle grassEight;
    private IsoscelesTriangle grassNine;
    private IsoscelesTriangle grassTen;
    private IsoscelesTriangle grassEleven;
    private Circle body;
    private Circle face;
    private IsoscelesTriangle leftFang;
    private IsoscelesTriangle rightFang;
    private Ellipse leftEye;
    private Ellipse rightEye;
    private Circle nose;
    private Ellipse leftNostril;
    private Ellipse rightNostril;
    private Ellipse leftFoot;
    private Ellipse rightFoot;
    private Ellipse leftSquint;
    private Ellipse rightSquint;
    private Ellipse leftSmallSquint;
    private Ellipse rightSmallSquint;
    private PolygonClass love;
    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        draw();
    }

    /**
     * Draws Hedgehog and background - Contains all drawn components
     */
    public void draw()
    {
        sky = new Rect(0, 0, 500, 200, "light blue");
        sun = new Circle(250, 150, 200, "yellow");
        grass = new Rect(0, 200, 500, 100, "green");
        grassOne = new IsoscelesTriangle(0, 180, 20, 50, "green");
        grassTwo = new IsoscelesTriangle(50, 180, 20, 50, "green");
        grassThree = new IsoscelesTriangle(100, 180, 20, 50, "green");
        grassFour = new IsoscelesTriangle(150, 180, 20, 50, "green");
        grassFive = new IsoscelesTriangle(200, 180, 20, 50, "green");
        grassSix = new IsoscelesTriangle(250, 180, 20, 50, "green");
        grassSeven = new IsoscelesTriangle(300, 180, 20, 50, "green");
        grassEight = new IsoscelesTriangle(350, 180, 20, 50, "green");
        grassNine = new IsoscelesTriangle(400, 180, 20, 50, "green");
        grassTen = new IsoscelesTriangle(450, 180, 20, 50, "green");
        grassEleven = new IsoscelesTriangle(500, 180, 20, 50, "green");
        body = new Circle(250, 150, 100, "brown");        
        face = new Circle(250, 180, 70, "peach");
        leftFang = new IsoscelesTriangle(240, 230, -15, 10, "peach");
        rightFang = new IsoscelesTriangle(260, 230, -15, 10, "peach");
        nose = new Circle(250, 200, 10, "black");
        leftNostril = new Ellipse(245, 200, 3, 5, "gray");
        rightNostril = new Ellipse(255, 200, 3, 5, "gray");
        leftFoot = new Ellipse(175, 250, 40, 20, "peach");
        rightFoot = new Ellipse(305, 250, 40, 20, "peach");
        leftEye = new Ellipse(230, 160, 10, 25, "black");
        rightEye = new Ellipse(280, 160, 10, 25, "black");
        rightSquint = new Ellipse(275, 165, 10, 15, "black");
        leftSquint = new Ellipse(225, 165, 10, 15, "black");
        rightSmallSquint = new Ellipse (270, 170, 10, 5, "black");
        leftSmallSquint = new Ellipse (220, 170, 10, 5, "black");
        love = new PolygonClass (8, new int[]
        {400, 410, 410, 405, 400, 395, 390, 390},
        new int[] {120, 110, 100, 100, 105, 100, 100, 110}, "yellow");
    }

    /**
     * Draws Hedgehog and background - Contains originally drawn components
     */
    public void setOriginalColor()
    {
        sky.changeColor("light blue");
        love.changeColor("yellow");
        sun.changeColor("yellow");
        grass.changeColor("green");
        grassOne.changeColor("green");
        grassTwo.changeColor("green");
        grassThree.changeColor("green");
        grassFour.changeColor("green");
        grassFive.changeColor("green");
        grassSix.changeColor("green");
        grassSeven.changeColor("green");
        grassEight.changeColor("green");
        grassNine.changeColor("green");
        grassTen.changeColor("green");
        grassEleven.changeColor("green");
        body.changeColor("brown");
        face.changeColor("peach");
        leftFang.changeColor("peach");
        rightFang.changeColor("peach");
        leftEye.changeColor("black");
        rightEye.changeColor("black");
        leftSquint.changeColor("black");
        rightSquint.changeColor("black");
        leftSmallSquint.changeColor("black");
        rightSmallSquint.changeColor("black");
        nose.changeColor("black");
        leftNostril.changeColor("gray");
        rightNostril.changeColor("gray");
        leftFoot.changeColor("peach");
        rightFoot.changeColor("peach");
    }

    /**
     * Draws Hedgehog and background - Contains black and white drawn components
     */
    public void setBlackAndWhite()
    {
        sky.changeColor("light gray");
        love.changeColor("very light gray");
        sun.changeColor("very light gray");
        grass.changeColor("dark gray");
        grassOne.changeColor("dark gray");
        grassTwo.changeColor("dark gray");
        grassThree.changeColor("dark gray");
        grassFour.changeColor("dark gray");
        grassFive.changeColor("dark gray");
        grassSix.changeColor("dark gray");
        grassSeven.changeColor("dark gray");
        grassEight.changeColor("dark gray");
        grassNine.changeColor("dark gray");
        grassTen.changeColor("dark gray");
        grassEleven.changeColor("dark gray");
        body.changeColor("very dark gray");
        face.changeColor("gray");
        leftFang.changeColor("gray");
        rightFang.changeColor("gray");
        leftEye.changeColor("black");
        rightEye.changeColor("black");
        leftSquint.changeColor("black");
        rightSquint.changeColor("black");
        leftSmallSquint.changeColor("black");
        rightSmallSquint.changeColor("black");
        nose.changeColor("black");
        leftNostril.changeColor("gray");
        rightNostril.changeColor("gray");
        leftFoot.changeColor("gray");
        rightFoot.changeColor("gray");
    }

    /**
     * Draws Hedgehog and background - Contains different colored drawn components
     */
    public void setFunnyColor()
    {
        sky.changeColor("light blue");
        love.changeColor("yellow");
        sun.changeColor("yellow");
        grass.changeColor("green");
        grassOne.changeColor("green");
        grassTwo.changeColor("green");
        grassThree.changeColor("green");
        grassFour.changeColor("green");
        grassFive.changeColor("green");
        grassSix.changeColor("green");
        grassSeven.changeColor("green");
        grassEight.changeColor("green");
        grassNine.changeColor("green");
        grassTen.changeColor("green");
        grassEleven.changeColor("green");
        body.changeColor("magenta");
        face.changeColor("peach");
        leftFang.changeColor("white");
        rightFang.changeColor("white");
        leftEye.changeColor("red");
        rightEye.changeColor("red");
        leftSquint.changeColor("red");
        rightSquint.changeColor("red");
        leftSmallSquint.changeColor("red");
        rightSmallSquint.changeColor("red");
        nose.changeColor("black");
        leftNostril.changeColor("gray");
        rightNostril.changeColor("gray");
        leftFoot.changeColor("peach");
        rightFoot.changeColor("peach");
    }

    /**
     * This action makes the sun disappear and the sky turn darker.
     */
    public void action1()
    {
        sun.erase();
        sky.changeColor("blue");
        love.changeColor("blue");
        grass.changeColor("green");
        grassOne.changeColor("green");
        grassTwo.changeColor("green");
        grassThree.changeColor("green");
        grassFour.changeColor("green");
        grassFive.changeColor("green");
        grassSix.changeColor("green");
        grassSeven.changeColor("green");
        grassEight.changeColor("green");
        grassNine.changeColor("green");
        grassTen.changeColor("green");
        grassEleven.changeColor("green");
        body.changeColor("brown");
        face.changeColor("peach");
        leftFang.changeColor("peach");
        rightFang.changeColor("peach");
        leftEye.changeColor("black");
        rightEye.changeColor("black");
        leftSquint.changeColor("black");
        rightSquint.changeColor("black");
        leftSmallSquint.changeColor("black");
        rightSmallSquint.changeColor("black");
        nose.changeColor("black");
        leftNostril.changeColor("gray");
        rightNostril.changeColor("gray");
        leftFoot.changeColor("peach");
        rightFoot.changeColor("peach");
    }

    /**
     * Because it is night, the hedgehog is blinking tiredly
     */
    public void action2()
    {
        leftEye.makeInvisible();
        rightEye.makeInvisible();
        Canvas.wait(250);
        leftSquint.makeInvisible();
        rightSquint.makeInvisible();
        Canvas.wait(250);
        leftSquint.makeVisible();
        rightSquint.makeVisible();
        Canvas.wait(250);
        leftEye.makeVisible();
        rightEye.makeVisible();
        Canvas.wait(250);
        leftEye.makeInvisible();
        rightEye.makeInvisible();
        Canvas.wait(250);
        leftSquint.makeInvisible();
        rightSquint.makeInvisible();
        Canvas.wait(250);
        leftSquint.makeVisible();
        rightSquint.makeVisible();
        Canvas.wait(250);
        leftEye.makeVisible();
        rightEye.makeVisible();
        Canvas.wait(250);
        leftEye.makeInvisible();
        rightEye.makeInvisible();
        Canvas.wait(250);
        leftSquint.makeInvisible();
        rightSquint.makeInvisible();
    }

    /**
     * Because the hedgehog is being so cute, it is given love
     */
    public void action3()
    {
        love.changeColor("red");
        Canvas.wait(75);
        love.moveDown();
        Canvas.wait(75);
        love.moveDown();
        Canvas.wait(75);
        love.moveDown();
        Canvas.wait(75);
        love.moveDown();
        Canvas.wait(75);
        love.moveDown();
        Canvas.wait(75);
        love.moveLeft();
        Canvas.wait(75);
        love.moveLeft();
        Canvas.wait(75);
        love.moveUp();
        Canvas.wait(75);
        love.moveUp();
        Canvas.wait(75);
        love.moveUp();
    }
    
    //Method erases all current components and redraws them
    public void reset()
    {
        sky.erase();
        love.erase();
        sun.erase();
        grass.erase();
        grassOne.erase();
        grassTwo.erase();
        grassThree.erase();
        grassFour.erase();
        grassFive.erase();
        grassSix.erase();
        grassSeven.erase();
        grassEight.erase();
        grassNine.erase();
        grassTen.erase();
        grassEleven.erase();
        body.erase();
        face.erase();
        leftFang.erase();
        rightFang.erase();
        leftEye.erase();
        rightEye.erase();
        leftSquint.erase();
        rightSquint.erase();
        leftSmallSquint.erase();
        rightSmallSquint.erase();
        nose.erase();
        leftNostril.erase();
        rightNostril.erase();
        leftFoot.erase();
        rightFoot.erase();
        draw();
    }

}
