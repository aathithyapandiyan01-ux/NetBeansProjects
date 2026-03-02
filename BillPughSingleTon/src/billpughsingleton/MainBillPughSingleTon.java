
package billpughsingleton;


public class MainBillPughSingleTon {

    
    public static void main(String[] args) 
    {
        
        Thread t1;
        t1 = new Thread(() -> 
        {
            BillPughCode bpc = BillPughCode.getObject();
            System.out.println(bpc);
        });
        Thread t2 = new Thread(() -> 
        {
            BillPughCode bpc2 = BillPughCode.getObject();
            System.out.println(bpc2);
        });
        Thread t3 = new Thread(() ->
        {
            BillPughCode bpc3 = BillPughCode.getObject();
            System.out.println(bpc3);
        });
        Thread t4 = new Thread(() -> 
        {
            BillPughCode bpc4 = BillPughCode.getObject();
            System.out.println(bpc4);
        });
        
        
        
        
        
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        
        
        
        
        
        
        
    }
    
}
