
package MountainArrayQuestion;

import java.util.Scanner;


public class MountainArray 
{
    
    
    public static void main(String[] args) 
    {
        
        
        Scanner sc = new Scanner(System.in);
        int choice ;
        
        do
        {
            System.out.println("1 FOR ENTER THE ARRAY ");
            System.out.println("2 FOR EXIT  ");
            System.out.println("ENTER UR CHOIICE");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1 :
                {
                    System.out.println(" ARRAY INPUTS PORTAL ");
                    
                    System.out.println("ENTER THE LENGTH OF AN ARRAY");
                    int length = sc.nextInt();
                    int array[]=new int[length];
                    
                        for(int i =0 ; i<length;i++)
                        {
                            System.out.println("ENTER THE "+(i+1)+" ELEMENT  ");
                            array[i]=sc.nextInt();
                        }
                    
                    ArrayChecker ac = new ArrayChecker(array);
                    ac.mountainArrayChecker();
                    
                
                break ;
                }
            
           
            
            }
            
        }while(choice!=2);
        
        
        
        
        
        
        
        
        
    }

}
