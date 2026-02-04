
package studentmanagementsystem;


public class CalculateResult extends GetStudentDetails
{
   
    
    int TotalMarks;
    double AverageMarks; 
    
    void calculateTotal()
    {
        for(int i = 0 ; i<subjects ; i++)
        {
            TotalMarks += marks[i];
        }
         
        
        
        
        
    
    }
    void calculateAverage()
    {
     AverageMarks = TotalMarks/subjects ;
    }
    void displayResult()
    {
        System.out.println("TotalMarks :"+TotalMarks);

        System.out.println("Average Marks"+AverageMarks);
        if(AverageMarks>=45)
        {
            System.out.println("PASS");
        }
        else
        {
            System.out.println("FAIL");       
        }
    
    }
    
}
