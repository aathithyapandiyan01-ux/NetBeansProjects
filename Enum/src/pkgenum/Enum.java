
package pkgenum;

public class Enum 
{

    
    public static void main(String[] args) 
    {
        Attendance anuj = new Attendance(143, "Anuj", Status.ABSENT);
        anuj.display();
        
        Attendance janani = new Attendance(110, "Janani", Status.ONDUTY);
        janani.display();
        
        Attendance nithish = new Attendance(120, "Nithish", Status.PRESENT);
        nithish.display();
    }
    
}
