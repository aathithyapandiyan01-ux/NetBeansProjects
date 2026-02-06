
package transportmanagementsystem;
import java.util.Scanner;
abstract class Transport 
{
    Scanner sc = new Scanner(System.in);
    long PassengerID ;
    String PassengerName;
    String FromCity;
    String ToCity;
    double Distance ;
    double Fare;
    
    abstract void calculateFare();
    
    void displayTicket()
    {
        if(FromCity!=null)
        {
        
        System.out.println("Passenger ID :"+""+PassengerID);
        System.out.println("Passenger Name :"+""+PassengerName);
        System.out.println("From City :"+""+FromCity);
        System.out.println("To city :"+""+ToCity);
        System.out.println("Distance :"+""+Distance);
        System.out.println("Fare :"+""+Fare);
        
        confirmTicket();
        }
        
        else
        {
            System.out.println("KINDLY ENTER THE TRAVEL DETAILS FIRST");
        
        }
        
    }
    
    void confirmTicket()
    {
        System.out.println("Yes to confirm the ticket");
        System.out.println("No to cancel the ticket");
        String YesNo = sc.nextLine();
        
        if((YesNo).equalsIgnoreCase("Yes"))
        {
            System.out.println("Ur ticket is booked succesfully, have a safe journey");
        }
        
        
        else
        {
            System.out.println("Ticket is cancelled");
            PassengerID=0;
            PassengerName=null;
            FromCity=null;
            ToCity=null;
            Distance =0;
            Fare=0;
            
            
        }
    
    
    }
            
    
}
