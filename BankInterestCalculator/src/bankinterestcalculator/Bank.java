
package bankinterestcalculator;


public class Bank 
{
    
    static double interest;
    double principalAmount;
    float noOfYears;
    String BankName ;
    float interestRate;

    public Bank(String BankName, float interestrate, double principalAMount , float noOfyears) 
    {
        
        this.BankName =BankName;
        this.interestRate =interestrate;
        this.principalAmount=principalAMount;
        this.noOfYears=noOfyears;
    }
    
    static void calculateInterest(double principalAmount,float interestRate,float noOfYears)
    {
      interest = (principalAmount*interestRate*noOfYears)/100;
    }
    
    void display()
    {
        System.out.println("Bank name :"+""+BankName);
        System.out.println("Bank interestRate :"+""+interestRate);
        System.out.println("Principal AMount:"+""+principalAmount);
        System.out.println("No of Years:"+""+noOfYears);
        System.out.println("Total Interest:"+""+interest);
    }
    
    static
    {
        System.out.println("WELCOME TO INTEREST CALCULATION");
    }
            
    
    
    
}
