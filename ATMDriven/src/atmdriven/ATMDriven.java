
package atmdriven;

import java.util.InputMismatchException;
import java.util.Scanner;
public class ATMDriven {

    
    public static void main(String[] args) 
    {
        
        Scanner sc1 = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        boolean accountRight=false;
        int size =0;
        while(!accountRight)
        {
            try
            {
                System.out.println("ENTER THE NO OF ACCOUNTS");
                size = sc.nextInt();
                accountRight=true;
            }
            catch (InputMismatchException ix)
            {
                System.out.println("⚠️⚠️⚠️⚠️⚠️ENTER NUMBER ONLY ABOVE ZERO⚠️⚠️⚠️⚠️⚠️");
                sc.nextLine();
            }
        }
        int choice=0 ;
        CreateAccount ca[]=new CreateAccount[size];
        DepositNWithDraw dnw ;
        int index =0;
        do
        {
           
            System.out.println("WELCOME TO THE ATM");
            System.out.println("1 FOR CREATING ACCOUNT");
            System.out.println("2 FOR DEPOSIT");
            System.out.println("3 FOR WITHDRAW");
            System.out.println("4 FOR CHECK BALANCE");
            System.out.println("5 FOR DISPLAY ACCOUNT DETAILS");
            System.out.println("6 FOR EXIT");
              try
                {
                  System.out.println("ENTER UR CHOICE");
                  choice=sc.nextInt();
                }
                catch(InputMismatchException  exception)
                {
                 System.out.println("⚠️⚠️⚠️⚠️⚠️ENTER ONLY OPTIONS IN THE ABOVE⚠️⚠️⚠️⚠️⚠️");
                 sc.nextLine();
                 continue;
                }
            
            switch(choice)
            {
                case 1 :
                {
                     String accountHolderName ="";
                     long accountNumber=0;
                     long accountPassword=0;
                     double initialBalance=0.0d;
                     boolean valid = false;
                    if(index<size)
                    {
 
                    while(!valid)
                    {
                        System.out.println("U  R IN THE ACCOUNT CREATING PORTAL");
                        
                        try
                        {
                             System.out.println("ENTER THE ACCOUNT HOLDER NAME");
                             accountHolderName=sc1.nextLine();
                             System.out.println("ENTER THE ACCOUNT NUMBER");
                             accountNumber =sc.nextLong();
                             System.out.println("ENTER THE ACCOUNT PASSWORD");
                             accountPassword=sc.nextLong();
                             System.out.println("ENTER THE INITIAL BALANCE");
                             initialBalance = sc.nextDouble();
                             
                             valid = true;
                        }
                        catch(InputMismatchException ex)
                        {
                             System.out.println("####INVALID INPUTS####");
                             sc.nextLine();
                        }
                     }
                    
                        ca[index]=new CreateAccount(accountHolderName,accountNumber,accountPassword,initialBalance);
                        index++;
                    }
                    else
                    {
                        System.out.println("###ACCOUNT LISTS ARE FULL###");
                    }
                break;
                }
                
                case 2 :
                {
                  try
                  {
                     dnw = new DepositNWithDraw(ca);
                     dnw.deposit();
                  }
                  catch(InputMismatchException e)
                  {
                      System.out.println("Enter the correct inputs");
                      break;
                  }
                  catch(NullPointerException n)
                  {
                      System.out.println("INVALID ACCOUNT OR PASSWORD");
                      break;
                  }
                break;
                }
                
                case 3 :
                {
                  try
                  {
                  dnw = new DepositNWithDraw(ca);
                  dnw.withdrawAmount();
                  }
                  catch(InputMismatchException e)
                  {
                      System.out.println("Enter the correct inputs");
                      break;
                  }
                  catch(NullPointerException n)
                  {
                      System.out.println("INVALID ACCOUNT OR PASSWORD");
                      break;
                  }
                  break;
                }
                
                
                case 4 :
                {
                  try
                  {
                  dnw = new DepositNWithDraw(ca);
                  dnw.checkBalance();
                  }
                  catch(InputMismatchException e)
                  {
                      System.out.println("Enter the correct inputs");
                      break;
                  }
                  catch(NullPointerException n)
                  {
                      System.out.println("INVALID ACCOUNT OR PASSWORD");
                      break;
                  }
                  break;
                }
                
                case 5 :
                {
                    long accountNumber=0;
                    long accountPassword=0;
                    boolean displayFound=false;
                    
                    while(!displayFound)
                    { 
                        try
                        {
                          System.out.println("ENTER THE ACCOUNT NUMBER");
                          accountNumber=sc.nextLong();
                          System.out.println("ENTER THE PASSWORD");
                          accountPassword=sc.nextLong();
                          boolean found = true ;
                        }
                        catch(InputMismatchException i)
                        {
                            System.out.println("ENTER THE CORRECT INPUTS");
                            sc.nextLine();
                        }
                            
                    }        
                            
                        boolean found = true ;
        
                       for(int i = 0 ; i<ca.length;i++)
                       {
                            if(ca[i] != null &&  accountNumber==ca[i].getAccountNumber()&&accountPassword==ca[i].getAccountPassword())
                            {
                              ca[i].display();
                              found = false;
                              break;
                              
                            }
                       }
                       if(found)
                       {
                         System.out.println("INVALID ACCOUNT NUMBER OR PASSWORD"); 
                       }
                break;
                }
                default:
                {
                System.out.println("INVALID CHOICE! Enter 1-6 only.");
                }
            }
        }while(choice!=6);
    }
    
}
