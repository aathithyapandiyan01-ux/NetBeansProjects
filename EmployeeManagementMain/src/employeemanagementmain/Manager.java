
package employeemanagementmain;


public class Manager extends Employee
{
    String Department ;
    
    Manager(String Name ,double Salary,String Department)
    {
        super(Name , Salary);
        this.Department=Department;
    
    
    }
    
    void display()
    {
        System.out.println("Name :"+Name);
        System.out.println("Salary :" +Salary);
        System.out.println("Department :"+Department);

    
    
    }
            
            
}
