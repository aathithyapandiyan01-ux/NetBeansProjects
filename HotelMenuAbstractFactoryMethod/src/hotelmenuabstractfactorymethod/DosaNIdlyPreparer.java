
package hotelmenuabstractfactorymethod;


public class DosaNIdlyPreparer extends Supplier
{

    @Override
    public Dish creatDish(String DishName) 
    {
        if(DishName.equalsIgnoreCase("dosa"))
        {
        return new Dosa();
        }
        else
        {
        return new Idly();
        }
    }

}
