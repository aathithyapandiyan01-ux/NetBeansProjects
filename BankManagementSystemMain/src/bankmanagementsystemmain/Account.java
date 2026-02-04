
package bankmanagementsystemmain;


public class Account 
{
    
    
    String Name ;
    int AccountNumber ;
    
    Account(String Name ,int AccountNumber )
    {
        this.Name=Name ;
        this.AccountNumber=  AccountNumber;  
        System.out.println("ACCOUNT CREATED SUCCESSFULLY");
   
    }
    
    void display()
    {
        
        System.out.println("HOLDER NAME"+Name  );
        System.out.println("ACCOUNT NUMBER"+AccountNumber);

    }
    
    
    
    
    
    
    
    
    
}
