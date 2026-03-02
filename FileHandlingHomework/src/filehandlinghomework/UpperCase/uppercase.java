
package filehandlinghomework.UpperCase;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;


public class uppercase 
{
    
    public static void main(String[] args) throws Exception
    {
        File f = new File("E:\\Names.txt");
        if(f.createNewFile())
        {
            System.out.println("FILE CREATED SUCCESSFULLY");
        }
        else
        {
            System.out.println("FILE NOT CREATED");
        }
        
        FileWriter fw = new FileWriter(f);
        fw.write("aathithya       pandiyan\n");
        fw.write("amma           padma\n");
        fw.write("appa           kennedy\n");
        fw.write("akka           angalaparameswari\n");
        fw.close();
        
        BufferedReader br = new BufferedReader(new FileReader(f));
        
        File f2 = new File("E:\\UppercaseNames.txt");
        if(f2.createNewFile())
        {
            System.out.println("FILE CREATED SUCCESSFULLY");
        }
        else
        {
            System.out.println("FILE NOT CREATED");
        }
        FileWriter fw2 = new FileWriter(f2);
       
        String name ;
        
        while ((name= br.readLine())!=null)
        {
            name = name.replaceAll("\\s+", " ");
            fw2.write(name.toUpperCase());
            fw2.write("\n");
        }
        
        br.close();
        fw2.close();
        System.out.println("CONVERTED SUCCESFULLY");
        
        BufferedReader br2 = new BufferedReader(new FileReader(f2));
        
        String names ;
        while((names=br2.readLine())!=null)
        {
            System.out.println(names);
        }
        
        BufferedReader br3 = new BufferedReader(new FileReader(f2));
        
        String longest ="";
        String line ;
        
        while((line =br3.readLine())!=null)
        {
            String splitLine[] = line.split(" ");
            
            for(String s : splitLine)
            {
                if(s.length() > longest.length())
                {
                    longest = s;
                }
            }
        }
        
        System.out.println("LONGEST WORD  :"+longest);
        br2.close();
        
    }
    
}
