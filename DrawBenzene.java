import apcslib.*;
import java.awt.Color;
/**
 * Write a description of class DrawBenzene here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DrawBenzene
{    public static void drawCircle (String[] args)
    {
    
    DrawingTool pencil;
    SketchPad paper;
    paper= new SketchPad (500, 500);
    pencil = new DrawingTool(paper);
   
    
    double radius; 
    double circleradius= 50.0; //making a 
    
    pencil.down();
    pencil.drawCircle(circleradius);
    pencil.up();
    pencil.forward(68);
    pencil.turnRight(90);
    pencil.down();
    pencil.forward(45);
    pencil.turnRight (60);
    pencil.forward(80);
    pencil.turnRight(60);
    pencil.forward (75);
    pencil.turnRight(60);
    pencil.forward (90);
    pencil.turnRight(60);
    pencil.forward(75);
    pencil.turnRight(60);
    pencil.forward(80);
    pencil.turnRight(60);
    pencil.forward(45);
    
    
}
}
    
   
    
  
    

