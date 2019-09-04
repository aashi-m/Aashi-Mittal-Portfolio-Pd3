
/**
 * A house drawing from Lab 1
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*; 

public class DrawHouse
{
    // instance variables - replace the example below with your own
    public static void main(String [] args)
{
    //this is something to memorize 
DrawingTool pencil;
SketchPad paper;
//these two were object declarations 
paper = new SketchPad (300,300); 
pencil = new DrawingTool(paper); 
//these two were to create instances of the DrawingTool and SketchPad that are in the library today 

//now, directions: memorize the format for the instructions 
pencil.forward (100);
pencil.turnRight (90);
pencil.forward (200);
pencil.turnRight (90);
pencil.forward (100);
pencil.turnRight (90);
pencil.forward (200);
pencil.turnRight (90);
pencil.forward (100);
pencil.turnRight (45);
pencil.forward (142);
pencil.turnRight (90); 
pencil.forward (142);
pencil.turnRight (45);
pencil.forward (100);
pencil.turnRight (90);
pencil.forward (80);
pencil.turnRight (90);
pencil.forward (40);
pencil.turnLeft (90);
pencil.forward (20);


 
  
  
}
}