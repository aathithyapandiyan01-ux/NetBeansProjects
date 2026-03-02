
package mobileshopmanagement;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainMobileShopManagement {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        ArrayList<Mobile> al = new ArrayList<>();
        String mobileName ;
        int mobileID;
        double price ;
        
        
        int choice ;
        do
        {
            System.out.println("WELCOME TO AP MOBILES");
            System.out.println("1 FOR ADD MOBILES");
            System.out.println("2 FOR VIEW ALL MOBILES");
            System.out.println("3 FOR SEARCH MOBILE BY ID");
            System.out.println("4 FOR EXIT ");
            System.out.println("ENTER UR CHOICE");
            choice=sc.nextInt();
            switch(choice)
            {
                
                case 1 :
                {
                    boolean rightInput = false ;
                    while(!rightInput)
                    {
                        try
                        {
                            System.out.println("ADD MOBILES PORTAL");
                            System.out.println("ENTER THE MOBILE NAME");
                            mobileName=sc1.nextLine();
                            System.out.println("ENTER THE MOBILE ID");
                            mobileID=sc.nextInt();
                            System.out.println("ENTER THE MOBILE PRICE");
                            price=sc.nextDouble();
                            rightInput=true;
                            Mobile m = new Mobile(mobileID, mobileName, price);
                            System.out.println("MOBILE ADDED SUCCESSFULLY");
                            al.add(m);
                        }
                        catch(InputMismatchException i)
                        {
                            System.out.println("ENTER THE VALID INPUTS ");
                        }
                    }
                  break;
                }
                
                case 2 :
                {
                    if(al.isEmpty())
                    {
                        System.out.println("MOBILE LISTS ARE EMPTY");
                        break;
                    }
                    System.out.println("VIEW ALL MOBILES PORTAL");
                    
                    for(Mobile mo : al)
                    {
                        mo.display();
                    }
                break;                
                }
                case 3 :
                {
                    if(al.isEmpty())
                    {
                        System.out.println("MOBILE LISTS ARE EMPTY");
                        break;
                    }
                    System.out.println("SEARCH MOBILE PORTAL");
                    
                    System.out.println("ENTER THE MOBILE ID TO SEARCH");
                    int searchMobileID=sc.nextInt();
                    boolean mobileFound = false;
                    for(Mobile mo : al)
                    {
                        if(searchMobileID==mo.getMobileID())
                        {
                            System.out.println("####SEARCH MOBILE DETAILS####");
                            mo.display();
                            mobileFound=true;
                        }
                    }
                    if(!mobileFound)
                    {
                        System.out.println("MOBILE NOT FOUND");
                    }
                
                break;
                }
                
                case 4 :
                {
                    System.out.println("EXITING , THANK YOU");
                break;
                }
            
            }
        }while(choice!=4);

    }
    
}
