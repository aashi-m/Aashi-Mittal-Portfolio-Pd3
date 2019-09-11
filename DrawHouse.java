
/**
 * A house drawing from Lab 1
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import apcslib.*; 
import java.awt.Color.*;
import javax.swing.*;

    //this is something to memorize 
    
class Colour extends JFrame {
    Colour () 
    { super ("coluor");
        Colour brown = new Colour();
    }
}
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
pencil.getColor ();
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
pencil.turnLeft (90);
pencil.forward (40);
/*a few questions I have: can I change the color of the pencil, can I lift
 * it or choose where to start
 */
pencil.turnRight(90);
pencil.forward (100);
pencil.turnRight (90);
pencil.forward (160);
pencil.turnRight (90);
pencil.forward (30);
pencil.turnRight (90);
pencil.forward (30);



 

//how can I add a new color in this? I requested access for the video 
//that the logo team made
  
  
}
}
