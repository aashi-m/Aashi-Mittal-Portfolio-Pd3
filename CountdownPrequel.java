
/**
 * Write a description of class CountdownPrequel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import chn.util.*;
public class CountdownPrequel
{
    public static void main(String[] args)
    {
        ConsoleIO keyboard = new ConsoleIO ();      
        String bedJumpers;                          
        int numJumps;                               
        
        System.out.println("Name your jumper: ");   
        bedJumpers = keyboard.readLine();           
        
        System.out.println ("\nHow many jumps: "); 
        numJumps = keyboard.readInt();                    
   
        while (numJumps > 0)        
        {
            System.out.println (numJumps + " " + "little" + " " + bedJumpers + " jumping on the bed");  
            System.out.println ("One fell off and bumped his head");
            System.out.println ("Mama called the doctor and the doctor said");
            System.out.println("No more monkeys jumping on the bed");
            numJumps--;
        }    
    }
}