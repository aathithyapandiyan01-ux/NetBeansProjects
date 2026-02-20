
package testthread;


public class Names extends Thread
{
    String name [];

    public Names(String[] name) 
    {
        this.name = name;
    }
    
    
    
    
    @Override
    public void run()
    {
        for(int i =0;i<name.length;i++)
        {
            System.out.println("NAME OF THE "+""+(i+0)+name[i]);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                System.getLogger(Names.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            System.out.println("NAMES ARE PRINTED SUCCESSFULLY");
        
        }
    
    
    
    }
    
}
