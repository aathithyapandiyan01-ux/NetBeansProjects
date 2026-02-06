
package javacourse;


public class Student
{
    
    private long ID ;
    private String name ;

    public Student(long ID, String name )
    {
        this.ID = ID;
        this.name = name;
    }
    
    void setID(long ID)
    {
        this.ID = ID ;
    }
    
    long getID()
    {
    return ID ;
    }
    
    void setName(String name)
    {
        this.name = name;
    }
    
    String getName()
    {
    return name ;
    }
    
}
