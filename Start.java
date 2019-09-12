import apcslib.*;
import chn.util.*;

/**
 * Write a description of class start here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Start
{
    /* instance variables - replace the example below with your own
    private int errorCode;

    /**
     * Constructor for objects of class start
     */
   // public Start(){
    // initialise instance variables
    //errorCode = 0;
    //}
    
  //void means that there is no return value--most method do return values (errorCodes)
public static void main (String[] args) 
{ 
ConsoleIO keyboard = new ConsoleIO ();
int x;
//switch case
do
{
    System.out.println ("Hello! Welcome to Aashi's personal portfolio!");
//how do i quit or continue the program?
System.out.println ("What kind of program would you like to see?");
System.out.println("If you would like to see a drawing, please type '1'.");
System.out.println("If you would like to see a nursery rhyme, please type '2'");
System.out.println("if you would like to see a math program, please type '3'.");
x = keyboard.readInt();
if (x == 1)

System.out.println ("What kind of drawing do you want to see?"); 
System.out.println ("If you would like to see a house, please type '1'");
System.out.println ("If you would like to see a rectangle, please type '2'");


 if (x == 2);
 System.out.println ("What kind of nursery rhyme would you like to see?");
 System.out.println ("If you would like to see '10 little monkeys jumping on the bed', please type '1'");
 System.out.println ("If you would like to see 'There were ten in the bed', please type '2'");
 System.out.println ("If you would like to choose your own animal and number of jumps in the rhyme '_____ little _____ jumping in the bed', please type '3'");
 
 
 
 
 
 
 
 






// errorCode because all classes should check for errors 

}
while (x!=1);
}
}