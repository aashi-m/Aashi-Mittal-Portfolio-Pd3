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
      ConsoleIO keyboard = new ConsoleIO (); //sets up user inpu
      Programs caller = new Programs(); //calls program class containing switch cases and all code
      int answer=5;
      System.out.println("Hello! Welcome to Aashi's personal portfolio");
      
      answer = keyboard.readInt(); //reads integer input from user
    while (answer!=-1){
         
        System.out.println ("\u000c");
        System.out.println ("What kind of program would you like to see?");
         System.out.println("If you would like to see a drawing, please type '1'.");
         System.out.println("If you would like to see a nursery rhyme, please type '2'.");
         System.out.println("if you would like to see a math program, please type '3'.");
         System.out.println("If you would like to exit the program, please type '0'");
         
         answer = keyboard.readInt(); //reads integer input from user 
         if (answer == 1){
            
                caller.drawingPrograms(); //if the user input is 1, then drawingprograms class is called, then switch case activated
                try{
                Thread.sleep(4000);
            } catch (InterruptedException e){
                e.printStackTrace(); //this allows user time to view code before loop continues
            }
        }
        
        if (answer ==2){
            caller.nurseryPrograms();// if user input 2, then nurseryprograms called, &swtich case there activated
            try {
            Thread.sleep(4000);
            }catch (InterruptedException e) {
            e.printStackTrace(); //allows user time to view code before loop continues
            }
        }
        if (answer==3){
            caller.mathPrograms();
            try{
            Thread.sleep(4000);
            }
            catch (InterruptedException e){
            e.printStackTrace();
            }
        }
                    
                
         
        if (answer==0)
                System.exit(0);
      } 
  }
}


