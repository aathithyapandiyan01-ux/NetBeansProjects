

package bankinterestcalculator;

import java.util.Scanner;
public class BankInterestCalculator {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        double principalAmount;
        float noOfYears;
        
        
        int choice ;
        
        do
        {
            System.out.println("1 for SBI Bank");
            System.out.println("2 for Canara Bank");
            System.out.println("3 for Indian Bank");
            System.out.println("4 for exit");
            System.out.println("enter ur choice");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1 :
                {
                    System.out.println("enter the principal amount");
                    principalAmount=sc.nextDouble();
                    System.out.println("enter the no of  years");
                    noOfYears=sc.nextFloat();
                    
                    SBIBank sbi = new SBIBank(principalAmount,noOfYears);
                    SBIBank.calculateInterest(sbi.principalAmount,sbi.interestRate,sbi.noOfYears);
                    sbi.display();
                     break;
                }
                
                case 2 :
                {
                    System.out.println("enter the principal amount");
                    principalAmount=sc.nextDouble();
                    System.out.println("enter the no of  years");
                    noOfYears=sc.nextFloat();
                    
                    Canarabank cb = new Canarabank(principalAmount,noOfYears);
                    SBIBank.calculateInterest(cb.principalAmount,cb.interestRate,cb.noOfYears);
                    cb.display();
                     break;
                }
            
                
            
                case 3 :
                {
                    System.out.println("enter the principal amount");
                    principalAmount=sc.nextDouble();
                    System.out.println("enter the no of  years");
                    noOfYears=sc.nextFloat();
                    
                    IOBBank iob = new IOBBank(principalAmount,noOfYears);
                    SBIBank.calculateInterest(iob.principalAmount,iob.interestRate,iob.noOfYears);
                    iob.display();
                     break;
                }
            
            }
        
        
        }while(choice!=4);
    }
    
}
