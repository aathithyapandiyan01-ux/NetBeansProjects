
package employeemanagementmain;


public class Employee 
{
    String Name ;
    Double Salary;
    
  Employee(String Name , double Salary)
  {
      this.Name = Name;
      this.Salary=Salary;
  
  
  }
  
  void display()
  {
    System.out.println("Name :"+Name);
    System.out.println("Salary :" +Salary);
  }
}
