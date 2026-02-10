
package buildingconstructionmanagementsystem;

import java.lang.reflect.Member;
import java.util.Scanner;
public class BuildingConstructionManagementSystemMain {

   
    public static void main(String[] args) 
    {
        String ownerName;
        float area;
        double costPerSqFt;
        Building bg = null;
        Scanner sc =new Scanner(System.in);
        Scanner sc1 =new Scanner(System.in);
        int choice;
        do
        {
            System.out.println("WELCOME TO AP BUILDING CONSTRUCTION");
            System.out.println("1 TO ENTER OWNER DETAILS");
            System.out.println("2 TO KNOW ABOUT BUILDING TYPES");
            System.out.println("3 TO CHANGE IN THE DETAILS");
            System.out.println("4 FOR EXIT");
            System.out.println("ENTER UR CHOICE");
            choice = sc.nextInt();
            switch(choice)
            {
                
                case 1 :
                {
                    if(bg==null)
                    {
                    System.out.println("ENTER THE OWNER NAME");
                    ownerName=sc1.nextLine();
                    System.out.println("ENTER THE AREA OF THE BUILDING");
                    area=sc.nextFloat();
                    System.out.println("ENTER THE COST PER SQUARE FEET ");
                    costPerSqFt=sc.nextDouble();
                    
                    bg = new Building(ownerName, area, costPerSqFt);
                    System.out.println("u have successfully entered the owner deatails");
                    break;
                    }
                    else
                    {
                        System.out.println("U HAVE ALREADY ENTERED THE DETAILS");
                        break;
                    
                    }
                }
                
                case 2 :
                {
                    if(bg==null)
                    {
                        System.out.println("Please enter owner details first (Option 1)");
                        break;
                    }
                    System.out.println("WE BUILD TWO TYPES OF BUILDING 1 . RESIDENTIAL BUILDING AND 2 . COMMERCIAL BUILDING");
                    System.out.println("1 . TO KNOW ABOUT RESIDENTIAL BUILDING COST");
                    System.out.println("2 . TO KNOW ABOUT COMMERCIAL BUILDING COST");
                    int option = sc.nextInt();
                    switch(option)
                    {
                        case 1 :
                        {
                            System.out.println("U HAVE SELECTED THE RESIDENTIAL BUILDING");
                            ResidentialBuilding rb = new ResidentialBuilding(bg.getOwnerName(),bg.getArea(),bg.getCostPerSqFeet());
                            rb.calculateCost();
                            rb.display();
                            break;
                        }
                        case 2 :
                        {
                            System.out.println("U HAVE SELECTED THE COMMERCIAL BUILDING");
                            CommercialBuilding cb = new CommercialBuilding (bg.getOwnerName(),bg.getArea(),bg.getCostPerSqFeet());
                            cb.calculateCost();
                            cb.display();
                            break;
                        }
                    
                    }
                
                break;
                }
                
                case 3 :
                {
                    if(bg==null)
                    {
                        System.out.println("Please enter owner details first (Option 1)");
                        break;
                    }
                    System.out.println("CHOOSE THE DETAILS U WANTED TO CHANGE");
                    System.out.println("1. TO CHANGE OWNER NAME ");
                    System.out.println("2. TO CHANGE AREA DETAILS ");
                    System.out.println("ENTER UR CHOICE ");
                    int options = sc.nextInt();
                    switch(options)
                    {
                        case 1:
                        {
                            System.out.println("ENTER THE OWNER NAME :");
                            String Name = sc1.nextLine();
                            bg.setOwnerName(Name);
                            System.out.println("U HAVE CHANGED THE OWNER NAME");
                            break; 
                        
                        }
                        case 2:
                        {
                            System.out.println("ENTER THE AREA :");
                            float Area = sc.nextFloat();
                            bg.setArea(Area);
                            System.out.println("U HAVE CHANGED THE AREA");
                            break; 
                        }
                    }
                break;
                }
                case 4 :
                {
                    System.out.println("Exiting , Thank you");
                    break;
                
                }
           
            
            }
        
        
        
        
        
        
        }while(choice!=4);
        
        
        
        
        
        
        
        
        
    }
    
}
