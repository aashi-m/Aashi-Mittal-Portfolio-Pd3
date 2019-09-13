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
      int exit;
      Programs caller = new Programs();
      //switch case
      int answer;
      System.out.println("Hello! Welcome to Aashi's personal portfolio");
      System.out.println("Plese press '5' to continue"); 
      answer = keyboard.readInt();
    while (answer!=-1){
         
        System.out.println ("\u000c");
        System.out.println ("What kind of program would you like to see?");
         System.out.println("If you would like to see a drawing, please type '1'.");
         System.out.println("If you would like to see a nursery rhyme, please type '2'.");
         System.out.println("if you would like to see a math program, please type '3'.");
         System.out.println("If you would like to exit the program, please type '0'");
         
         answer = keyboard.readInt();
            if (answer == 1){
            
                caller.drawingPrograms();
                try{
                Thread.sleep(5000);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        
            if (answer ==2){
            caller.nurseryPrograms();
            try {
            Thread.sleep(5000);
        }catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
            if (answer==3)
                caller.numberPrograms();
         
            if (answer==0)
                System.exit(0);
      } 
  }
}

