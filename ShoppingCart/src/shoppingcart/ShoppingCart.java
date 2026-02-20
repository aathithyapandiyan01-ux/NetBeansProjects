
package shoppingcart;


public class ShoppingCart 
{
    
    private String cartOwnerName ;

    public ShoppingCart(String cartOwnerName) 
    {
        this.cartOwnerName = cartOwnerName;
    }
    void setCartOwnerName(String cartOwnerName)
    {
    this.cartOwnerName = cartOwnerName;
    }
    
    class Item
    {
        private String itemName ;
        private double priceHistory[];
        private double bill;
        private int quantity;
        private int totalItems ;
        private double itemLatestprice;
        
        void setItemDetails(String itemName,double priceHistory[])
        {
            this.itemName=itemName;
            this.priceHistory=priceHistory;
            this.itemLatestprice=priceHistory[2];
            totalItems++;
        }
        
        String getItemName()
        {
        return itemName;
        }
        
        void DisplayProductPriceHistory()
        {
        
            for(int j = 0; j<priceHistory.length ;j++)
                       {
                            if(j==0)
                            {
                            System.out.println("PRICE OF THE PRODUCT MONTHS BEFORE "+":"+priceHistory[j]);
                            }

                            else if(j==1)
                            {
                            System.out.println("PRICE OF THE PRODUCT WEEKS BEFORE"+":"+priceHistory[j]);
                            }
                            else if(j==2)
                            {
                            System.out.println("PRICE OF THE PRODUCT LATEST PRICE"+":"+priceHistory[j]);
                            }
                        }
        
        }
        
        void calculateBill(int quantity)
        {
             this.quantity=quantity;
             bill = quantity * itemLatestprice;
        }
        
        void displayBill()
        {
            System.out.println("--------------------------------------------------");
            System.out.println("CART OWNER NAME :"+" "+cartOwnerName);
            System.out.println("NAME OF STHE PRODUCT :"+" "+itemName);
            System.out.println("PRICE OF THE  PRODUCT :"+" "+itemLatestprice);
            System.out.println("QUANTITY :"+" "+quantity);
            System.out.println("TOTAL BILL :"+""+bill);
            DisplayProductPriceHistory();
            System.out.println("THANK U VISIT AGAIN");
            System.out.println("--------------------------------------------------");

        
        }
        
        void diplayProductDetails()
        {
            System.out.println("----------------------------------");
            System.out.println("NAME OF STHE PRODUCT :"+" "+itemName);
            System.out.println("PRICE OF THE  PRODUCT :"+" "+itemLatestprice);
            System.out.println("----------------------------------");
        }
        
     
    }
    
    
    
}
