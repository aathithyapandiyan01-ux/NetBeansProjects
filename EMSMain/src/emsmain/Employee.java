
package emsmain;

import java.util.Scanner;
public class Employee extends Company
{
    Scanner sc = new Scanner(System.in);
    Scanner sc1 = new Scanner(System.in);
    
    private long employeeID[];
    private String employeeName[];
    private double salary[];
    int length ;
    int index;

    
    Employee()
    {    
        System.out.println("ENTER THE LENGTH ");
        length=sc.nextInt();
        employeeID=new long [length];
        employeeName = new String[length];
        salary = new double [length] ;
        
        for(int i =0 ; i<length;i++)
        {
            System.out.println((i+1)+" "+"EMPLOYEE NAME :");
            employeeName[index]=sc1.nextLine();
            System.out.println((i+1)+" "+"EMPLOYEE ID :");
            employeeID[index]=sc.nextLong();
            System.out.println((i+1)+" "+"EMPLOYEE SALARY :");
            salary[index]=sc.nextDouble();
            index++;
        }
               
    }
    public void  displayDetails()
    {
        
        for(int i =0 ;i<length;i++)
        {
         System.out.println("Employee Name :"+employeeName[i]);
         System.out.println("Employee ID :"+employeeID[i]);
         System.out.println("Employee Salary :"+salary[i]);
        }
    
    
    
    }
    
    public double calculateBonus()
    {
    return 0;
    }
    
    
    public void setEmployeeID(int index ,long employeeID)
    {
        
        this.employeeID[index]=employeeID; 
    }
    
    public long getEmployeeID(int index)
    {
        return employeeID[index];
    }
    public void setEmployeeNamee (int index,String employeeName)
    {
        this.employeeName[index] = employeeName;     
    }
    
    public String getEmployeeName(int index)
    {
        return employeeName[index];
    }
    public void setEmployeeSalary(int index,double salary)
    {
        this.salary[index]=salary;
    }
    
    public double getEmployeeSalary(int index)
    {
        return salary[index];
    }
    
    
    
    
            
    
}
