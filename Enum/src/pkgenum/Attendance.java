
package pkgenum;


public class Attendance 
{
    int rollNo;
    String name;
    Status status;

    public Attendance(int rollNo, String name, Status status) 
    {
        this.rollNo = rollNo;
        this.name = name;
        this.status = status;
    }
    
    void display()
    {
        System.out.println(rollNo);
        System.out.println(name);
        System.out.println(status);
    }
    
    
}
