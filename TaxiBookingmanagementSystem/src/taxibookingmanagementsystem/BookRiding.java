
package taxibookingmanagementsystem;
import java.util.Scanner;

public class BookRiding implements Fare
{
    Scanner sc = new Scanner (System.in);
    Scanner sc1 = new Scanner (System.in);
    RideDetailsUsingLinkedList AllRideDetails;
    DriverDetailsUsingLinkedList AllDriverDetails;
    String customerName ;
    float distance;
    long driverID;
    String driverName;
    boolean availabilityStatus;
    double fare ;

    public BookRiding(RideDetailsUsingLinkedList AllRideDetails ,DriverDetailsUsingLinkedList AllDriverDetails)
    {
        this.AllDriverDetails=AllDriverDetails;
        this.AllRideDetails=AllRideDetails;
    }
    
    void bookRiding()
    {
        System.out.println("FOR CONFIRMATION , ENTER UR NAME");
        String customername =sc1.nextLine();
        
        RideDetailsNode  customerDetails =AllRideDetails.getRideDetails(customername);
        
        if(customerDetails==null)
        {
            System.out.println("UR DETAILS IS NOT IN THE LIST , FIRST REGISTER UR DETAILS"); return;
        }
        else
        {
            
            customerName = customerDetails.getCustomerName();
            distance = customerDetails.getDistance();
        
            DriverDetailsNode driverDetails = AllDriverDetails.bookDriver();
            
            if(driverDetails==null)
            {
                System.out.println("SORRY , NO DRIVER IS AVAILABLE FOR UR CURRENT RIDE , TRY AGAIN LATER");
            }
            else
            {
                driverName=driverDetails.getDriverName();
                driverID=driverDetails.getDriverID();
                availabilityStatus=driverDetails.isAvailabilityStatus();
                driverDetails.setAvailabilityStatus(false);
                calculateFare();
                
                System.out.println("###🚕🚕🚕🚕RIDE BOOKED SUCCESFULLY🚕🚕🚕🚕###");
                System.out.println("ASSIGNED DRIVER :"+""+driverName);
                System.out.println("ASSIGNED DRIVER ID :"+""+driverID);
                System.out.println("###RIDE DETAILS###");
                System.out.println("CUSTOMER NAME "+""+customername);
                System.out.println("DISTANCE "+""+distance+"km");
                System.out.println("FARE "+""+"Rs."+fare);
                
                System.out.println("😇THANK U FOR BOOKING IN OUR TAXI😇");
                System.out.println("🚕🚕🚕🚕😇HAVE A HAPPY RIDE😇😇🚕🚕🚕🚕");
            
            }
        }
    }
    
    public void calculateFare()
    {
        fare = distance*15;
    }
    
    
    
    
    
}
