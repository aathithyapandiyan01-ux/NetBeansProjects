
package hotelmenuabstractfactorymethod;


public class TeaMaster extends Supplier
{

    @Override
    public Dish creatDish(String DishName) 
    {
        return new Tea();
    }

}
