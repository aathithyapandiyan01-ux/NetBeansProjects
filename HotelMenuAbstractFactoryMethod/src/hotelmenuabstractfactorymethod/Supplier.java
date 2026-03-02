
package hotelmenuabstractfactorymethod;


public abstract class Supplier 
{
    
    
    public abstract Dish creatDish(String DishName);
    
    void serveDish(String DishName)
    {
        
            Dish dish  = creatDish(DishName);
            dish.prepare();
            System.out.println("DISH IS SERVED");
    
    
    
    }
    
    

}
