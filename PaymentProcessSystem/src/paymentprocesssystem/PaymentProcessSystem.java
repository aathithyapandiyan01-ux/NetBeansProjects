
package paymentprocesssystem;

import java.util.Scanner;
public class PaymentProcessSystem
{
        public static final String ERROR ="\u001B[31m";
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
        public static final String UNDERLINE = "\u001B[4m";
        public static final String GREEN_BG = "\u001B[42m";
        public static final String BLACK_TEXT = "\u001B[30m";
        public static void main(String[] args) 
         {
        Scanner sc = new Scanner(System.in);
        
        int choice=0;
        
        
        do
        {
            
            System.out.println( CYAN+"WELCOME TO THE PAYMENT SYSTEM"+RESET);
            System.out.println(BLUE+"1 FOR UPI PAYMENT SYSTEM"+RESET);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.getLogger(PaymentProcessSystem.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            System.out.println(YELLOW+"2 FOR CARD PAYMENT SYSTEM"+RESET);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.getLogger(PaymentProcessSystem.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            System.out.println(BOLD+"3 FOR BOTH PAYMENT SYSTEM"+RESET);
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.getLogger(PaymentProcessSystem.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            System.out.println("4 FOR EXT");
            try {
                Thread.sleep(500);
            } catch (InterruptedException ex) {
                System.getLogger(PaymentProcessSystem.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            boolean choiceFound=false;
            while(!choiceFound)
            {
                try
                {
                    System.out.println("ENTER UR CHOICE");
                    choice =sc.nextInt();
                    choiceFound=true;
                }
                catch(Exception ex)
                {
                    System.out.println(" U ENTERED INVALID INPUTS , KINDLY ENTER THE VALID INPUTS");
                    sc.nextLine();
                }
            }
            switch(choice)
            {
                
                case 1 :
                {
                     boolean AmountFound=false;
                     double amount =0.0d;
                     while(!AmountFound)
                     {
                        try
                        {
                           System.out.println("ENTER THE AMOUNT ");
                           amount = sc.nextDouble();
                           AmountFound=true;
                        }
                        catch(Exception ex)
                        {
                            System.out.println("ENTER THE AMOUNT ONLY");
                            sc.nextLine();
                        }
                     }
                    UPIPayment upi=new UPIPayment();
                    upi.getMoney(amount);
                    upi.start();
                try {
                    upi.join();
                } catch (InterruptedException ex) {
                    System.getLogger(PaymentProcessSystem.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                }
                
                
                   break;
                }
                
                case 2 :
                {
                     boolean AmountFoundCard=false;
                     double amount =0.0d;
                     while(!AmountFoundCard)
                     {
                        try
                        {
                           System.out.println("ENTER THE AMOUNT ");
                           amount = sc.nextDouble();
                           AmountFoundCard=true;
                        }
                        catch(Exception ex)
                        {
                            System.out.println("ENTER THE AMOUNT ONLY");
                            sc.nextLine();
                        }
                     }
                    CardPayment card =  new CardPayment();
                    card.getMoney(amount);
                    card.start();
                     try 
                     {
                        card.join();
                     } 
                     catch (InterruptedException ex)
                     {
                        System.getLogger(PaymentProcessSystem.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
                     }
                
                
                    break;
                }
                case 3 :
                {
                     boolean AmountFoundCard=false;
                     double amount =0.0d;
                     while(!AmountFoundCard)
                     {
                        try
                        {
                           System.out.println("ENTER THE AMOUNT ");
                           amount = sc.nextDouble();
                           AmountFoundCard=true;
                        }
                        catch(Exception ex)
                        {
                            System.out.println("ENTER THE AMOUNT ONLY");
                            sc.nextLine();
                        }
                     }
                     UPIPayment upi=new UPIPayment();
                     CardPayment card =  new CardPayment();
                     upi.getMoney(amount);
                     card.getMoney(amount);
                     upi.start();
                     card.start();
                     try
                     {
                     upi.join();
                     card.join();
                     }
                     catch(InterruptedException IX)
                     {
                         System.out.println("PAYMENT PROCESS WAS INTERRUPTED");
                     }
                     break;
                }
            
            }
            
        }while(choice!=4);
        
        System.out.print(RESET);
    }
    
}
