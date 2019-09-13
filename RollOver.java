
/**
 * Write a description of class CountdownPrequel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
public class RollOver
{
    public static void main()
    {
    ConsoleIO k = new ConsoleIO (); 
    String countdown; 
    int numOnes;
    
    System.out.println ("How many little ones in the bed: ");
   numOnes = k.readInt ();
   
    while (numOnes > 0){
     
        System.out.println ("There were " + numOnes + " " + "in the bed and the little one said");
        System.out.println ("Roll over");
        System.out.println ("Roll over");
        System.out.println ("So they all rolled over and one fell off");
        
        numOnes--;
    }
   
    System.out.println ("There was " + numOnes + " " + "in the bed and the little one said");
        System.out.println("alone at last");
}
}
