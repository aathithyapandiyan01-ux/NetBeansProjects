
package medicalmanagementsystem;


public class DoctorNode 
{
    private long doctorID ;
    private String doctorName ;
    private String specialization ;
    DoctorNode next;
    DoctorNode previous;

    public DoctorNode(long doctorID, String doctorName, String specialization) 
    {
        this.doctorID = doctorID;
        this.doctorName = doctorName;
        this.specialization = specialization;
    }
    
    String getDoctorName()
    {
        return doctorName;
    }
     
    long getDoctorID()
    {
        return doctorID;
    }
      
    String getDoctorSpeacilization()
    {
        return specialization;
    }
    
}
