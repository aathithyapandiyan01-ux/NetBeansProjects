
package gammatestpasswordquestion;

import java.util.Scanner;


public class MainGammaTestPasswordQuestion {

 
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        
        
        int choice ;
        do
        {
            System.out.println("PASSWORD SETTER PORTAL");
            System.out.println("1 TO ENTER THE PASSWORD");
            System.out.println("2 FOR EXIT");
            System.out.println("ENTER UR CHOICE");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1 :
                {
                    
                    
                    System.out.println("ENTER THE PASSWORD");
                    String passWord = sc1.nextLine();
                    
                    PasswordChecker pc = new PasswordChecker(passWord);
                    pc.checkPassWord();
                    
                    
                    
                
                
                break;
                }
                case 2 :
                {
                    System.out.println("EXITING ,THANK U");
                
                break;
                }
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            }
            
        }while(choice!=2);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
