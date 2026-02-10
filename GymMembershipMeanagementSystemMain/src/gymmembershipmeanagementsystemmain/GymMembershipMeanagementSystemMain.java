
package gymmembershipmeanagementsystemmain;
import java.util.Scanner;

public class GymMembershipMeanagementSystemMain {

  
    public static void main(String[] args) 
    {
        long ID = 0;
        String name="" ;
        int months=0 ;
        Scanner sc =new Scanner (System.in);
        Scanner sc1 =new Scanner (System.in);
        int choice;
        do
        {
            
            System.out.println("WELCOME TO AP GYM CENTRE");
            System.out.println("1 to enter ur personal details");
            System.out.println("2 to choose membership");
            System.out.println("3 to change in the membership");
            System.out.println("4 to exit");
            System.out.println("enter ur choice");
            choice = sc.nextInt();
            
            switch(choice)
            {
                
                case 1 :
                {
                    System.out.println("ENTER UR NAME");
                    name = sc1.nextLine();
                    System.out.println("ENTER UR ID");
                    ID=sc.nextLong();
                    System.out.println("ENTER no of months");
                    months = sc.nextInt();
                    
                    Member gm = new Member(  ID ,  name , months);
                    gm.display();
                    break;
                }
                
                case 2 :
                {
                    
                    System.out.println("1 for regular membership");
                    System.out.println("2 for personal trainer membership");
                    System.out.println("enter ur choice");
                    int option = sc.nextInt();
                    switch(option)
                    {
                        case 1 :
                        {
                            RegularMember rm = new RegularMember (ID , name ,months,"Regular");
                            rm.calculateFees();
                            rm.display();
                            break;
                        
                        
                        }
                        case 2 :
                        {
                            PersonalTrainingMember pm = new PersonalTrainingMember(ID,name,months,"Perosnal Training");
                            pm.calculateFees();
                            pm.display();
                            break;
                        
                        
                        }
                    
                    
                    }
                break;
                }
                
                case 3 :
                {
                    
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
