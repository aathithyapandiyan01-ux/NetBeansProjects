
package subarraysumimportant;

import java.util.Scanner;


public class SubArrayPractice 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTER THE LENGTH OF AN ARRAY");
        int length = sc.nextInt();
        int array[] = new int [length];
        
        for(int i = 0; i<length;i++)
        {
            System.out.println("ENTER THE  "+i+"  ELEMENT :");
            array[i]=sc.nextInt();
        }
        
        
        
        System.out.println("CREATING SUB ARRAYS");
        for(int start = 0;start<length;start++)
        {
            for(int end = start ; end<length;end++)
            {
                
                for(int print = start ; print<=end;print++)
                {
                
                    System.out.print(array[print]+" ");
                }
                  System.out.println();
            
            }
        
        
        }
        
    }

}
