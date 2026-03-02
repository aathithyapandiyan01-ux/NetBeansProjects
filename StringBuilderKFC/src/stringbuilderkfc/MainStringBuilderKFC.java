
package stringbuilderkfc;


public class MainStringBuilderKFC {

   
    public static void main(String[] args) 
    {
        
        
        Burger bbb = new Burger.BurgerBuilder().setBun("Wheat")
       .setPatty("Non Veg").addLettuce(true).addCheese(true).
        addSauce(true).build();
        bbb.display();
        
        
        
//        Burger.BurgerBuilder bbb = new Burger.BurgerBuilder();
//        bbb.addLettuce(true);
//        bbb.addSauce(true);
//        Burger b = bbb.build();
//        b.display();
//        
        
        
        
        
        
    }
    
}
