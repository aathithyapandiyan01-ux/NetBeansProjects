
package transportmanagementsystem;

import java.util.Scanner;


public class LuxuryBus extends Transport 
{
    Scanner sc = new Scanner (System.in);
    
    void setPassengerDetails()
    {
        System.out.println("ENTER THE PASSENGER NAME");
        PassengerName=sc.nextLine();
        System.out.println("ENTER THE PASSENGER ID");
        PassengerID=sc.nextLong();
    
    }
    
    void setFromNtoCity()
    {
        System.out.println("NOW ENTER TH ROUTE U R GOING");
        System.out.println("1 FOR Chennai to Bangalore(350 km)");
        System.out.println("2 FOR Chennai to Coimbatore(500 km) ");
        System.out.println("3 FOR Chennai to Madurai(460 km)  ");
        System.out.println("4 FOR Chennai to Trichy(330 km) ");
        System.out.println("5 FOR Chennai to salem (340 km) ");
        System.out.println("ENTER UR CHOICE");
        int choice = sc.nextInt();
        
        switch(choice)
        {
            case 1 :
            {
                FromCity="Chennai" ;
                ToCity="Bangalore";
                Distance=350;
                break;
            }
            case 2 :
            {
                FromCity="Chennai" ;
                ToCity="Coimbatore";
                Distance=500;

                break;
            }
            case 3 :
            {
            
                FromCity="Chennai" ;
                ToCity="Madurai";
                Distance=460;
                break;
            
            }
            case 4 :
            {
            
                FromCity="Chennai" ;
                ToCity="Trichy";
                Distance=330;
                break;
            }
            case 5 :
            {
            
                FromCity="Chennai" ;
                ToCity="Salem";
                Distance=340;
                break;
            }
        }
    
    }
    
    void calculateFare()
    {
        if(FromCity!=null)
        {
        this.Fare =(Distance*5);

        }
        else
        {
            System.out.println("ENTER THE TRAVEL DETAILS FIRST");
        
        }
    }

    
    
    
    
}
