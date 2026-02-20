
package laptop;

public class Acer 
{
        private String model;
        private String color ;
        private boolean RGBkeyboard ;
        private double price ;

    public Acer(String model, String color, boolean RGBkeyboard, double price) 
    {
        this.model = model;
        this.color = color;
        this.RGBkeyboard = RGBkeyboard;
        this.price = price;
    }
        
        

    public String getModel() 
    {
        return model;
    }

    public void setModel(String model) 
    {
        this.model = model;
    }

    public String getColor() 
    {
        return color;
    }

    public void setColor(String color) 
    {
        this.color = color;
    }

    public boolean getRGBkeyboard() 
    {
        return RGBkeyboard;
    }

    public void setRGBkeyboard(boolean RGBkeyboard) 
    {
        this.RGBkeyboard = RGBkeyboard;
    }

    public double getPrice() 
    {
        return price;
    }

    public void setPrice(double price) 
    {
        this.price = price;
    }
      
    void display()
    {
        System.out.println("####DETAILS####");
        System.out.println("MODEL NAME  : "+getModel());
        System.out.println("PRICE :  Rs."+getPrice());
        System.out.println("COLOR  : "+getColor());
        if(getRGBkeyboard()==true)
        {
            System.out.println("RPG KEYBOARD 'AVAILABLE' ");
        }
        else
        {
            System.out.println("RPG KEYBOARD 'NOT AVALAIBLE' ");
        }
        System.out.println("-------------------------------");

    
    
    }
        
        
    
}
