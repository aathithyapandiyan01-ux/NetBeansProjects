
package filehandling;

import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class FileHandling 
{

   
    public static void main(String[] args) throws IOException 
    {
       // File Creation
        
       // File fi = new File("E:\\Attendance.txt");
     /* if(fi.createNewFile())
        {
            System.out.println("File Created");
        }
        else
        {
            System.out.println("File is Already exist");
        }*/
       
      // fi.delete();
        
    /*    FileWriter fw = new FileWriter(fi);
        
        fw.write("Sl.No        Name        Status \n");
        fw.write("1.           Anuj        Absent \n");
        fw.write("2.           Nithish     Absent \n");
        fw.write("3.           Shyam       Absent \n");
        
        
        fw.close();
        fw.write("4.           Mark       Absent \n");
    */

    /*    FileReader fr = new FileReader(fi);
        
        Scanner sc = new Scanner(fr);
        
        while(sc.hasNext())
        {
            String str = sc.nextLine();
            System.out.println(str);
        }
        
     */
    
     /*   Desktop des = Desktop.getDesktop();
         File fi = new File("E:\\AIB.mkv");
        
    des.open(fi);
    */
        
        
//        FileInputStream fis = new FileInputStream(fi);
//        
//        byte[] data = new byte[(int)fi.length()];
//        fis.read(data);
//        
//        File fi1 = new File("E:\\Anuj\\Attendance.txt");
//        FileOutputStream fos=new FileOutputStream(fi1);
//        fos.write(data);
//        fos.close();


        File fi = new File("E:\\Attendance.txt");
        BufferedReader  br = new BufferedReader((new FileReader(fi)));
         String s;

        while((s=br.readLine())!=null)
        {
            System.out.println(s);
        }

        br.close();

        
                
        
        
    }
    
}
