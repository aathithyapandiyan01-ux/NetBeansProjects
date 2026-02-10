
package buildingconstructionmanagementsystem;


public class ResidentialBuilding extends Building implements ConstructionRules
{
    
    double residentialCostPerSqft;

    public ResidentialBuilding( String ownerName, float area, double costPerSqFt) 
    {
        super(ownerName, area, costPerSqFt);
    }
    
    
    public  void calculateCost()
     {
         residentialCostPerSqft =getArea()*getCostPerSqFeet();
     
     }
    
    void display()
    {
        System.out.println("####DETAILS####");
        System.out.println("OWNER NAME :"+""+getOwnerName());
        System.out.println("AREA :"+""+getArea());
        System.out.println("COST PER SQ FEET :"+""+getCostPerSqFeet());
        System.out.printf("RESIDENTIAL BUILDING CONSTRUCTION COST FOR THE AREA U ENTERED : %.2f%n",residentialCostPerSqft);      
        System.out.println("#######################################################");

        
    }
    
    
    
    
    
    
    
    
}
