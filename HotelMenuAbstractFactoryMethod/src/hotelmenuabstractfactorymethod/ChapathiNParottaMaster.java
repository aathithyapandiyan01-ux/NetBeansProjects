
package hotelmenuabstractfactorymethod;


public class ChapathiNParottaMaster extends Supplier
{

    @Override
    public Dish creatDish(String DishName) 
    {
        
        if(DishName.equalsIgnoreCase("parotta"))
        {
        return new Parotta();
        }
        else
        {
        return new Chapathi();
        }
    }

}
