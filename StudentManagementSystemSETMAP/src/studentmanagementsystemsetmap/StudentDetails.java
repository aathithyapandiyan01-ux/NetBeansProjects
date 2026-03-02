
package studentmanagementsystemsetmap;


public class StudentDetails 
{
    
    private String studentName ;
    private String studentID ;

    public StudentDetails(String studentName, String studentID)
    {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentID() {
        return studentID;
    }

    public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }
    
    void display()
    {
        System.out.println("---------------------------");
        System.out.println("STUDENT NAME   :"+getStudentName());
        System.out.println("STUDENT ID   :"+getStudentID());
        System.out.println("---------------------------");
    }
    
    
}
