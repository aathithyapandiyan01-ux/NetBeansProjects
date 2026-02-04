
package areaofshapes;
import java.util.Scanner;
public class Circle extends Shape
{
    Scanner sc = new Scanner (System.in);

    public Circle() 
    {
        System.out.println("Enter the Radius of the circle");
        super.radius=sc.nextFloat();
    }

    @Override
    void calculateArea() 
    {
        
       double AreaofCircle = Math.PI*super.radius*super.radius ;
       
       display(AreaofCircle);
        
    }
    
    void display( double AreaofCircle)
    {
        System.out.println("Area of the circle is :"+AreaofCircle);
    
    
    }
}
