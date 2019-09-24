import chn.util.*;
/**
 * Write a description of class ReadFile here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReadFile
{
    public static void main (String [] args)
    {
        FileInput inFile = new FileInput ("compact.txt");
        
        int number, total = 0; 
        number = inFile.readInt();
        while (inFile.hasMoreTokens())
        {
            total++;
        }
        System.out.println("The total number of lines in this file are "+ total);
    }
}
