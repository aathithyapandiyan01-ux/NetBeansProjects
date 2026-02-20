
package bankinterestcalculator;


public class SBIBank extends Bank
{
    static final String bankName ="SBI BANK" ;
    static final float interestRate=7.5f ;
    public SBIBank(double principalAmount , float noOfyears) 
    {
        super(bankName ,interestRate, principalAmount,noOfyears);
    }
}
