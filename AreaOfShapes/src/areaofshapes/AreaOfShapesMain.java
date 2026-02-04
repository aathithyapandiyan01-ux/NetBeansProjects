
package areaofshapes;
import java.util.Scanner;

public class AreaOfShapesMain {

   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int choice;
        do
        {
            System.out.println("1 for Circle");
            System.out.println("2 for Square");
            System.out.println("3 for exit");
            System.out.println("Enter ur choice");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1 :
                {
                    Circle c = new Circle();
                    c.calculateArea(); break ;
                
                }
                case 2 :
                {
                    Square s = new Square();
                    s.calculateArea();break ;

        
                }
                case 3 :
                {
                    System.out.println("Thanks ,EXITING");break ;
                
                }
            
            
            
            
            
            
            
            
            
            
            }
        
        
        
        
        
        
        
        
        
        
        
        }while(choice!=3);
        
        
        
        
        
        
        
    }
    
}
