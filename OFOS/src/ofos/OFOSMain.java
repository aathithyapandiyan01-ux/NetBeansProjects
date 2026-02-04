
package ofos;

import java.util.Scanner;
public class OFOSMain {

  
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
       
       int choice ;
       FoodOrder fo = new FoodOrder();

       do
       {
           System.out.println("1 for Place the order");
           System.out.println("2 for view the bill");
           System.out.println("3 for exit");
           System.out.println("Enter ur choice");
           choice = sc.nextInt();
           
           switch(choice)
           {
               case 1 :
               {
                   fo.placeOrder();
                   break;
               
               
               }
               case 2 :
               {
               fo.showBill();
                break;

               
               }
               case 3 :
               {
               System.out.println("Thanks for ordering , Kindly wait few minutes and collect ur food , Thank You ...Exiting");
                break;

               
               }
           
           
           
           
           }
           
           
       
       
       }while(choice!=3);
        
    }
    
}
