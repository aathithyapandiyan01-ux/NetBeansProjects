
package builderStudentDetails;

import java.util.Scanner;


public class MainbuilderStudentDetails 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("ENTER THE ID ");
        String ID = sc.nextLine();
        System.out.println("ENTER THE Name ");
        String Name = sc.nextLine(); 
        System.out.println("ENTER THE EmailID ");
        String EmailID = sc.nextLine(); 
        System.out.println("ENTER THE Address ");
        String Address = sc.nextLine(); 
    
    
    
    
        StudentDetails sd = new StudentDetails.StudentDeatilsbuilder().addID(ID).addAddress(Address).addName(Name).addEmailID(EmailID).build();
        
        sd.display();
        
        
        
        
        
        
        
    }
    
        
}
