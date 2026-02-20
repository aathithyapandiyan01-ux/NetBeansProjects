
package taxibookingmanagementsystem;


public class DriverDetailsNode 
{
    
    private long driverID;

    
    private String driverName;
    private boolean availabilityStatus;
    DriverDetailsNode next;

    public DriverDetailsNode(String driverName , long driverID,boolean availabilityStatus) 
    {
        this.driverID = driverID;
        this.driverName = driverName;
        this.availabilityStatus = availabilityStatus;
    }
    
    public long getDriverID() 
    {
        return driverID;
    }

    public void setDriverID(long driverID) 
    {
        this.driverID = driverID;
    }
    
    public DriverDetailsNode getNext()
    {
        return next;
    }

    public void setNext(DriverDetailsNode next)
    {
        this.next = next;
    }

    public String getDriverName() 
    {
        return driverName;
    }

    public void setDriverName(String driverName) 
    {
        this.driverName = driverName;
    }

    public boolean isAvailabilityStatus() 
    {
        return availabilityStatus;
    }

    public void setAvailabilityStatus(boolean availabilityStatus)
    {
        this.availabilityStatus = availabilityStatus;
    }
    
}
