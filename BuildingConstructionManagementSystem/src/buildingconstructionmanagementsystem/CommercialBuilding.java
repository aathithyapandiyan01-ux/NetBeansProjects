
package buildingconstructionmanagementsystem;

public class CommercialBuilding  extends Building implements ConstructionRules
{
    
  double commercialCostPerSqft; 
  double commercialCharge = 150000;
  
  public CommercialBuilding( String ownerName, float area, double costPerSqFt) 
    {
        super(ownerName, area, costPerSqFt);
    }
    
    
    public  void calculateCost()
     {
       commercialCostPerSqft =(getArea()*getCostPerSqFeet())+commercialCharge;
     
     }
    
    void display()
    {
        System.out.println("####DETAILS####");
        System.out.println("OWNER NAME :"+""+getOwnerName());
        System.out.println("AREA :"+""+getArea());
        System.out.println("COST PER SQ FEET :"+""+getCostPerSqFeet());
        System.out.printf("COMMERCIAL BUILDING CONSTRUCTION COST FOR THE AREA U ENTERED : %.2f%n",commercialCostPerSqft);       
        System.out.println("NOTE THAT COMMERCIAL BUILDING INCLUDES COMMERCIAL CHARGES");
        System.out.println("#######################################################");
        
    }
    
  
  
  
  
}
