
package sportsacademy;
public class Person
{
    protected String Name ;
    protected int Age ;

    public Person(String Name ,int age)
    {
        this.Name=Name;
        this.Age=age;
    }
    
    void display()
    {
        System.out.println("Name of the person :"+""+Name);
        System.out.println("Age of the person"+""+Age);
    
    }
    
    
}
