
package eliteresalebikes;

import java.util.Scanner;
public class MainEliteResaleBikes {

   
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        System.out.println("ENTER THE NO OF BIKE");
        int size = sc.nextInt();
        ResaleBike rb[] = new ResaleBike [size];
        int index=0;
         
        int choice;
        do
        {
            System.out.println("WELCOME TO ELITE RESALE BIKES");
            System.out.println("1 FOR ADD A RESALE BIKE");
            System.out.println("2 FOR VIEW TOTAL NO OF BIKES REGISTERED ");
            System.out.println("3 FOR VIEW ALL BIKES ");
            System.out.println("4 FOR EXIT ");
            System.out.println("ENTER UR CHOICE");
            choice=sc.nextInt();
            
            
            switch(choice)
            {
                
                case 1 :
                {
                    if(index<size)
                    {
                    System.out.println("U R IN THE RESALE PORTAL");
                    System.out.println("ENTER THE BIKE NAME");
                    String bikeName = sc1.nextLine();
                    System.out.println("ENTER THE OWNER NAME");
                    String ownerName = sc1.nextLine();
                    System.out.println("ENTER THE BIKE PRICE");
                    double bikePrice = sc.nextDouble();
                    
                    StringBuilder BikeName = new StringBuilder(bikeName);
                    BikeName.append("Verified bike");
                    bikeName = BikeName.toString();
                    StringBuffer OwnerName = new StringBuffer(ownerName);
                    OwnerName.append("Verified Seller");
                    ownerName = OwnerName.toString();
                    rb[index] = new ResaleBike(bikeName,ownerName,bikePrice);
                    index++;
                    }
                    else
                    {
                        System.out.println("BIKE SIZES ARE FULL");
                    
                    }
                
                break;
                }
                case 2 :
                {
                    if(index==0)
                    {
                        System.out.println("Bike lists are empty");
                    }
                    else
                    {
                    System.out.println("Total no of bikes :"+"  "+ Bike.getBikeCount());
                    }
                break ;
                }
                
                case 3 :
                {
                    if(index==0)
                    {
                        System.out.println("Bike lists are empty");
                    }
                    else
                    {
                     for(int i =0;i<index;i++)
                     {
                         rb[i].viewBike();
                     }
                    }
                    break;
                
                }
            }
        }while(choice!=4);
        
        
    }
    
}
