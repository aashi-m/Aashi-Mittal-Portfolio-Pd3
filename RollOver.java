
/**
 * Write a description of class CountdownPrequel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class RollOver
{
    public static void main()
    {
    Scanner keyboard = new Scanner (System.in); 
    String countdown; 
    //String littleOnes
    boolean intchecker;
    boolean stringchecker;
    
    String space = " "; 
     
    
    
    
        
    System.out.println ("\n How many ones: ");
    countdown = keyboard.nextLine ();
    int num = Integer.parseInt(countdown); //what does this mean?
    int i = num;
   
    while (i > 0){
        if (i == 1){
        System.out.println ("There were" + i + space + "in the bed and the little one said");
        System.out.println("alone at last");
     }else{
        System.out.println ("There were");
        System.out.println (i + space + "in the bed and the little one said");
        System.out.println ("Roll over");
        System.out.println ("Roll over");
        System.out.println ("So they all rolled over and one fell off");
        
        
    }
   i--;
    
}
}
}