
package singletonhomework;


public class BasicSingleTon 
{
    
    private static  BasicSingleTon printerobject;
    
    private BasicSingleTon()
    {
        System.out.println("PRINTING DOCUMENTS");
    }
    
    public static BasicSingleTon getInstance()
    {
        if(printerobject==null)
        {
             printerobject=new BasicSingleTon();
        }
     return printerobject;
    }
    void print()
    {
        
        System.out.println("CREATING DOCUMENTS");
    
    }
    
}
