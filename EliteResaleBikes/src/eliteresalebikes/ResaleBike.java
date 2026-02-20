
package eliteresalebikes;


public class ResaleBike extends Bike implements ResaleOperations
{
    

    public ResaleBike(String bikeName, String ownerName, double bikePrice)
    {
        super(bikeName, ownerName, bikePrice);
    }
    
    @Override
    public void  addBike()
    {
        System.out.println("Bike added Succesfully");
    
    }
    @Override
    public void viewBike()
    {
    
    display();
    
    }

    
    
    
    
}
