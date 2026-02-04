
package studentmanagementsystem;

import java.util.Scanner;
public class GetStudentDetails 
{
    Scanner sc = new Scanner(System.in);
    
    String StudentID;
    String Name ;
    int subjects;
    int marks[];
   
    
    GetStudentDetails()
    {
    
    System.out.println("Enter the StudentID");
    StudentID =sc.nextLine();
    
    System.out.println("Enter the Name of the Student");
    Name = sc.nextLine();

    System.out.println("How many Subjects ?");
    subjects=sc.nextInt();
    marks=new int[subjects];

    
      
    }
    
    void marks()
    {
        for(int i = 0 ; i<subjects;i++)
       {
        System.out.println("Enter the Marks for "+(i+1)+"subject :");
        marks[i]=sc.nextInt();
       }
    
    }
    
    void displayMarks()
    {
        
        System.out.println("Student ID :"+StudentID);
        System.out.println("Student Name :"+Name);
        System.out.println("Total Subjects :"+subjects);
        
        
        
        for(int i = 0 ; i<subjects;i++)
        {
        System.out.println("Subject 1 marks :"+marks[i]);
        }
    
    
    }
}   
    
    

