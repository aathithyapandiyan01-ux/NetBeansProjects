
package mobileshopmanagement;


public class Mobile
{
    
    
    private int mobileID;
    private String brandName ;
    private double price;

    public Mobile(int mobileID, String brandName, double price)
    {
        this.mobileID = mobileID;
        this.brandName = brandName;
        this.price = price;
    }

    public int getMobileID() {
        return mobileID;
    }

    public void setMobileID(int mobileID) {
        this.mobileID = mobileID;
    }

    public String getBrandName() {
        return brandName;
    }

    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    void display()
    {
        
        System.out.println("----------------------------------");
        System.out.println("MOBILE BRAND NAME  :"+getBrandName());
        System.out.println("MOBILE ID   :"+getMobileID());
        System.out.println("MOBILE PRICE   : Rs."+getPrice());
        System.out.println("----------------------------------");
    
    
    }
   
    
}
