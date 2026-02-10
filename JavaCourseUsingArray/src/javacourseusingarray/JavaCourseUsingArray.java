
package javacourseusingarray;
import java.util.Scanner;

public class JavaCourseUsingArray {

  
    public static void main(String[] args, int column)
    {
        Scanner sc = new Scanner (System.in);
        Scanner sc1 = new Scanner (System.in);
        
        String Name[];
        long ID[];
        String courseName[];
        System.out.println("ENTER THE LENGTH VALUE FOR THE ARRAY");
        int length=sc.nextInt();
        Name = new String[length];
        ID = new long[length];
        courseName=new String [length];
        for(int i = 0 ; i<row;i++)
        {
            for(int j=0;j<column;j++)
            {
            System.out.println("Enter the"+""+(i,j)+"Name :");
            Name[i][j]=sc1.nextLine();
            System.out.println("Enter the"+""+(index+1)+"ID :");
            ID[i][j+1]=sc.nextLong();
            System.out.println("Enter the"+""+(index+1)+"courseName :");
            courseName[index]=sc1.nextLine();
            index++;
            }
        }
        
        
        Student s = new Student(ID,Name);
        long ID = s.getID();
        String name = s.getName();
        System.out.println("Name of the Student :"+""+name);
        System.out.println("ID of the Student :"+""+ID);
        JavaCourse j = new JavaCourse(courseName);
        j.joinCourse();

        
        
        
        
    }
    
}
