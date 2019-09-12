import chn.util.*;
public class ConsoleProgram 
{
    public static void main ()
    {
        ConsoleIO keyboard = new ConsoleIO ();
        int x;
        int y = -1;
        do 
        {
            System.out.println("Do you want to print 'Hello World!' or 'Go Home.'?");
            System.out.println("If you want to print 'Hello, World!', type '1'");
            System.out.println ("If you want to print 'Go Home.', type '2'");
            x = keyboard.readInt();
            if (x == 1)
            System.out.println("Hello World!");
          
            
            else if (x == 2)
            System.out.println("Go Home");
         
            else 
            System.out.println("This is an invalid repsose, please type '1' or '2'");
            
            
        }
        while ((x!=1)||(x!=2));
    }    
}       
        