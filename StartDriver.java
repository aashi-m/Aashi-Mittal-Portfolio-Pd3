import apcslib.*;
import chn.util.*;

/**
 * Start - Class to run miscallenous programs
 * Aashi Mittal
 * Sept 12, 2019
 */

public class StartDriver
{
  public static void main(String[] args) 
  { 
      ConsoleIO keyboard = new ConsoleIO ();
      int option;
      Programs caller = new Programs();
      //switch case
      
    do 
    {
          System.out.println ("Hello! Welcome to Aashi's personal portfolio!");
          //how do i quit or continue the program?
          System.out.println ("What kind of program would you like to see?");
          System.out.println("If you would like to see a drawing, please type '1'.");
          System.out.println("If you would like to see a nursery rhyme, please type '2'.");
          System.out.println("if you would like to see a math program, please type '3'.");
         
          option = keyboard.readInt();
          if (option == 1)
                caller.drawingPrograms();
         
          if (option == 2);
                caller.nurseryPrograms();
          
          if (option == 3);
                caller.numberPrograms(); 
          
          
      } while (option!=0);

  }
}