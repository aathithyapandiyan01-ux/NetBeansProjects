
package billpughsingleton;


public class BillPughCode 
{
    
    private BillPughCode()
    {
        System.out.println("Object Created ");
    }
   
    private static class InnerClass
    {
        private static BillPughCode object =new BillPughCode();
    }
    
    public static BillPughCode getObject()
    {
    
    return InnerClass.object;
    }
    
    
}    
    // Normal SingleTon Code 
    
//    private static BillPughCode object ;
//    private BillPughCode()
//        {
//        System.out.println("OBJECT CREATED");
//        }
//        public static BillPughCode getObject()
//        {
//        if(object==null)
//         {
//          object=new BillPughCode();
//         }
//       
//         return object;
// 
//        }  
//    
//    
//}   

