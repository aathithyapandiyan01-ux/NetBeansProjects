
package employeesystem;


public class PermanentEmployee extends Thread implements EmployeeInterface
{
    
    double salary ;
    void getSalary(double salary)
    {
        this.salary=salary;
    
    
    }
    @Override
    public void  calculateSalary()
    {
        System.out.println("PERMANENT EMPLOYEE SALARY WAS CREDITED");
    }
    
    
    @Override
    public void run()
    {
        calculateSalary();
    
    }
    
}
