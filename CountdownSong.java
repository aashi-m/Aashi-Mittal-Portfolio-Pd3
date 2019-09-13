
/**
 * Write a description of class CountdownSong here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CountdownSong
{
    public static void main() 

    
    {
        int countdown = 10;
        String bedJumpers = "monkeys";
        
        int i = countdown; 
        String space = " ";
        while (i > -1)
        if (i == 0)
        {
        System.out.println("Zero little" + space + bedJumpers);
     }  
     else {
        System.out.println (i + space + "little" + space + bedJumpers + "jumping on the bed");
        System.out.println ("One fell off and broke his head");
        System.out.println ("Mama called the doctor and the doctor said");
        System.out.println ("no more monkeys jumping on the bed.");
    }
    }
}

    
