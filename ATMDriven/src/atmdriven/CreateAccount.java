
package atmdriven;


public class CreateAccount extends AccountDetailsPOJO
{

    public CreateAccount(String accountHolderName,long accountNumber,long accountPassword,double initialBalance) 
    {
        super(accountHolderName,accountNumber,accountPassword,initialBalance);
    }
    
    
    void display()
    {
    
    displayAccountDetails();
    }
    
    
    
}
   
    
    
    

