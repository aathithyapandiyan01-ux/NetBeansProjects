
package sportsacademy;
import java.util.Scanner;
public class SportsAcademyMain {

  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        
        
        
        int choice ;
        do
        {
            System.out.println(" 1 for set player details ");
            System.out.println(" 2 for set coach details ");
            System.out.println(" 3 for exit ");
            System.out.println(" enter ur choice");
            choice = sc.nextInt();
            sc.nextLine();
            
            switch(choice)
            {
                
                case 1 :
                {
                    System.out.println("Enter the Player Name :");
                    String playerName = sc1.nextLine();
                    System.out.println("Enter the age of the player :");
                    int age = sc.nextInt();
                    System.out.println("Enter the sports of the player :");
                    String playerSports=sc1.nextLine();
                    Player p = new Player(playerName,age,playerSports);
                    p.followrules();
                    break;
                
                
                }
                
                case 2 :
                {
                    System.out.println("Enter the Coach Name :");
                    String coachName = sc1.nextLine();
                    System.out.println("Enter the age of the coach :");
                    int age = sc.nextInt();
                    System.out.println("Enter the specialization of the coach :");
                    String coachSpecialization=sc1.nextLine();
                    Coach c = new Coach(coachName,age,coachSpecialization);
                    c.followrules();
                    break;
                
                
                }
                
                case 3 :
                {
                    System.out.println("Thank You , Exiting");break;
                
                }
            
   
            
            }
 
        
        }while(choice!=3);
        
    }
    
}
