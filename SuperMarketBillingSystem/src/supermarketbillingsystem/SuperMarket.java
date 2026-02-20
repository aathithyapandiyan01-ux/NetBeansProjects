
package supermarketbillingsystem;


public class SuperMarket 
{
        public static final String GREEN  = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE   = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String RESET ="\u001B[0m";
    
    String productName[] ;
    double price[];
    int productCount ;
    int quantity;
    static int customerCount;
    
    double buyProductGSTAmount ;
    double buyProductfinalAmount ;
    double gstPercentage=8;
    String buyProductName;
    int buyQuantity;
    double buyproductPrice;
    

    public SuperMarket(String[] productName, double[] price, int productCount) 
    {
        this.productName = productName;
        this.price = price;
        this.productCount = productCount;
    }

    private SuperMarket() 
    {
    }
    
    void displayProductDetails()
    {
        for(int i =0;i<productCount;i++)
        {
            System.out.println(GREEN+"NAME OF THE PRODUCT "+(i+1)+":"+productName[i]+RESET);
            System.out.println(GREEN+"PRICE OF THE PRODUCT "+(i+1)+":"+price[i]+RESET);
            System.out.println("--------------------------------------");
        }
    
    
    
    }
    
    
    void generateBill(String buyProductName,int buyQuantity,double buyproductPrice)
    {
        
        this.buyProductName=buyProductName;
        this.buyQuantity=buyQuantity;
        this.buyproductPrice=buyproductPrice;
        
        class BillCalculator
        {
            
            
            void calculateGST()
            {
                double totalBaseAmount = buyproductPrice * buyQuantity;
                buyProductGSTAmount = (totalBaseAmount * gstPercentage) / 100;
            }
            
            void finalAmount()
            {
             double totalBaseAmount = buyproductPrice * buyQuantity;
             buyProductfinalAmount = totalBaseAmount + buyProductGSTAmount;
            }
            
            
            void displaybill()
            {
                System.out.println(PURPLE+"---------------------------------------------------------"+RESET);
                System.out.println(PURPLE+"PRODUCT NAME :  "+buyProductName+RESET);
                System.out.println(PURPLE+"PRODUCT PRICE : Rs. "+buyproductPrice+RESET);
                System.out.println(PURPLE+"PRODUCT QUANTITY :  "+buyQuantity+RESET);
                System.out.println(PURPLE+"PRODUCT GST AMOUNT : Rs. "+buyProductGSTAmount+RESET);
                System.out.println(PURPLE+"PRODUCT FINAL AMOUNT :Rs.  "+buyProductfinalAmount+RESET);
                System.out.println(PURPLE+"---------------------------------------------------------"+RESET);
            
            
            }
            
            static void displayTotalcustomers()
            {
                customerCount++;
                System.out.println("TOTAL NO OF CUSTOMERS  :"+SuperMarket.customerCount);
            
            }
        }
        
    BillCalculator bcc = new BillCalculator();
    bcc.calculateGST();
    bcc.finalAmount();
    bcc.displaybill();
    BillCalculator.displayTotalcustomers();
            
    
    
    }
    
    
    
    
    
}
