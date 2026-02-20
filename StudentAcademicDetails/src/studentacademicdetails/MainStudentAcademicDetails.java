
package studentacademicdetails;

import java.util.Scanner;

public class MainStudentAcademicDetails 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        System.out.println("ENTER THE NO OF STUDENTS");
        int students=sc.nextInt();
        Institution institution = new Institution("AP Institution");
        Institution.Student stud[] = new Institution.Student[students];
        int index=0;
        int choice =0;
        do
        {
            
            
            
            System.out.println("WELCOME TO AP INSTITUTION");
            System.out.println(" 1 FOR SET STUDENT ACADEMIC DETAILS");
            System.out.println(" 2 FOR DISPLAY ALL STUDENT ACADEMIC DETAILS");
            System.out.println(" 3 FOR DISPLAY SPECIFIC STUDENT ACADEMIC DETAILS");
            System.out.println(" 4 FOR EXIT");
            
            boolean choiceFound = false;
            while(!choiceFound)
            {
                try
                {
                    System.out.println(" ENTER UR CHOICE");
                    choice=sc.nextInt();
                    choiceFound=true;
                }
                catch(Exception e )
                {
                    System.out.println("ONLY ENTER THE OPTIONS ABOVE");
                    sc.nextLine();
                }
            }
            switch(choice)
            {
                
                case 1 :
                {
                    if(index>=students)
                    {
                        System.out.println("STUDENT LIST IS FULL"); return;
                    }
                    String studentName=null ;
                    String rollNo=null;
                    System.out.println("ENTER THE NO SUBJECTS ");
                    int subjects = sc.nextInt();
                    float marks[]=new float[subjects];
                    stud[index]=  institution.new Student();
                    boolean nameFound=false;
                    while(!nameFound)
                    {
                        try
                        {
                        System.out.println("ENTER THE STUDENT NAME ");
                        studentName =sc1.nextLine();
                        nameFound=true;
                        }
                        catch(Exception e)
                        {
                            System.out.println("ENTER INPUTS");
                            sc.nextLine();
                        }
                    }
                    boolean rollnoFound=false;
                    while(!rollnoFound)
                    {
                        try
                        {
                        System.out.println("ENTER THE STUDENT ROLL NO ");
                        rollNo =sc1.nextLine();
                        rollnoFound=true;
                        }
                        catch(Exception e)
                        {
                            System.out.println("ENTER INPUTS");
                            sc.nextLine();
                        }
                    }
                    boolean marksFound=false;
                    while(!marksFound)
                    {
                        try
                        {
                            for(int i =0 ; i<subjects;i++)
                            {
                            System.out.println("ENTER THE STUDENT MARKS FOR SUBJECT"+" "+(i+1)+":");
                            marks[i] =sc.nextFloat();
                            }
                            marksFound=true;
                        }
                        catch(Exception e)
                        {
                            System.out.println("ENTER VALID INPUTS");
                            sc.nextLine();
                        }
                    }
                    
                stud[index].setAcademicDetails(studentName,rollNo,marks);
                stud[index].totalMarks();
                stud[index].calculateAverage();
                stud[index].findGrade();
                index++;
                System.out.println("STUDENT DETAILS ADDED SUCCESSFULLY");
                break;
                }
                case 2 :
                {
                    for(int i = 0;i<index;i++)
                    {
                        stud[i].display();
                    }
                
                
                break;
                }
                case 3 :
                {
                    System.out.println("SPECIFIC STUDENT DETAILS PORTAL");
                    System.out.println("ENTER THE ROLL NO OF THE STUDENT");
                    String searchRollNo =sc1.nextLine();
                    
                    
                    for(int i = 0;i<index;i++)
                    {
                          if(stud[i]!=null&&stud[i].getRollno().equalsIgnoreCase(searchRollNo))
                         {
                             stud[i].display();
                             return;
                         }
                          
                    }
                    
                    System.out.println("STUDENT ID NOT FOUND , ENTER THE CORRECT ID");
                
                
                break;
                }
            }
        }while(choice!=4);
        
        
        
        
        
        
    }
    
}
