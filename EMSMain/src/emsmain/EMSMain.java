
package emsmain;
import java.util.Scanner;

public class EMSMain {

    public static void main(String[] args) 
    {
        
        
        Scanner sc = new Scanner(System.in);
        
        
        int choice ;
        do
        {
            System.out.println(" 1 FOR ADD EMPLOYEE ");
            System.out.println(" 2 FOR DISPLAY EMPLOYEES ");
            System.out.println(" 3 FOR SEARCH EMPLOYEE BY NAME  LINEAR SEARCH");
            System.out.println(" 4 FOR SEARCH EMPLOYEE BY ID BINARY SEARCH");
            System.out.println(" 5 FOR SORT EMPLOYEE BY BUBBLE SORT ");
            System.out.println(" 6 FOR SORT EMPLOYEE BY MERGE SORT ");
            System.out.println(" 7 FOR CALCULATE TOTAL SALARY ");
            System.out.println(" 8 FOR EXIT ");
            System.out.println(" ENTER UR CHOICE  ");
            choice = sc.nextInt();
            
            switch(choice)
            {
                
                case 1 :
                {
                    Employee e = new Employee(); break;
                
                }
                case 2 :
                {
                    Employee e = new Employee(); break;
                    e.displayDetails();
                }
                case 3 :
                {
                    Employee e = new Employee(); break;
                    e.displayDetails();
                }
                
                
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            
            }
        
        
        
        
        
        
        
        
        
        }
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
