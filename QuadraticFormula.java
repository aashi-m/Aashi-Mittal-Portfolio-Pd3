import chn.util.*;
import java.lang.Math;
/**
 * Write a description of class QuadraticFormula here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class QuadraticFormula
{
    public static void main (String [] args)
    {
        ConsoleIO keyboard = new ConsoleIO ();
        double answer;
        double answer2;
        double a;
        double b;
        double c;
        
        System.out.println("What's your a? Enter an integer or fraction.");
        a = keyboard.readDouble();
        System.out.println("What's your b? Enter an integer or fraction.");
        b = keyboard.readDouble();
        System.out.println("What's your c? Enter an intger or fraction.");
        c = keyboard.readDouble();
    
        answer = (-b + (Math.sqrt((b*b)-4*a*c)))/(2*a);
        answer2 = (-b - (Math.sqrt((b*b)-4*a*c)))/(2*a);
        
        System.out.println("the answers are " + answer + " and " + answer2);
        
}
}