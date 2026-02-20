
package atmdriven;


public class AccountDetailsPOJO 
{
    
    private String accountHolderName ;
    private long accountNumber ;
    private long accountPassword;
    private double initialBalance;

    public AccountDetailsPOJO(String accountHolderName, long accountNumber, long accountPassword, double initialBalance) 
    {
        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.accountPassword = accountPassword;
        this.initialBalance = initialBalance;
    }


    public String getAccountHolderName()
    {
        return accountHolderName;
    }

    public void setAccountHolderName(String accountHolderName) 
    {
        this.accountHolderName = accountHolderName;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAcountNumber(long accountNumber)
    {
        this.accountNumber = accountNumber;
    }

    public long getAccountPassword() 
    {
        return accountPassword;
    }

    public void setAccountPassword(long accountPassword) 
    {
        this.accountPassword = accountPassword;
    }

    public double getInitialBalance() 
    {
        return initialBalance;
    }

    public void setInitialBalance(double initialBalance) 
    {
        this.initialBalance = initialBalance;
    }
    
    void displayAccountDetails()
    {
        
        System.out.println("Account Holder name :"+" "+getAccountHolderName());
        System.out.println("Account Number :"+" "+getAccountNumber());
        System.out.println("Balance :"+" "+getInitialBalance());

    
    }
    
    
    
    
            
    
}
