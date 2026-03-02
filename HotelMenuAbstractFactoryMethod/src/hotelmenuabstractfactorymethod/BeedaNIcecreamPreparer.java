
package hotelmenuabstractfactorymethod;


public class BeedaNIcecreamPreparer extends Supplier
{

   
    @Override
    public Dish creatDish(String DishName) 
    {
        if(DishName.equalsIgnoreCase("beeda"))
        {
        return new Beeda();
        }
        else
        {
        return new IceCream();
        }
        
        
    }
    

}
