
package medicalmanagementsystem;


public class PatientNode 
{
    private long patientID ;
    private String patientName ;
    private String patientDepartment ;
    private  float admissionDays ;
    PatientNode next;
    PatientNode previous;
    int totalPatientCount;
    
    public PatientNode(long patientID, String patientName, float admissionDays,String patientDepartment)
    {
        this.patientID=patientID;
        this.patientName=patientName;
        this.patientDepartment=patientDepartment;
        this.admissionDays=admissionDays;
        ++totalPatientCount;
        
    }
    
    String getPatientName()
    {
        return patientName;
    }
    String getPatientDepartment()
    {
        return patientDepartment;
    }
    long getPatientID()
    {
        return patientID;
    }
    float getPatientAdmissionDays()
    {
        return admissionDays;
    }
    
    int getTotalPatientCount()
    {
        return totalPatientCount;
    
    }
    
    
    
}
