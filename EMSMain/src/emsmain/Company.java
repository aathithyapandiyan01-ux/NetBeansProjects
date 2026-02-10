
package emsmain;

public abstract class Company 
{
    protected String companyName ;

    public Company(String companyName) 
    {
       this.companyName=companyName;
        
    }
    
    abstract double calculateBonus() ;
    
    
}
