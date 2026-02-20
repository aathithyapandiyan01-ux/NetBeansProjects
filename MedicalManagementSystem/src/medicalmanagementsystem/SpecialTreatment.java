
package medicalmanagementsystem;

import java.util.Scanner;

public class SpecialTreatment implements MedicalService
{
    
    Scanner sc = new Scanner (System.in);
    Scanner sc1 = new Scanner (System.in);
    
    PatientDetailsUsingLinkedList AllPatientDetails ;
    DoctorDetailsUsingLinkedList AllDoctorDetails;
    float STadmissiondays;

    public SpecialTreatment(PatientDetailsUsingLinkedList AllPatientDetails,DoctorDetailsUsingLinkedList AllDoctorDetails) 
    {
        
        this.AllDoctorDetails= AllDoctorDetails;
        this.AllPatientDetails= AllPatientDetails;
        System.out.println("ENTER THE PATIENT ID");
        long specialTreatmentPatientID=sc.nextLong();
        System.out.println("ENTER THE PATIENT NAME");
        String specialTreatmentPatientName=sc1.nextLine();
        
        
        PatientNode searchPatient = AllPatientDetails.searchPatient(specialTreatmentPatientID);
        if(searchPatient==null)
        {
            System.out.println("PATIENT IS NOT FOUND , KINDLY ENTER THE DETAILS CORRECTLY");
        }
        else
        {
            STadmissiondays =searchPatient.getPatientAdmissionDays();
            String STpatientDepartmnet = searchPatient.getPatientDepartment();
            long STpatientID=searchPatient.getPatientID();
            String STPatientName =searchPatient.getPatientName();
            DoctorNode searchDoctor = AllDoctorDetails.searchDoctor(STpatientDepartmnet);
            if(searchDoctor==null)
            {
                System.out.println("NO DOCTOR AVAILABLE FOR THIS DEPARTMENT");
            }
            
            else
            {
            
                String STDoctorName =searchDoctor.getDoctorName();
                String STDoctorSpecialization =searchDoctor.getDoctorSpeacilization();
                long STDoctorID =searchDoctor.getDoctorID();
                double specialTreatmentBill= calculateBill();
            
                System.out.println("#####⚕️🏥SPECIAL TREATMENT BILL DEATILS⚕️🏥####");
                System.out.println("PATIENT NAME"+""+STPatientName);
                System.out.println("PATIENT ID"+""+STpatientID);
                System.out.println("PATIENT ADMISSION DAYS"+""+STadmissiondays);
                System.out.println("####🧑‍⚕️🩺💉ASSIGNED DOCTOR####");
                System.out.println("DOCTOR NAME "+""+STDoctorName);
                System.out.println("DOCTOR ID "+""+STDoctorID);
                System.out.println("DOCTOR SPECIALIZATION "+""+STDoctorSpecialization);
                System.out.println("TOTAL BILL AMOUNT IS "+""+"Rs."+specialTreatmentBill);
            
            }
            
        }
        
    }
    
    @Override
    public double calculateBill()
    {
        double bill = 1000*STadmissiondays;
    
    return bill ;
    }
    
    
    
}
