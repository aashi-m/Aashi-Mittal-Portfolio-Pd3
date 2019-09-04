
/**
 * Write a description of class CountdownPrequel here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.Scanner;
public class CountdownPrequel
{
    public static void main()
    {
    Scanner keyboard = new Scanner (System.in); 
    String countdown; 
    String bedJumpers;
    boolean intchecker;
    boolean stringchecker;
    
    String space = " "; 
        
    System.out.println("Name your jumper: ");
    bedJumpers = keyboard.nextLine();
    
    
    
        
    System.out.println ("\n How many jumps: ");
    countdown = keyboard.nextLine ();
    int num = Integer.parseInt(countdown);
    int i = num;
   
    while (i > -1){
        if (i == 0){
        System.out.println("Zero little" + space + bedJumpers);
     }else{
        System.out.println (i + space + "little" + space + bedJumpers + "jumping on the bed");
        System.out.println ("One fell off and broke his head");
        System.out.println ("Mama called the doctor and the doctor said");
        System.out.println ("no more "+bedJumpers+" jumping on the bed.");
        
    }
   i--;
    
}
}
}