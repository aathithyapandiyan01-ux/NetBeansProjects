
package javacourseusingarray;


abstract class Course 
{
    
    protected String courseName;

    public Course(String courseName[]) 
    {
        this.courseName=courseName;
    }
    abstract void joinCourse();
    
    
}
