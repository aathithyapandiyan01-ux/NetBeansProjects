
package ofos;

import java.util.Scanner;
public class FoodOrder extends Customer implements Order 
{
    Scanner sc = new Scanner (System.in);
    String FoodName[] ;
    float FoodPrice[];
    int length;
    String orderFoodName;
    float orderFoodPrice;
    boolean isFound;

    public FoodOrder() 
    {
        System.out.println("Enter the length");
        length = sc.nextInt();
        FoodName=new String[length];
        FoodPrice=new float [length];
        setFoodNameNPrice();
        
    }
    
    
    void setFoodNameNPrice()
    {
        sc.nextLine();
        for(int i = 0 ; i<length;i++)
        {

            System.out.println("Enter the "+(i+1)+""+"Food Name :");
            FoodName[i]=sc.nextLine();
            System.out.println("Enter the "+(i+1)+""+"Food Price :");
            FoodPrice[i]=sc.nextFloat();
            sc.nextLine();
            
        
        }
    
    
    
    }
    

    public void placeOrder()
    {
        isFound=false;
        System.out.println("#####FoodName Menu#####" );
        for(int i = 0 ; i <length;i++)
        {
            System.out.println(FoodName[i]+"Rs.:"+FoodPrice[i]);
        }
           System.out.println("Enter the food name u like to order");
           orderFoodName = sc.nextLine();
           
           for(int i = 0 ; i<length;i++)
           {
            if(FoodName[i].equalsIgnoreCase(orderFoodName))
            {
                 orderFoodPrice = FoodPrice[i];
                 isFound=true;
                 break;
            
            }
           }   
           if(!isFound)
           {
           System.out.println("Ur order food is not in the menu");
           }
        
        
    
    }
    
    @Override
    public void showBill()
    {
        if(isFound)
        {
        System.out.println("Name of the customer  is :"+ "" +Name);
        System.out.println("Ur ordered food name is :"+ "" +orderFoodName);
        System.out.println("Ur ordered food price is :"+""+ orderFoodPrice);
        }
        else
        {
            System.out.println("NO ORDER PLACED");
        
        }
    
    }
    
}
