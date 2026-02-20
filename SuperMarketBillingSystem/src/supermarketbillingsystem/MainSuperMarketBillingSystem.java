
package supermarketbillingsystem;

import java.util.Scanner;


public class MainSuperMarketBillingSystem 
{
        public static final String RESET ="\u001B[0m";
        public static final String BLACK  = "\u001B[30m";
        public static final String RED    = "\u001B[31m";
        public static final String GREEN  = "\u001B[32m";
        public static final String YELLOW = "\u001B[33m";
        public static final String BLUE   = "\u001B[34m";
        public static final String PURPLE = "\u001B[35m";
        public static final String CYAN   = "\u001B[36m";
        public static final String WHITE  = "\u001B[37m";
        public static final String BOLD = "\u001B[1m";

   
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        Scanner sc1 =new Scanner(System.in);
        
        String productName[]=null;
        double productPrice[]=null;
        SuperMarket spm =null ;
        int choice=0;
        int index=0;
        do
        {
            System.out.println(CYAN+"WELCOME TO AP SUPERMARKET"+RESET);
            System.out.println(CYAN+"1 FOR SET PRODUCTS"+RESET);
            System.out.println(CYAN+"2 FOR VIEW PRODUCT DETAILS"+RESET);
            System.out.println(CYAN+"3 FOR PURCHASE PRODUCT "+RESET);
            System.out.println(CYAN+"4 FOR EXIT  "+RESET);
            
            boolean choiceRight=false;
            while(!choiceRight)
            {
                try
                {
                    System.out.println("ENTER UR CHOICE  ");
                    choice =sc.nextInt();
                    choiceRight=true;
                }
                catch(Exception e)
                {
                    System.out.println("ENTER THE VALID INPUTS");
                    sc.nextLine();
                }
                    
            }
            
            switch(choice)
            {
                case 1 :
                {
                    System.out.println(RED+"SET PRODUCT PORTAL"+RESET);
                    System.out.println(RED+"ENTER THE NO OF PRODUCTS"+RESET);
                    int productsCount = sc.nextInt();
                    productName =new String[productsCount];
                    productPrice =new double[productsCount];
                    
                    for(int i = 0;i<productsCount;i++)
                    {
                        System.out.println(RED+"ENTER THE NAME OF THE PRODUCT "+(i+1)+":"+RESET);
                        productName[index]=sc1.nextLine();
                        System.out.println(RED+"ENTER THE PRICE OF THE PRODUCT "+(i+1)+":"+RESET);
                        productPrice[index]=sc.nextDouble();
                        index++;
                    
                    }
                    spm = new SuperMarket(productName, productPrice, index);
                    
                
                break;
                }
                case 2 :
                {
                    System.out.println(YELLOW+"PRODUCT VIEW PORTAL");
                    spm.displayProductDetails();
                break;
                }
                case 3 :
                {
                    System.out.println(YELLOW+"BUYING PORTAL"+RESET);
                    
                    System.out.println(YELLOW+"ENTER THE NAME OF THE PRODUCT U WANT TO BUY"+RESET);
                    String buyProductName =sc1.nextLine();
                    System.out.println(YELLOW+"ENTER THE QUANTITY OF THE PRODUCT U WANT TO BUY"+RESET);
                    int buyQuantity=sc.nextInt();
                    boolean productfound = false ;
                    for(int i =0 ;i<index;i++)
                    {
                        if(productName[i].equalsIgnoreCase(buyProductName))
                        {
                          double buyproductPrice =productPrice[i];
                          spm.generateBill(buyProductName,buyQuantity,buyproductPrice);
                          
                          productfound=true;
                        
                        }
                    
                    }
                    if(!productfound)
                    {
                        System.out.println("PRODUCT NOT FOUND ");
                    }
                break;
                }
                
                case 4 :
                {
                    System.out.println(BLUE+"EXITING THANK U"+RESET);
                }
            }
            
        }while(choice!=4);
        
        
        
        
        
        
        
        
        
        
    }
    
}
