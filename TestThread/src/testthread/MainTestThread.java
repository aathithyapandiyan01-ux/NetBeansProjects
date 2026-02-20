
package testthread;

import java.util.Scanner;
public class MainTestThread 
{
    public static void main(String[] args) 
    {
        Scanner sc =new Scanner(System.in);
        Scanner sc1 =new Scanner(System.in);

        System.out.println("Enter the length");
        int length=sc.nextInt();
        int index=0;
        String name[]=new String[length];
        int choice=0;
        
        
        do
        {
            System.out.println("1 for entering Name");
            System.out.println("2 for displaying Names");
            System.out.println("3 for exit ");
            System.out.println("ENTER THE CHOICE");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1 :
                {
                    for(int i =0;i<name.length;i++)
                    {
                        System.out.println("ENTER THE NAME OF THE "+""+(i+0)+"PERSON");
                        name[index]=sc1.nextLine();
                        index++;
                    }
                    System.out.println("STUDENT LIST IS FULL");
                break;
                }
                case 2 :
                {
                    Names n = new Names(name);
                    n.start();
                
                break;
                }
            }
        
        }while(choice!=3);
        
        
        
    }
    
}
