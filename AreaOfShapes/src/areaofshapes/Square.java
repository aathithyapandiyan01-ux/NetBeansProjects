
package areaofshapes;
import java.util.Scanner;

public class Square extends Shape
{
  Scanner sc = new Scanner(System.in);
    
  Square()
  {
     System.out.println("enter the side value of the sqaure");
     super.sideValue=sc.nextFloat();
             
  
  }
    
  

    @Override
    void calculateArea()
    {
        double areaOfSquare = super.sideValue*super.sideValue ;
        
        display(areaOfSquare);
        
    }
    
    void display(double areaOfSquare)
    {
        System.out.println("Area of square is :"+areaOfSquare);
    
    
    }
            
            
    
}
