
/**
 * A runner that includes a main method to run the package.
 * 
 * @author  Galesi / Tan
 * @version 2019.09.18 
 */

public class ActionRunner
{
    
    public static void waitTime(int x) //x is in milliseconds. One thousand milliseconds is a second.
    {
        try 
        {
            Thread.sleep(x);
        } 
        catch(InterruptedException ex) 
        {
            Thread.currentThread().interrupt();
        }
    }

    public static void main(String[] args)
    {
        Picture pic = new Picture();

        waitTime(500);
        pic.setBlackAndWhite();
        waitTime(500);
        pic.setFunnyColor();
        waitTime(500);
        pic.setOriginalColor();
        waitTime(500);

        pic.action1();
        waitTime(500);

        pic.action2();
        waitTime(1000);

        pic.action3();
        waitTime(1000);

    }
}
