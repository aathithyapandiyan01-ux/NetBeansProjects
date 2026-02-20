
package medicalmanagementsystem;
import java.util.Scanner;

public class GeneralTreatment  implements MedicalService
{
    Scanner sc = new Scanner (System.in);
    Scanner sc1 = new Scanner (System.in);
    
    PatientDetailsUsingLinkedList AllPatientDetails ;
    DoctorDetailsUsingLinkedList AllDoctorDetails;
    float GTadmissiondays;

    public GeneralTreatment(PatientDetailsUsingLinkedList AllPatientDetails,DoctorDetailsUsingLinkedList AllDoctorDetails) 
    {
        
        this.AllDoctorDetails= AllDoctorDetails;
        this.AllPatientDetails= AllPatientDetails;
        System.out.println("ENTER THE PATIENT ID");
        long generalTreatmentPatientID=sc.nextLong();
        System.out.println("ENTER THE PATIENT NAME");
        String generalTreatmentPatientName=sc1.nextLine();
        
        
        PatientNode searchPatient = AllPatientDetails.searchPatient(generalTreatmentPatientID);
        if(searchPatient==null)
        {
            System.out.println("PATIENT IS NOT FOUND , KINDLY ENTER THE DETAILS CORRECTLY");
        }
        else
        {
            GTadmissiondays =searchPatient.getPatientAdmissionDays();
            String GTpatientDepartmnet = searchPatient.getPatientDepartment();
            long GTpatientID=searchPatient.getPatientID();
            String GTPatientName =searchPatient.getPatientName();
            
            DoctorNode searchDoctor = AllDoctorDetails.searchDoctor(GTpatientDepartmnet);
            if(searchDoctor==null)
            {
                System.out.println("NO DOCTOR AVAILABLE FOR THIS DEPARTMENT");
            }
            else
            {
                String GTDoctorName =searchDoctor.getDoctorName();
                double generalTreatmentBill= calculateBill();
                long GTDoctorID=searchDoctor.getDoctorID();
                String GTDoctorSpecialization=searchDoctor.getDoctorSpeacilization();
                System.out.println("#####⚕️🏥GENERAL TREATMENT BILL DEATILS⚕️🏥####");
                System.out.println("PATIENT NAME"+""+GTPatientName);
                System.out.println("PATIENT ID"+""+GTpatientID);
                System.out.println("PATIENT ADMISSION DAYS"+""+GTadmissiondays);
                System.out.println("####🧑‍⚕️🩺💉ASSIGNED DOCTOR####");
                System.out.println("DOCTOR NAME "+""+GTDoctorName);
                System.out.println("DOCTOR ID "+""+GTDoctorID);
                System.out.println("DOCTOR SPECIALIZATION "+""+GTDoctorSpecialization);
                System.out.println("TOTAL BILL AMOUNT IS "+""+"Rs."+generalTreatmentBill);
            }
        }   
            
        
        
        
        
       
        
        
        
        
        
    }
    
    
    @Override
    public double calculateBill()
    {
        double bill = GTadmissiondays*1000;
    
    return bill ;
    }
    
    
    
}
