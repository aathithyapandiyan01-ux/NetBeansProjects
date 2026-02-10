
package buildingconstructionmanagementsystem;


public class Building
{
    
    private String ownerName ;
    private float area ;
    private double costPerSqFt;
    
    Building()
    {
    }
    
    public  Building(String ownerName,float area,double costPerSqFt)
    {
        this.ownerName=ownerName;
        this.area=area;
        this.costPerSqFt=costPerSqFt;
    }
    
    void display()
    {
        System.out.println("####DETAILS####");
        System.out.println("OWNER NAME :"+""+ownerName);
        System.out.println("AREA :"+""+area);
        System.out.println("COST PER SQ FEET :"+""+costPerSqFt);
    }
    
    void setOwnerName(String ownerName)
    {
    this.ownerName=ownerName;
    }
    
    String getOwnerName()
    {
        return ownerName;
    }
    void setArea(float area)
    {
    this.area=area;
    }
    
    float getArea()
    {
        return area;
    }
    void setCostPerSqfeet (double costPerSqFt)
    {
    this.costPerSqFt=costPerSqFt;
    }
    
    double getCostPerSqFeet()
    {
        return costPerSqFt;
    }
    
    
    
    
}
