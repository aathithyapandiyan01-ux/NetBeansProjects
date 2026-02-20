
package taxibookingmanagementsystem;

public class RideDetailsNode 
{
    
    private String customerName ;
    private float distance;
    RideDetailsNode next ;

    public RideDetailsNode(String customerName, float distance) 
    {
        this.customerName = customerName;
        this.distance = distance;
    }

    public float getDistance() 
    {
        return distance;
    }

    public void setDistance(float distance) 
    {
        this.distance = distance;
    }

    public String getCustomerName() 
    {
        return customerName;
    }

    public void setCustomerName(String customerName) 
    {
        this.customerName = customerName;
    }
    
    
    
    
}
