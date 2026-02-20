
package taxibookingmanagementsystem;


public class RideDetailsUsingLinkedList 
{
    
    RideDetailsNode head ;
    
    void insertRideDetails(String customerName , float distance)
    {
        RideDetailsNode r = new RideDetailsNode(customerName, distance);
        
        if(head ==null)
        {
            head = r;
        }
        else
        {
            RideDetailsNode temp = head ;
            
            while(temp.next!=null)
            {
                
                temp = temp.next;
            }
            
            temp.next=r;
        }
    }
    
    RideDetailsNode getRideDetails(String customerName)
    {
        RideDetailsNode temp=head;
        
        if(head==null)
        {
            System.out.println("RIDE DETAILS ARE EMPTY");
        
        }
        
            while(temp!=null)
            {
                if(temp.getCustomerName().equalsIgnoreCase(customerName))
                {
                    return temp;
                }
                temp = temp.next;
            }
            
           
                
    return null ; 
    }
    
    void displayAllRideDetails()
    {
        
        if(head==null)
        {
            System.out.println("RIDE LIST IS EMPTY");
        }
        else
        {
            RideDetailsNode temp = head ;
            while(temp!=null)
            {
                System.out.println("CUSTOMER NAME"+":"+temp.getCustomerName());
                System.out.println("TRAVELLED DISTANCE"+":"+temp.getDistance()+"km");
                System.out.println("----------------------");
                temp=temp.next;
            }
        }
    }
}  
    
    
    
    

