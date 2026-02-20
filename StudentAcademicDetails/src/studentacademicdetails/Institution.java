
package studentacademicdetails;

import java.util.Arrays;
public class Institution 
{
    
    private String institutionName ;

    public Institution(String institutionName) 
    {
        this.institutionName=institutionName;
    }
    
    
    
    class Student
    {
        private String studentName;
        private String rollNo;
        private float [] marks ;
        private double totalMarks;
        private double average ;
        private char grade ;
        
         
        void setAcademicDetails(String studentName , String rollNo , float marks[])
        {
            this.studentName=studentName;
            this.rollNo=rollNo;
            this.marks=marks;
        }
        String getRollno()
        {
            return rollNo;
        
        }
        
        
        
        void totalMarks()
        {
            totalMarks = 0;
             if(marks != null)
             {
                 for(int i = 0 ;i<marks.length;i++)
                 {
                     totalMarks+=marks[i];
                 }
             }
             else
             {
                 System.out.println("MARK LISTS ARE EMPTY");
             }
        }
        
        void calculateAverage()
        {
            if(marks != null && marks.length > 0)
            {
            average = totalMarks/marks.length;
            }
        }
        
        void findGrade()
        {
            if(average>=90)
            {
                grade= 'O' ;
            }
            else if(average>=80)
            {
                grade= 'A' ;
            }
            else if(average>=60)
            {
                grade= 'B' ;
            }
            else if(average>=45)
            {
                grade= 'C' ;
            }
            else
            {
                grade = 'F' ;
            }
        
        }
        
        void studentSearch()
        {
        
        
        
        
        }
        
        void display()
        {
            System.out.println("--------------------------------------");
            System.out.println("STUDENT NAME :"+" "+studentName);
            System.out.println("STUDENT ROLL NO :"+" "+rollNo);
            
            System.out.println("---MARKS OF THE STUDENT SUBJECT WISE---");
            
            if(marks!=null)
            {
                 for(int i =0;i<marks.length;i++)
                 {
                     System.out.println("MARK IN SUBJECT "+(i+1)+": "+marks[i]);
                 }
            }
            
            System.out.println("-----------------------------");
            System.out.println("TOTAL MARKS : " + totalMarks);
            System.out.printf("AVERAGE     : %.2f%n", average);
            System.out.println("GRADE       : " + grade);
            System.out.println("=================================");
        }
    }
    
    
    
    
}
