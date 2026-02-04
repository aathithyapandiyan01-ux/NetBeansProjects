
package bankmanagementsystemmain;


public class SavingsAccount extends Account
{
    
   double balance ;
   
   SavingsAccount(String Name,int AccountNumber,double balance )
   {
       
       super(Name , AccountNumber);
       this.balance=balance ;
       System.out.println("SAVINGS ACCOUNT CREATED SUCCESSFULLY");
               
   
   
   }
    
    void display()
    {
        System.out.println("HOLDER NAME"+Name);
        System.out.println("ACCOUNT NUMBER"+AccountNumber);
        System.out.println("BALANCE"+balance);

    
    
    }
    
    
    
    
    
    
    
}
