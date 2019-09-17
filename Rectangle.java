import apcslib.*;
/**
 * Write a description of class Rectangle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Rectangle
{
    // instance variables - replace the example below with your own
  
    private double myX;
    private double myY;
    private double myWidth;
    private double myHeight;
    private double perimeter;
    private double area;
    private static SketchPad paper = new SketchPad(500, 500);
    private DrawingTool pencil = new DrawingTool(paper);
    
    public Rectangle()
    {
        myX = 0;
        myY = 0;
        myWidth = 3;
        myHeight = 5;
        
    }
    
    public Rectangle(double initialX, double initialY, double initialWidth, double initialHeight)
    {
        myX = initialX;
        myY = initialY;
        myWidth = initialWidth; 
        myHeight = initialHeight;
    }
    
    public double getPerimeter()
    {
        //myWidth = 100;
        //myHeight = 200;
        perimeter = (2*(myWidth + myHeight));
        //perimeter = 20;
        return perimeter;
    }
    
    public double getArea()
    {
        return (myWidth * myHeight);
    }
    
    public void draw()
    {

        
        
        
        pencil.up ();
        pencil.forward(myY*0.5);
        pencil.turnRight(90);
        pencil.down();
        pencil.forward(myWidth*0.5);
        pencil.turnRight(90);
        pencil.forward(myHeight);
        pencil.turnRight(90);
        pencil.forward(myWidth);
        pencil.turnRight(90);
        pencil.forward(myHeight);
        pencil.turnRight(90);
        pencil.forward(myWidth*0.5);
    }
    public void drawtwo()
    {
        pencil.turnRight(90);
        pencil.forward(myWidth*0.5);
        pencil.turnRight(90);
        pencil.forward(myHeight);
        pencil.turnRight(90);
        pencil.forward(myWidth);
        pencil.turnRight(90);
        pencil.forward(myHeight);
        pencil.turnRight(90);
        pencil.forward(myWidth*0.5);
    }
    public void drawthree()
    {
        pencil.up();
        pencil.forward(myHeight*0.5);
        pencil.down();
        pencil.turnRight(90);
        pencil.forward(0.5*myWidth);
        pencil.turnRight(90);
        pencil.forward(myHeight);
        pencil.turnRight(90);
        pencil.forward(myWidth);
        pencil.turnRight(90);
        pencil.forward(myHeight);
        pencil.turnRight(90);
        pencil.forward(0.5*myWidth);
    }
}
