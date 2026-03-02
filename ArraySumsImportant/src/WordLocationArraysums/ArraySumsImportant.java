
package WordLocationArraysums;

import java.util.Scanner;


public class ArraySumsImportant {

   
    public static void main(String[] args) 
    {
        Scanner sc =  new Scanner (System.in);
        Scanner sc1 =  new Scanner (System.in);
        int choice ;
        do
        {
            System.out.println("1 FOR ENTER THE SENTENCE");
            System.out.println("2 FOR EXIT");
            System.out.println("ENTER UR CHOICE");
            choice=sc.nextInt();
            
            switch(choice)
            {
                case 1 :
                {
                    System.out.println("ENTER THE SENTENCE");
                    String sentence = sc1.nextLine();
                    ArrayArranger ar = new ArrayArranger(sentence);
                    ar.arrayArranger();
                    break;
                }
            }
            
            
        }while(choice!=2);
        
        
        
        
        
        
        
    }
    
}
