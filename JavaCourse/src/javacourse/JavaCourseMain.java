
package javacourse;


public class JavaCourseMain {

  
    public static void main(String[] args)
    {
        
        Student s = new Student(0, "Ravi");
        long ID = s.getID();
        String name = s.getName();
        System.out.println("Name of the Student :"+""+name);
        System.out.println("ID of the Student :"+""+ID);
        JavaCourse j = new JavaCourse("Java");
        j.joinCourse();

        
        
        
        
    }
    
}
