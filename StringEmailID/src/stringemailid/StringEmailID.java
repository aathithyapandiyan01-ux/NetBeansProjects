
package stringemailid;

import java.util.Scanner;
public class StringEmailID {
    public static void main(String[] args)
    {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("ENTR THE EMAIL ID");
        String emailID = sc.nextLine();
        int Atcount = 0;
        int AtIndex =0;
        int fullStop = 0;
        int fullStopIndex=0;
        
        for(int i = 0; i<emailID.length();i++)
        {
            if('@'==emailID.charAt(i))
            {
                Atcount++;
                AtIndex=i;
                
            }
            if('.'==emailID.charAt(i))
            {
                fullStop++;
                fullStopIndex=i;
            }
            
        }
        
        
        if((Atcount==1) && (fullStop==1) && (AtIndex<fullStopIndex))
        {
            System.out.println("U ENTERED CORRECT EMAIL");
        }
        else
        {
            System.out.println("UR EMAIL ID IS WRONG ");
        
        }
        
        
        
        
    }
    
}
