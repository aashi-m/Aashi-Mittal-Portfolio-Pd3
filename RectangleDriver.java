import apcslib.*;
/**
 * Write a description of class RectangleDriver here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
class RectangleDriver
{
    public static void main()
    {
    Rectangle rect = new Rectangle(100,100,200,100);
    double perimeter;
    double area;
    perimeter = rect.getPerimeter();
    System.out.println("The perimeter of this rectangle is " + perimeter);
    area = rect.getArea();
    System.out.println("The area of this rectangle is " + area);
    rect.draw();
    
    
    //Rectangle rect2 = new Rectangle(100,100,200,100);
    //rect2.drawtwo();
    
    //Rectangle rect3 = new Rectangle(100,100,200/3, 400/3);
    //rect3.drawthree();
 
   
    }
    
    
}
