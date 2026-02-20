
package arraylistinteger;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainArrayListInteger {

    public static void main(String[] args) 
    {
        
        Scanner sc =new Scanner(System.in);
        ArrayList <IntegerClass> al = new ArrayList();

        int choice ;
        do
        {
            System.out.println("1 FOR ENTER VALUES");
            System.out.println("2 FOR EXIT ");
            System.out.println("ENTER UR CHOICE");
            choice =sc.nextInt();
            
            switch(choice)
            {
                case 1 :
                {
                    boolean rightInt = false;
                    while(!rightInt)
                    {
                        try
                        {
                            System.out.println("ENTER THE INTEGER");
                            int integer = sc.nextInt();
                            IntegerClass ic1 = new IntegerClass(integer);
                            al.add(ic1);
                            rightInt=true;
                        }
                        catch(InputMismatchException e)
                        {
                            System.out.println("INVALID INPUTS");    
                        }
                    }
                break ;
                }
                case 2:
                {
                    if(al!=null)
                    {
                        int sum = 0;
                        for(IntegerClass i : al)
                        {

                            sum +=i.getInteger();

                        }
                        System.out.println("SUM OF THE VALUES  :"+sum);
                        System.out.println("EXITING");
                    }
                    else
                    {
                        System.out.println("NO VALUES FOUND TO BE ADDED, EXITING");
                        
                    }
                }
            }
        }while(choice!=2);
        
        
        
        
        
        
        
        
        
    }
    
}
