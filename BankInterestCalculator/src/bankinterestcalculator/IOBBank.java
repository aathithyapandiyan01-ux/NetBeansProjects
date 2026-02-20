
package bankinterestcalculator;


public class IOBBank extends Bank
{
    static final String bankName ="IOB BANK" ;
    static final float interestRate=8.5f ;
    public IOBBank (double principalAmount , float noOfyears) 
    {
        super(bankName ,interestRate, principalAmount,noOfyears);
    }
}
