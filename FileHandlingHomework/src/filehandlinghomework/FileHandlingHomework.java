
package filehandlinghomework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class FileHandlingHomework {

    
    public static void main(String[] args) throws Exception
    {
        
        
        File f = new File ("E:\\ NumbersSum.txt");
        if(f.createNewFile())
        {
            System.out.println("File Created");
        }
        else
        {
            System.out.println("File is Already exist");
        }
        
        FileWriter fw = new FileWriter(f);
        
        fw.write("10\n");
        fw.write("20\n");
        fw.write("223\n");
        fw.write("3279\n");
        
        fw.close();
        
        BufferedReader br = new BufferedReader((new FileReader(f)));
        
        String Line ;
        int sum =0;
        int numbers =0;
        
        while((Line = br.readLine())!=null)
        {
            numbers =Integer.parseInt(Line);
            sum+=numbers;
        }
        
        br.close();
        
        System.out.println("SUM OF THE NUMBERS IS   :"+sum);
        
        
        
    }
    
}
