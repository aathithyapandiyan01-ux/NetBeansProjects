
package threadtest;


public class MainThreadTest extends Thread 
{

   
    public static void main(String[] args) throws InterruptedException 
    {
        
        String sentence = "TODAY OUR TOPIC IS THREAD";
        
        
        for(int i = 0;i<sentence.length();i++)
        {
            System.out.print(sentence.charAt(i));
            Thread.sleep(3000);
        
        }
               System.out.println(" ");
               System.out.println("SENTECE PRINTED SUCCESSFULLY");

        
    }    
        
}       
        
        
      
    

