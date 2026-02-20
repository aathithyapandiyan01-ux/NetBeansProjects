
package paymentprocesssystem;

public class UPIPayment extends Thread implements Payment
{
    double amount;
    
    public void getMoney(double amount)
    {
    this.amount=amount;
    
    }
    @Override
    public void payment()
    {
        System.out.println("UPI PAYMENT OF Rs."+amount+" WAS SUCCESFULLY DONE ");
    
    }
    @Override
    public void run()
    {
         payment();
    
    }

    
    
    
}
