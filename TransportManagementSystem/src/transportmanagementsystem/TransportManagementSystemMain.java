
package transportmanagementsystem;
import java.util.Scanner;
public class TransportManagementSystemMain 
{

   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        int choice ;
        do
        {
            System.out.println("WELCOME TO THE BUS BOOKING");
            System.out.println("1 for City Bus Booking");
            System.out.println("2 for Luxury Bus Booking");
            System.out.println("3 Exit");
            System.out.println("Enter ur choice");
            choice=sc.nextInt();
            
            switch(choice)
            {
                
                case 1 :
                {
                    System.out.println("WELCOME TO THE CITY BUS BOOKING");
                    CityBus cb = new CityBus();
                    cb.setPassengerDetails();
                    int option;
                    do
                    {
                     System.out.println("1 for choosing from and to city ");
                     System.out.println("2 for Calculating fare ");
                     System.out.println("3 for Display the ticket ");
                     System.out.println("4 for exit ");
                     System.out.println("Enter ur choice ");
                     option = sc.nextInt();
                    
                     switch(option)
                     {
                        case 1 :
                        {
                            cb.setFromNtoCity();
                            break;
                        }
                        case 2 :
                        {
                            cb.calculateFare();
                            break;
                        }
                        case 3 :
                        {
                            cb.displayTicket();
                            break;
                        
                        }
                        case 4 :
                        {
                            System.out.println("EXITING FROM CITY BUS BOOKING");
                            break;
                        
                        }
                    
                    
                    
                     }
                    }while(option!=4);
                break;
                }
                case 2 :
                {
                    System.out.println("WELCOME TO THE LUXURY BUS BOOKING");
                    LuxuryBus lb = new LuxuryBus();
                    lb.setPassengerDetails();
                    int option;
                    do
                    {
                     System.out.println("1 for choosing from and to city ");
                     System.out.println("2 for Calculating fare ");
                     System.out.println("3 for Display the ticket ");
                     System.out.println("4 for exit ");
                     System.out.println("Enter ur choice ");
                     option = sc.nextInt();
                    
                     switch(option)
                     {
                        case 1 :
                        {
                            lb.setFromNtoCity();
                            break;
                        }
                        case 2 :
                        {
                            lb.calculateFare();
                            break;
                        }
                        case 3 :
                        {
                           lb.displayTicket();
                            break;
                        
                        }
                        case 4 :
                        {
                            System.out.println("EXITING FROM CITY BUS BOOKING");
                            break;
                        
                        }
                    
                     }
                    }while(option!=4);
                    break;
                }
                
                case 3 :
                {
                    System.out.println("Exiting from the booking app , Thank you");
                    break;
                
                }
            
            
            }
        
        }while(choice!=3);
        
    }
    
}
