
package encapsulation;


public class Person 
{
    
    private String name ="Geeks";
    private int age=10;
    
    Person()
    {
        
    }
    
    
    void setName(String name)
    {
        this.name=name;
    }
    String getName()
    {
    return name ;  
    }
    void setAge(int age)
    {
    this.age=age;
    }
    int getAge()
    {
    
     return age ;
    }
    
}
