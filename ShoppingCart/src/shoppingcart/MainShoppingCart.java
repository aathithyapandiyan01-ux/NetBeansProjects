
package shoppingcart;

import java.util.Scanner;

public class MainShoppingCart
{

    
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("ENTER THE TOTAL ITEMS");
        int totalItems = sc.nextInt();
        int index=0;
        String cartOwnerName = "ENTER NAME ";
        ShoppingCart spc =new ShoppingCart(cartOwnerName);
        ShoppingCart.Item item[]= new ShoppingCart.Item[totalItems];
        
        int choice =0;
        do
        {
            System.out.println("WELCOME TO AP GROCERIES");
            System.out.println("1 TO SET ITEM DETAILS");
            System.out.println("2 FOR BUY ITEM");
            System.out.println("3 FOR VIEW ALL ITEM DETAILS");
            System.out.println("4 FOR EXIT ");
            boolean choiceFound = false ;
            while(!choiceFound)
            {
                try
                {
                     System.out.println("ENTER UR CHOICE");
                      choice = sc.nextInt();
                      choiceFound=true;
                }
                 catch(Exception e)
                 {
                      System.out.println("ENTER ONLY THE OPTIONS ABOVE");
                      sc.nextLine();
                 }
            }
            
            switch(choice)
            {
                
                case 1 :
                {
                    
                    String itemName=null ;
                    double[] priceHistory=new double[3] ;
                    if(index<totalItems)
                    {
                        System.out.println("U R IN THE SET ITEM DETAILS PORTAL");

                        System.out.println("ENTER THE NAME OF THE ITEM");
                        itemName = sc1.nextLine();
                        

                        System.out.println("ENTER THE PRICE HISTORY OF THE PRODUCT");
                        for(int j = 0; j<priceHistory.length ;j++)
                       {
                            if(j==0)
                            {
                            System.out.println("ENTER THE MONTHS BEFORE PRICE");
                             priceHistory[j] =sc.nextDouble();
                            }

                            else if(j==1)
                            {
                            System.out.println("ENTER THE WEEKS BEFORE PRICE");
                             priceHistory[j]=sc.nextDouble();
                            }
                            else if(j==2)
                            {
                            System.out.println("ENTER THE LATEST PRICE");
                             priceHistory[j]=sc.nextDouble();
                            }
                        }
                        
                    }
                    else
                    {
                    System.out.println("ITEM LISTS ARE FULL"); break;
                    }
                    item[index] = spc.new Item();
                    item[index].setItemDetails(itemName, priceHistory);
                    index++;

                break;
                }
                
                case 2 :
                {
                    System.out.println("ENTER THE NAME OF THE CART OWNER");
                    cartOwnerName=sc1.nextLine();
                    spc.setCartOwnerName(cartOwnerName);
                    int quantity =0;
                    System.out.println("U R IN THE BUYING PORTAL");
                    
                    System.out.println("ENTER THE NAME OF THE PRODUCT  WANTED TO BUY");
                    String buyItemName=sc1.nextLine();
                    
                    boolean found = false;
                    for(int i = 0 ; i<index;i++)
                    {
                        if(item[i] != null &&item[i].getItemName().equalsIgnoreCase(buyItemName))
                        {
                            found =true;
                            System.out.println("ENTER THE QUANTITY OF THE PRODUCTS");
                            quantity=sc.nextInt();
                            System.out.println("1 FOR CONFIRM CALCULATE BILL");
                            System.out.println("2 FOR CANCEL THE BILL");
                            System.out.println("ENTER UR CHOICE");
                            int choices=sc.nextInt();
                            if(choices==1)
                            {
                                item[i].calculateBill(quantity);
                                item[i].displayBill();
                            break;
                            }
                            else if(choices==2)
                            {
                                System.out.println("U CANCELED THE BILL");
                                break;
                            }
                        }
                        
                    }
                            if(!found)
                            {
                                System.out.println("THE PRODUCT IS NOT FOUND");
                            }
                    
                    
                break;    
                }
                case 3 :
                {
                    System.out.println("DETAILS FOR ALL THE PRODUCTS");
                    
                    for(int i = 0 ; i <index;i++)
                    {
                        item[i].diplayProductDetails();
                    }
                    break;
                }
                
                case 4 :
                {
                    System.out.println("EXITING THANK YOU");
                    
                break;
                }
            
            
            
            
            }
        
        
        }while(choice!=4);
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
