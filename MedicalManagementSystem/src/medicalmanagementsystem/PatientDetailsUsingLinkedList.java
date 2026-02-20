
package medicalmanagementsystem;


public class PatientDetailsUsingLinkedList 
{

    PatientNode head ;
    PatientNode tail ;
    
    void insertPatientDetailsForward(long patientID,String patientName,float admissionDays,String patientDepartment)
    {
        PatientNode n = new PatientNode(patientID,patientName,admissionDays, patientDepartment);
        
        if(head==null)
        {
            head = n;
            tail = n;
        }
        
        else
        {
            tail.next= n;
            n.previous=tail;
            tail=n;
        }
        
    }
    
    void insertPatientDetailsBackward(long patientID,String patientName,float admissionDays,String patientDepartment)
    {
        PatientNode n = new PatientNode(patientID, patientName, admissionDays, patientDepartment);
        
        if(tail == null)
        {
            head = n;
            tail = n;
        }
        else
        {
            n.next=head ;
            head.previous=n;
            head = n ;
        }
    }
    
    
    void displayPatientDetails()
    {
        
        if(head==null)
        {
            System.out.println("PATIENT DETAILS ARE EMPTY");
        }
        
        else
        {
            
            PatientNode temp = head ;
            
            while(temp!=null)
            {
                System.out.println("###PATIENT DETAILS###");
                System.out.println("PATIENT NAME :"+""+temp.getPatientName());
                System.out.println("PATIENT ID :"+""+temp.getPatientID());
                System.out.println("ADMISSION DAYS :"+""+temp.getPatientAdmissionDays());
                System.out.println("PATIENT DEPARTMENT :"+""+temp.getPatientDepartment());
                
                temp=temp.next;
            }
        }
    
    }
    
    PatientNode searchPatient(long data)
    {
        PatientNode temp = head ;
        
        if(temp==null)
        {
            System.out.println("PATIENT DETAILS ARE EMPTY");
        }
        
        else
        {
            while(temp!=null)
            {
                
                if(temp.getPatientID()==data)
                {
                return temp ;
                }
            
            
            temp = temp.next;
            }
        }
        return null;
        
    }   
}       
        
    
    
    

