
package eliteresalebikes;


public class Bike 
{
    private String bikeName;
    private String ownerName;
    private double bikePrice;
    static private int bikeCount;
    final String showroomName="Elite Resale Bikes";

   
    public Bike(String bikeName, String ownerName, double bikePrice) 
    {
        this.bikeName = bikeName;
        this.ownerName = ownerName;
        this.bikePrice = bikePrice;
        bikeCount++;
    }

    public String getBikeName() 
    {
        return bikeName;
    }

    public void setBikeName(String bikeName) 
    {
        this.bikeName = bikeName;
    }

    public String getOwnerName() 
    {
        return ownerName;
    }

    public void setOwnerName(String ownerName) 
    {
        this.ownerName = ownerName;
    }

    public double getBikePrice() 
    {
        return bikePrice;
    }

    public void setBikePrice(double bikePrice) 
    {
        this.bikePrice = bikePrice;
    }

    public static int getBikeCount() 
    {
        return bikeCount;
    }

    public static void setBikeCount(int bikeCount) 
    {
        Bike.bikeCount = bikeCount;
    }
    
    void display()
    {
        
        System.out.println("Bike Name :"+"  "+getBikeName());
        System.out.println("Owner Name :"+" "+getOwnerName());
        System.out.println("Bike price :"+" "+getBikePrice());
        System.out.println("Bike counts :"+" "+getBikeCount());
        System.out.println("Show Room Name :"+" "+showroomName);
    
    }
    
    
    
    
    
    
    
}
