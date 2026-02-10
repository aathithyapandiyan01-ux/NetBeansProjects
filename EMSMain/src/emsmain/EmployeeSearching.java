
package emsmain;

import java.util.Scanner;
public class EmployeeSearching extends Employee
{
    Scanner sc = new Scanner (System.in);
    Scanner sc1 = new Scanner (System.in);
    String searchEmpName ;
    long searchEmpID ;
    
    void searchEmployee()
    { 
        int options;
        do
        {
            System.out.println("1 for linear search");
            System.out.println("2 for binary search");
            System.out.println("3 for exit search");
            System.out.println("enter ur choice");
            options = sc.nextInt();
            switch(options)
            {
                
                case 1 :
                {
                    
                     System.out.println("1 for search by name");
                     System.out.println("1 for search by name");
                     System.out.println("enter ur choice");
                     int choice =sc.nextInt();
                     switch(choice)
                     {
                         case 1 :
                         {
                            System.out.println("ENTER THE EMPLOYEE NAME TO SEARCH ");
                            searchEmpName=sc1.nextLine();
                            break;
                         }
        
                         case 2 :
                         {
                            System.out.println("ENTER THE EMPLOYEE NAME TO SEARCH ");
                            searchEmpID=sc.nextLong();
                             break;
                         }
                         
                         
                         for(int i = 0 ; i <length ;i++)
                         {
                            if(searchEmpName.equalsIgnoreCase(employeeName[i]) || searchEmpID== employeeID[i])
                            {
                                System.out.println("EMPLOYEE IS FOUND ");
                                System.out.println("1 TO VIEW THE DETAILS ");
                                System.out.println("2 TO EXIT ");
                                System.out.println("ENTER UR CHOICE ");
                                int option = sc1.nextInt();
                                switch(option)
                                {
                                    case 1 :
                                    {
                                        System.out.println("EMPLOYEE NAME :"+""+employeeName[i]);
                                        System.out.println("EMPLOYEE ID :"+""+employeeID[i]);
                                        System.out.println("EMPLOYEE SALARY:"+""+salary[i]);
                                        break;
                                    }
                                    case 2 :
                                    {
                                        System.out.println("EXITING FROM THE SEARCH ");
                                         break;
                                    }
                                    
                                }
                                
                            }
                            
                         }
                    
                    }
                
                
                  break;
                }
                
                case 2 :
                {
                    
                    
                    
                    System.out.println();
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                }
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
            }    
                
                
                
                
                
                
                
        }
        while(options!=3);
        

    }
    

}
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        