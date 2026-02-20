
package bankinterestcalculator;


public class Canarabank extends Bank
{
    static final String bankName ="Canara BANK" ;
    static final float interestRate=7.0f ;
    public Canarabank(double principalAmount , float noOfyears) 
    {
        super(bankName ,interestRate, principalAmount,noOfyears);
    }
}
