import apcslib.*;
import chn.util.*;

public class Programs
{  
    //construtor
    /**
     * Constructor for objects of class Programs
     */
    public Programs()
    {
    }

    //methods
    public void drawingPrograms()
    {
        ConsoleIO k = new ConsoleIO();
        int option; 
        
        System.out.println ("What kind of drawing do you want to see?"); 
        System.out.println ("If you would like to see a house, please type '1'");
        System.out.println ("If you would like to see a rectangle, please type '2'");
        option = k.readInt();
        
        switch(option) //my encapsulation
        {
         case 1:
                drawHouse();
                break;
            case 2:
                //rectangle thing
                break;
    }
}

public void nurseryPrograms()
{
    ConsoleIO k = new ConsoleIO();
    
    int optiontwo;
    System.out.println ("What kind of nursery rhyme would you like to see?");
    System.out.println ("If you would like to see '10 little monkeys jumping on the bed', please type '1'");
          System.out.println ("If you would like to see 'There were ____ in the bed', please type '2'");
          System.out.println ("If you would like to choose your own animal and number of jumps in the rhyme '_____ little _____ jumping in the bed', please type '3'");
 
 
    optiontwo = k.readInt();
    switch(optiontwo)
    {
        case 1:
            countdownSong();
            break;
        case 2:
            rollOver();
            break;
            
        case 3:
            countdownPrequel();
            break;
    }
}
public void mathPrograms()
{
    ConsoleIO k = new ConsoleIO();
    int optionthree;
    System.out.println("What kind of math program would you like to see?");
    System.out.println ("If you would like to see 'Get your change by coin' program, please type '1'");
    System.out.println("If you would like tosee the 'Math Fun lab' program, please type '2'");
    
    optionthree = k.readInt();
    switch (optionthree)
    {
        case 1:
        change();
        break;
        case 2:
        mathfun();
        break;
    }
}
        
public void numberPrograms ()
{
    ConsoleIO k = new ConsoleIO ();
    int optionthree;
    operators ();
}
public void drawHouse()
{
    DrawingTool pencil; //object declaration
        SketchPad paper; //object declaration
 
        paper = new SketchPad (1000,500); 
        pencil = new DrawingTool(paper); 
        //these two were to create instances of the DrawingTool and SketchPad that are in the library today 
        //now, directions: memorize the format for the instructions 
            pencil.getColor ();
            pencil.forward (100);
            pencil.turnRight (90);
            pencil.forward (200);
            pencil.turnRight (90);
            pencil.forward (100);
            pencil.turnRight (90);
            pencil.forward (200);
            pencil.turnRight (90);
            pencil.forward (100);
            pencil.turnRight (45);
            pencil.forward (142);
            pencil.turnRight (90); 
            pencil.forward (142);
            pencil.turnRight (45);
            pencil.forward (100);
            pencil.turnRight (90);
            pencil.forward (80);
            pencil.turnRight (90);
            pencil.forward (40);
            pencil.turnLeft (90);
            pencil.forward (20);
            pencil.turnLeft (90);
            pencil.forward (40);
            /*a few questions I have: can I change the color of the pencil, can I lift
               * it or choose where to start
                 */
                pencil.turnRight(90);
                pencil.forward (100);
                pencil.turnRight (90);
                pencil.forward (160);
                pencil.turnRight (90);
                pencil.forward (30);
                pencil.turnRight (90);
                pencil.forward (30);
}
public void countdownSong()
{
    int i = 10;
        String bedJumpers = "monkeys";
    while (i > 0)
        if (i == 0)
        {
        System.out.println("Zero little" + " " + bedJumpers);
     }  
     else {
        System.out.println (i + " " + "little" + " " + bedJumpers + "jumping on the bed");
        System.out.println ("One fell off and broke his head");
        System.out.println ("Mama called the doctor and the doctor said");
        System.out.println ("no more monkeys jumping on the bed.");
        i--;
    }
}
public void countdownPrequel()
    {
    ConsoleIO keyboard = new ConsoleIO ();      
    String bedJumpers;                          
    int numJumps;                               
        
    System.out.println("Name your animal (plural): ");   
    bedJumpers = keyboard.readLine();           
        
    System.out.println ("\nHow many jumps: "); 
    numJumps = keyboard.readInt();                    
   
    while (numJumps > 0)        
        {
            System.out.println (numJumps + " " + "little" + " " + bedJumpers + " jumping on the bed");  
            System.out.println ("One fell off and bumped his head");
            System.out.println ("Mama called the doctor and the doctor said");
            System.out.println("No more "+ bedJumpers + " jumping on the bed");
            numJumps--;
        } 
    }
public void rollOver()
    {
     ConsoleIO k = new ConsoleIO (); 
     String countdown; 
     int numOnes;
    
     System.out.println ("How many little ones in the bed: ");
     numOnes = k.readInt ();
   
    while (numOnes > 0){
     
        System.out.println ("There were " + numOnes + " " + "in the bed and the little one said");
        System.out.println ("Roll over");
        System.out.println ("Roll over");
        System.out.println ("So they all rolled over and one fell off");
        
        numOnes--;
    }
   
    System.out.println ("There was " + numOnes + " " + "in the bed and the little one said");
    System.out.println("alone at last");
}


public void operators ()
{  int x;
        for (x = 1; x <= 10; x++);
   {System.out.println (x);
    }
    
}
public void change ()
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
public void mathfun()
{
    int a = 4;
    int b = 9;
    int AnswerOne = (a + b);
    System.out.println("4 + 9 ="  + AnswerOne);
    
    int c = 46;
    int d = 7;
    int AnswerTwo = (c / d);
    System.out.println(" 46 / 7 = " + AnswerTwo);
    
    int e = 47;
    int f = 7;
    int AnswerThree = (e % f);
    System.out.println(" 47 % 7 = " + AnswerThree);
    
    int g = 2;
    double h = 3.0; 
    double AnswerFour = (2 * 3.0);
    System.out.println(" 2 * 3.0 = " + AnswerFour);
    
    double Answer5 = (double)25 / 4;
    System.out.println (Answer5);
    int Answer6 = (int)7.75 + 2;
    System.out.println(Answer6);
    int Answer7 = (int) 'p';
    System.out.println(Answer7);
    char Answer8 = (char)105;
    System.out.println(Answer8);
   
    System.out.println("The largest value of type int =" + Integer.MAX_VALUE);
   
    
}
}