
package vehiclemanagementsystemmain;


public class MotorCycle extends Vehicle
{
    String type;
    MotorCycle(String Brand, int Year , String type)
    {
            
        super(Brand ,Year);
        this.type=type;
    }
    void display()
    {
        System.out.println("Brand :"+Brand);
        System.out.println("Year :"+Year);
        System.out.println("Type :"+type);
    
    }

   
    
}
