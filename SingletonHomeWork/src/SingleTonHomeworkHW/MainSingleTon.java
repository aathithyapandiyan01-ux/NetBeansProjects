
package SingleTonHomeworkHW;

import java.util.Scanner;


public class MainSingleTon 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner (System.in);
        System.out.println("ENTER THE NAME ");
        String name = sc.nextLine();
        
        
        UserSession us = UserSession.getInstance();
        us.setUserName(name);
        us.showUserName();
        UserSession us1 = UserSession.getInstance();
        us1.showUserName();
        
        
        
        
        
    }
    
}
