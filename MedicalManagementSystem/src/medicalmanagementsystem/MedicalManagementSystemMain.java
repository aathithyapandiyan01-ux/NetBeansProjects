
package medicalmanagementsystem;

import java.util.Scanner;
public class MedicalManagementSystemMain {

  
    public static void main(String[] args)
    {
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        
        long patientID;
        long doctorID;
        String patientName;
        String doctortName;
        String patientDepartment;
        String doctorSpeacialization;
        float admissionDays;
        int choice ;
        PatientDetailsUsingLinkedList AllPatientDetails=new PatientDetailsUsingLinkedList(); 
        DoctorDetailsUsingLinkedList AllDoctorDetails = new DoctorDetailsUsingLinkedList();
        do
        {
            System.out.println("WELCOME TO MEENAKSHI MISSION HOSPITAL");
            System.out.println("1 FOR ENTER PATIENT DETAILS");
            System.out.println("2 FOR DISPLAY PATIENT DETAILS");
            System.out.println("3 FOR ENTER DOCTOR DETAILS");
            System.out.println("4 FOR DISPLAY DOCTOR DETAILS");
            System.out.println("5 FOR KNOW ABOUT TREATMENT TYPES AND DETAILS");
            System.out.println("6 FOR EXIT");
            System.out.println("ENTER UR CHOICE");
            choice =sc.nextInt();
            switch(choice)
            {
                case 1 :
                {
                    System.out.println("###PATIENT DETAILS###");
                    System.out.println("ENTER THE PATIENT ID");
                    patientID=sc.nextLong();
                    System.out.println("ENTER THE PATIENT NAME");
                    patientName=sc1.nextLine();
                    System.out.println("ENTER THE ADMISSION DAYS");
                    admissionDays=sc.nextFloat();
                    System.out.println("ENTER THE PATIENT DEPARTMENT");
                    patientDepartment=sc1.nextLine();

                    
                    AllPatientDetails.insertPatientDetailsForward(patientID,patientName,admissionDays,patientDepartment);
                    break;
                }
                
                case 2 :
                {
                AllPatientDetails.displayPatientDetails();
                break;
                }
                case 3 :
                {
                    System.out.println("###DOCTOR DETAILS###");
                    System.out.println("ENTER THE DOCTOR ID");
                    doctorID=sc.nextLong();
                    System.out.println("ENTER THE DOCTOR NAME");
                    doctortName=sc1.nextLine();
                    System.out.println("ENTER THE DOCTOR SPECIALIZATION");
                    doctorSpeacialization=sc1.nextLine();
                    
                    AllDoctorDetails.insertDoctorDetailsForward(doctorID, doctortName, doctorSpeacialization);
                    break;
                }
                
                case 4 :
                {
                    AllDoctorDetails.displayDoctorDetails();
                    break;
                }
                
                case 5 :
                {
                    System.out.println("WE PROVIDE TWO TYPES OF TREATMENT");
                    System.out.println("1.FOR GENERAL TREATMENT");
                    System.out.println("2.FOR SPECIAL TREATMENT");
                    System.out.println("ENTER THE TREATMENT U WANT ");
                    int option=sc.nextInt();
                    
                    switch(option)
                    {
                        case 1 :
                        {
                            System.out.println("U have selected general treatment");
                            GeneralTreatment gt = new GeneralTreatment(AllPatientDetails,AllDoctorDetails);
                            break;
                        }
                        
                        case 2 :
                        {
                            System.out.println("U have selected special treatment");
                            SpecialTreatment st = new SpecialTreatment(AllPatientDetails,AllDoctorDetails);
                            break;
                        }
                    
                    }
                
                
                break;
                }
                
                case 6 :
                {
                    System.out.println("EXITING , THANK YOU");
                    break;
                
                
                }
            
            }
        }while(choice!=6);
        
    }
    
}
