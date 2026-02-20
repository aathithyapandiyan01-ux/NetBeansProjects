
package taxibookingmanagementsystem;
import java.util.Scanner;

public class TaxiBookingmanagementSystemMain {

  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        String driverName;
        String customerName;
        float distance ;
        long driverID;
        boolean availabilityStatus ;
        int choice;
        DriverDetailsUsingLinkedList AllDriverDetails = new DriverDetailsUsingLinkedList();
        RideDetailsUsingLinkedList AllRideDetails = new RideDetailsUsingLinkedList();
        do
        {
            System.out.println("WELCOME TO AP TAXIS ");
            System.out.println("1 FOR ADD DRIVER");
            System.out.println("2 FOR BOOK TAXI RIDE");
            System.out.println("3 FOR COMPLETE RIDE");
            System.out.println("4 FOR DISPLAY ALL DRIVERS");
            System.out.println("5 FOR DISPLAY ALL RIDES");
            System.out.println("6 FOR EXIT");
            System.out.println("ENTER UR CHOICE");
            choice = sc.nextInt();
            
            switch(choice)
            {
                
                case 1 :
                {
                    System.out.println("ENTER THE DRIVER NAME"); 
                    driverName=sc1.nextLine();
                    System.out.println("ENTER THE DRIVER ID"); 
                    driverID=sc.nextLong();
                    availabilityStatus=true;
                    
                    AllDriverDetails.insertDriverDetails(driverName,driverID,availabilityStatus);
                    break;
                }
                
                case 2 :
                {
                    System.out.println("U  IN THE BOOKING RIDE PORTAL");
                    System.out.println(" ENTER UR NAME ");
                    customerName=sc1.nextLine();
                    System.out.println(" ENTER THE DISTANCE");
                    distance=sc.nextFloat();
                    AllRideDetails.insertRideDetails(customerName, distance);
                    BookRiding b = new BookRiding(AllRideDetails,AllDriverDetails);
                    b.bookRiding();
                
                break;
                }
                
                case 3 :
                {
                     System.out.println("ENTER DRIVER ID TO COMPLETE RIDE");
                     long DriverID = sc.nextLong();
                     AllDriverDetails.completeRide(DriverID);
                    
                    break;
                }
                
                case 4 :
                {
                    
                    AllDriverDetails.displayAllDriverDetails();
                
                
                
                break;
                }
                
                case 5 :
                {
                    AllRideDetails.displayAllRideDetails();
                
                break;
                }
            }
        
        }while(choice!=6);
        
    }
    
}
