
package prototypepatterns;


public class CollegeDetails implements Cloneable
{
    
    String Name ;
    String RollNo;
    String collegeName = "THE AMERICAN COLLEGE";

    public CollegeDetails(String Name, String RollNo) 
    {
        this.Name = Name;
        this.RollNo = RollNo;
    }
    
//    CollegeDetails cloneDetails()
//    {
//     return new CollegeDetails(Name, RollNo);
//    }
//    

    @Override
    public CollegeDetails clone() throws CloneNotSupportedException
    {
    
        return (CollegeDetails)super.clone();
    
    }
    
}
