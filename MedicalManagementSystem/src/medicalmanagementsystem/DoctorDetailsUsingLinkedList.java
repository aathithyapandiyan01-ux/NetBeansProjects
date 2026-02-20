
package medicalmanagementsystem;


public class DoctorDetailsUsingLinkedList 
{
    DoctorNode head ;
    DoctorNode tail ;

    void insertDoctorDetailsForward(long doctorID, String doctorName, String specialization) 
    {
        
        DoctorNode d = new DoctorNode(doctorID, doctorName, specialization);
        
        if(head == null)
        {
            head = d;
            tail = d;
        }
        else
        {
            tail.next=d;
            d.previous=tail;
            tail=d;
        }
    }
    void insertDoctorDetailsBackward(long doctorID, String doctorName, String specialization) 
    {
        
        DoctorNode d = new DoctorNode(doctorID, doctorName, specialization);
        
        if(tail == null)
        {
            head = d;
            tail = d;
        }
        else
        {
            d.next=head;
            head.previous=d;
            head=d;
        }
    }
    void displayDoctorDetails()
    {
        
        if(head==null)
        {
            System.out.println("DOCTOR DETAILS ARE EMPTY");
        }
        
        else
        {
            
            DoctorNode temp = head ;
            
            while(temp!=null)
            {
                System.out.println("###DOCTOR DETAILS###" );
                System.out.println("DOCTOR NAME :"+""+temp.getDoctorName());
                System.out.println("DOCTOR ID :"+""+temp.getDoctorID());
                System.out.println("SPECIALIZATION :"+""+temp.getDoctorSpeacilization());
                temp=temp.next;
            }
        }
    
    }
    
    DoctorNode searchDoctor(String department)
    {
        DoctorNode temp = head ;
        
        if(temp==null)
        {
            System.out.println("DOCTOR DETAILS ARE EMPTY");
        }
        
        else
        {
            while(temp!=null)
            {
                
                if(temp.getDoctorSpeacilization().equalsIgnoreCase(department))
                {
                return temp ;
                }
            
            
            temp = temp.next;
            }
        }
        return null;
        
    }   

    
    
    
    
    
    
}
