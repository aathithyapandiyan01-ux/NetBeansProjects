
package laptop;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;


public class MainLaptop {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        String laptopModel ;
        String laptopColor ;
        boolean RGBkeyboard ;
        double price ;
        
        ArrayList<Acer>al = new ArrayList();
        
        
        int choice ;
        do
        {
            System.out.println("WELCOME TO ACER CORP ");
            System.out.println("1 FOR ENTER LAPTOP MODEL ");
            System.out.println("2 FOR SEARCH LAPTOP MODEL ");
            System.out.println("3 FOR VIEW ALL LAPTOP MODEL ");
            System.out.println("4 FOR EXIT ");
            System.out.println("ENTER UR CHOICE");
            choice = sc.nextInt();
            
            switch(choice)
            {
                case 1 :
                {
                    
                    boolean rightInput = false ;
                    while(!rightInput)
                    {
                        
                        try
                        {
                            System.out.println("SET LAPTOP MODEL PORTAL");
                            System.out.println("ENTER THE MODEL NAME ");
                            laptopModel=sc1.nextLine();
                            System.out.println("DID THE MODEL HAS RPG KEYBOARD ");
                            RGBkeyboard=sc1.nextBoolean();
                            sc1.nextLine();
                            System.out.println("ENTER THE MODEL COLOR ");
                            laptopColor=sc1.nextLine();
                            System.out.println("ENTER THE MODEL PRICE ");
                            price=sc.nextDouble();
                            
                            rightInput=true;
                            Acer ac = new Acer(laptopModel, laptopColor, RGBkeyboard, price);
                            al.add(ac);
                        
                        }
                        catch(InputMismatchException e)
                        {
                            System.out.println("ENTER ONLY THE VALID INPUTS");
                            sc.nextLine();
                        }
                    }
                break;
                }
                
                case 2 :
                {
                    System.out.println("LAPTOP MODEL SEARCH PORTAL");
                    
                    System.out.println("ENTER THE NAME OF THE MODEL TO BE SEARCHED");
                    String searchLapModel =sc1.nextLine();
                    boolean modelFound = false ;
                    
                    for(Acer a : al)
                    {
                        
                        if(searchLapModel.equalsIgnoreCase(a.getModel()))
                        {
                            System.out.println("THE MODEL IS FOUND");
                            System.out.println("####DETAILS####");
                            System.out.println("MODEL NAME ; "+a.getModel());
                            System.out.println("PRICE :  Rs."+a.getPrice());
                            System.out.println("COLOR  :"+a.getColor());
                            if(a.getRGBkeyboard()==true)
                            {
                            System.out.println("RPG KEYBOARD 'AVAILABLE' ");
                            }
                            else
                            {
                            System.out.println("RPG KEYBOARD 'NOT AVALAIBLE' ");
                            }
                            modelFound=true;
                            System.out.println("-------------------------------");
                        
                        }
                    }
                    
                    if(!modelFound)
                    {
                        System.out.println("THE MODEL IS NOT FOUND");
                    }
                break;
                }
                
                case 3 :
                {
                    System.out.println("VIEW ALL MODEL PORTAL");
                    for(Acer a : al)
                    {
                        a.display();
                    }
                
                break ;
                }
                case 4 :
                {
                    System.out.println("EXITING , THANK YOU");
                
                break ;
                }
                
        
            }
        }while(choice!=4);
        
        
        
        
        
        
        
        
        
    }
    
}
