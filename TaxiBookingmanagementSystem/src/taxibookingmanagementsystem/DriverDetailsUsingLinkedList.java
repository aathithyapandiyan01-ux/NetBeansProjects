
package taxibookingmanagementsystem;


public class DriverDetailsUsingLinkedList 
{
    
    
    DriverDetailsNode head;
    
    void insertDriverDetails(String driverName , long driverID,boolean availabilityStatus)
    {
        
        DriverDetailsNode d = new DriverDetailsNode( driverName , driverID , availabilityStatus);
        
        if(head==null)
        {
            head = d;
        }
        else
        {
            DriverDetailsNode temp = head;
            
            while(temp.next!=null)
            {
            temp = temp.next;
            }
            temp.next=d;
        }
    }
    
    void displayAllDriverDetails()
    {
        
        if(head==null)
        {
            System.out.println("DRIVERS LIST IS EMPTY");
        }
        else
        {
            DriverDetailsNode temp = head ;
            while(temp!=null)
            {
                System.out.println("Driver Name"+":"+temp.getDriverName());
                System.out.println("Driver ID"+":"+temp.getDriverID());
                if(temp.isAvailabilityStatus()==true)
                System.out.println("DRIVER IS AVAILABLE");
                else
                {
                System.out.println("DRIVER IS UNAVAILABLE");
                }
                System.out.println("----------------------");
                temp = temp.next;
            }
        }
    }
    
    
    DriverDetailsNode bookDriver()
    {
        
        if(head==null)
        {
            System.out.println("DRIVERS LISTS ARE EMPTY");
        }
        
        else
        {
            DriverDetailsNode temp =head ;
            while(temp!=null)
            {
                if(temp.isAvailabilityStatus())
                {
                    return temp;
                }
                temp=temp.next;
            }
        }
        
        return null;
    
    
    }
    
    void completeRide(long DriverID)
    {
        
        if(head==null)
        {
            System.out.println("DRIVERS LISTS ARE EMPTY"); return;
        }
        else
        {
            DriverDetailsNode temp = head;
        
            while(temp!=null)
            {
             if(temp.getDriverID()==DriverID)
             {
               temp.setAvailabilityStatus(true);
               System.out.println("RIDE COMPLETED SUCCESSFULLY");
               return ;
             }
             temp=temp.next;
            }
            System.out.println("INVALID DRIVER ID");
        }
        
    
    }
}
