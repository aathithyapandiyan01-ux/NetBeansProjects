
package atmdriven;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DepositNWithDraw 
{
    Scanner sc = new Scanner(System.in);
    CreateAccount ca[];

    public DepositNWithDraw(CreateAccount[] ca) 
    {
       this.ca=ca;
    }
    
    void deposit()throws NullPointerException,InputMismatchException
    {
        long accountNumber=0;
        long accountPassword=0;
        boolean valid = false ;
        boolean found = false;

        
        while(!valid)
        {
           try
           {
               System.out.println("ENTER THE ACCOUNT NUMBER");
               accountNumber=sc.nextLong();
               System.out.println("ENTER THE PASSWORD");
               accountPassword=sc.nextLong();
               valid = true ;
           }
           catch(InputMismatchException  exception)
           {
               System.out.println("ENTER THE VALID INPUTS");
               sc.nextLine();
               throw exception ;
               
           }
           
        }
        
          for(int i = 0 ; i<ca.length;i++)
          {
            if(accountNumber==ca[i].getAccountNumber()&&accountPassword==ca[i].getAccountPassword())
            {
                double depositAmount=0.0d;
                boolean validDeposit=false;
                while(!validDeposit)
                {
                    try
                    {
                       System.out.println("ENTER THE DEPOSIT AMOUNT");
                       depositAmount =sc.nextDouble();
                       validDeposit=true;
                    }
                    catch(InputMismatchException ex)
                    {
                       System.out.println("ENTER CORRECT INPUTS");
                       sc.nextLine();
                    }
                }
                    double initialBalance= ca[i].getInitialBalance();
                    initialBalance+=depositAmount;
                    ca[i].setInitialBalance(initialBalance);
                    System.out.println("AMOUNT DEPOSITED SUCCESSFULLLY");
                    found = true ;
                    return;
            }
          }
        if(!found) 
        {
        throw new NullPointerException ("INVALID ACCOUNT NUMBER OR ACCOUNT PASSWORD");
        }
    }
    
    void withdrawAmount()
    {
        long accountNumber=0;
        long accountPassword=0;
        boolean withdrawFound=false;
        while(!withdrawFound)
        {
            try
            {
                System.out.println("ENTER THE ACCOUNT NUMBER");
                accountNumber=sc.nextLong();
                System.out.println("ENTER THE PASSWORD");
                accountPassword=sc.nextLong();
                withdrawFound=true;
            }
            catch(InputMismatchException ix)
            {
                System.out.println("ENTER CORRECT INPUTS");  
                sc.nextLine();
            }
        }
        for (CreateAccount ca1 : ca) {
            if (accountNumber == ca1.getAccountNumber() && accountPassword == ca1.getAccountPassword()) {
                double withdrawalAmount=0.0d;
                boolean withdrawalFound=false;
                while(!withdrawalFound)
                {
                    try
                    {
                        System.out.println("ENTER THE WITHDRAWAL AMOUNT");
                        withdrawalAmount=sc.nextDouble();
                        withdrawalFound=true;
                    }
                    catch(InputMismatchException wi)
                    {
                        System.out.println("ENTER THE CORRECT INPUTS ");
                        sc.nextLine();
                    }
                    
                    
                }
                if (withdrawalAmount <= ca1.getInitialBalance()) {
                    double initialBalance = ca1.getInitialBalance();
                    initialBalance-=withdrawalAmount;
                    ca1.setInitialBalance(initialBalance);
                    System.out.println("WITHDRAW DONE SUCCESSFULLY");
                    return;
                } else {
                    System.out.println("INSUFFICIENT BALANCE");
                    return;
                }
            }
        }
        
     System.out.println("INVALID ACCOUNT NUMBER OR ACCOUNT PASSWORD");

    
    }
    void checkBalance ()
    {
        
        long accountNumber=0;
        long accountPassword=0;
        boolean CheckBalancevalid = false ;
        while(!CheckBalancevalid)
        {
            try
            {
                System.out.println("ENTER THE ACCOUNT NUMBER");
                accountNumber=sc.nextLong();
                System.out.println("ENTER THE PASSWORD");
                accountPassword=sc.nextLong();
                CheckBalancevalid=true;
            }
            catch(InputMismatchException cv)
            {
                System.out.println("ENTER THE INPUTS CORRECTLY");
                sc.nextLine();
            }
        }
        
        for (CreateAccount ca1 : ca) 
        {
            if (accountNumber == ca1.getAccountNumber() && accountPassword == ca1.getAccountPassword()) {
                System.out.println("BALANCE AMOUNT IS : "+" " + ca1.getInitialBalance());
                return;
            }
        }
      System.out.println("INVALID ACCOUNT NUMBER OR PASSWORD");
    
    }
}    
    
    
     
  
    

