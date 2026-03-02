
package trafficsignal;

import java.util.Scanner;


public class mainTrafficSignal {

    
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        Scanner sc1 = new Scanner(System.in);
        
        int choice ;
        do
        {
            System.out.println("1 for show meaning");
            System.out.println("2 for check stop or go ");
            System.out.println("ENTER UR CHOICE");
            choice=sc.nextInt();
            switch(choice)
            {
                case 1 :
                {
                    
                    for(Signal s : Signal.values())
                    {
                        
                        if(s == Signal.RED)
                        {
                            System.out.println("RED MEANS TO STOP");
                        }
                        else if(s==Signal.YELLOW)
                        {
                            System.out.println("YELLOW MEANS GET READY");
                        }
                        else if(s==Signal.GREEN)
                        {
                            System.out.println("GREEN MEANS TO GO");
                        }
                    }
                    break;
                }
                
                case 2 :
                {
                    
                    System.out.println("ENTER THE COLOR ");
                    String color = sc1.nextLine();
                    
                    if(color.equalsIgnoreCase(Signal.RED.name()))
                    {
                        System.out.println("STOP");
                    }
                    else if(color.equalsIgnoreCase(Signal.YELLOW.name()))
                    {
                        System.out.println("WAIT");
                    }
                    else if(color.equalsIgnoreCase(Signal.GREEN.name()))
                    {
                        System.out.println("GO");
                    }
                    
                    
                
                break;
                }
            
            
            
            
            
            
            
            
            
            }
            
            
        }while(choice!=3);
        
        
        
        
        
        
        
        
    }
    
}
