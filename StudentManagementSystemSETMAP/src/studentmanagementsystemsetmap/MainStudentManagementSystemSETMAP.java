
package studentmanagementsystemsetmap;

import java.util.HashMap;
import java.util.HashSet;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;


public class MainStudentManagementSystemSETMAP {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        Map<String,StudentDetails> map = new HashMap();
        Set<StudentDetails> set = new HashSet();

        
        int choice ;
        do
        {
            
            System.out.println("WELCOME TO THE AP SCHOOLS");
            System.out.println("1 FOR ADD STUDENT DETAILS");
            System.out.println("2 FOR REMOVE STUDENT DETAILS");
            System.out.println("3 FOR SEACRH STUDENT DETAILS");
            System.out.println("4 FOR DISPLAY ALL STUDENT DETAILS");
            System.out.println("5 FOR DISPLAY  STUDENT COUNT");
            System.out.println("6 FOR EXIT");
            System.out.println("ENTER UR CHOICE");
            choice=sc.nextInt();
            
            
            switch(choice)
            {
                case 1 :
                {
                    String studentName = null;
                    String studentID= null;
                    boolean rightInput = false;
                    
                    while(!rightInput)
                    {
                        try
                        {
                            System.out.println("###ADD STUDENT DETAILS PORTAL###");
                            System.out.println("*****ENTER THE STUDENT NAME*****");
                            studentName=sc1.nextLine();
                            System.out.println("*****ENTER THE STUDENT ID*****");
                            studentID=sc1.nextLine();
                            rightInput = true ;
                            
                            if(map.containsKey(studentID))
                            {
                                System.out.println("STUDENT DETAILS ALREADY EXISTS");
                            }
                            else
                            {
                            StudentDetails sd = new StudentDetails(studentName, studentID);
                            set.add(sd);
                            map.put(studentID, sd);
                            System.out.println("*****STUDENT DETAILS SUCCESSFULLY ADDED*****");
                            }
                        }
                        
                        catch(InputMismatchException i)
                        {
                            System.out.println("*****ENTER ONLY VALID INPUTS*****");
                            sc.nextLine();
                        }
                    }
                    break;
                }
                
                case 2 :
                {
                    if(map.isEmpty())
                    {
                        System.out.println("STUDENT LISTS ARE EMPTY");
                    }
                    else
                    {
                        System.out.println("####U R IN THE REMOVE STUDENT PORTAL####");
                        System.out.println("*****ENTER THE STUDENT ID TO BE REMOVED*****");
                        String removeStudentID = sc1.nextLine();
                        if(map.containsKey(removeStudentID))
                        {

                            StudentDetails details = map.get(removeStudentID);
                            details.display();
                            System.out.println("*****1 TO CONFIRM DELETE THE STUDENT DETAILS*****");
                            System.out.println("*****2 TO CONFIRM CANCEL THE STUDENT DETAILS*****");
                            System.out.println("*****ENTER UR CHOICE*****");
                            int confirmation = sc.nextInt();
                            if(confirmation==1)
                            {
                                set.remove(details);
                                map.remove(removeStudentID);
                                System.out.println("STUDENT DETAILS REMOVED");

                            }
                            else if(confirmation==2)
                            {
                                System.out.println("*****U CANCELED THE DELETION*****");
                            }
                        }
                        else
                        {
                        System.out.println("STUDENT NOT FOUND ");
                    
                        }
                    }
                    
                    
                    
                    
                break;
                }
                case 3 :
                {
                    if(map.isEmpty())
                    {
                        System.out.println("STUDENT LISTS ARE EMPTY");
                    }
                    else
                    {
                        System.out.println("####U R IN THE SEARCH STUDENT PORTAL####");
                        System.out.println("*****ENTER THE STUDENT ID TO BE SEARCHED*****");
                        String seacrhStudentID = sc1.nextLine();
                        if(map.containsKey(seacrhStudentID))
                        {
                            StudentDetails details = map.get(seacrhStudentID);
                            details.display();
                        }
                        else
                        {
                            System.out.println("STUDENT NOT FOUND ");
                        }
                    }
                
                break;
                }
                
                case 4 :
                {
                    if(map.isEmpty())
                    {
                        System.out.println("STUDENT LISTS ARE EMPTY");
                    }
                    else
                    {
                        System.out.println("###DISPLAY STUDENT DETAILS PORTAL###");
                        for(Map.Entry<String , StudentDetails > m : map.entrySet())
                        {
                             m.getValue().display();
                        }
                    }
                break;
                }
                case 5 :
                {
                    System.out.println("DISPLAY STUDENT COUNT PORTAL");
                    System.out.println("STUDENTS COUNT   :"+map.size());
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
