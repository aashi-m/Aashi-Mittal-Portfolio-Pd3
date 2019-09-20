
/**
 * Write a description of class NewClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class MadLib
{
   String myAnimal;
   String myNumber;
   String myPlace; 
   String myColor;
   String presentProgressive;
 
   public MadLib(String animal1, String number1, String place1, String color1, String presentProgressive1)
        
   {
      myAnimal = animal1;
            myNumber = number1;

      myPlace = place1;
      myColor = color1;
      presentProgressive = presentProgressive1;
   }
   public void Sentence1()
   {
       System.out.println("There are" + myNumber + myAnimal + "in" + myPlace);
   }
}
