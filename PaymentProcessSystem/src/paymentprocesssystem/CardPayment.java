
package paymentprocesssystem;


public class CardPayment extends Thread implements Payment
{
    double amount;
    
    public void getMoney(double amount)
    {
    this.amount=amount;
    
    }
    @Override
    public void payment()
    {
        System.out.println("CARD PAYMENT OF Rs."+amount+" WAS SUCCESFULLY DONE ");
    
    }
    @Override
    public void run()
    {
         payment();
    
    }
    
    
    
}
