import chn.util.*;
public class ChangeLab
{
   public static void main (String [] args)
   {
       double paid, price, change;
       int dimes, nickels, pennies;
       
       ConsoleIO keyboard = new ConsoleIO();
       System.out.println("How much did you pay?");
       paid = keyboard.readDouble();
       
       
       ConsoleIO keyboardtwo = new ConsoleIO();
       System.out.println("How much was the price?");
       price = keyboardtwo.readDouble();
       
       change = paid - price;
       change = change - (int)change; 
       pennies = (int) (change * 100);
       
       dimes = (int) pennies/10;
       nickels = (int) ((pennies%10)/5);
       pennies = (int) (pennies%5);
       
       System.out.println("The number of dimes of change is " + dimes);
       System.out.println("The number of nickels of change is " + nickels);
       System.out.println("The number of pennies of change is " + pennies);
       
       
   
    }   
}