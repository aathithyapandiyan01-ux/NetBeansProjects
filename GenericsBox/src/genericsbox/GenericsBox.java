
package genericsbox;


public class GenericsBox {

   
    public static void main(String[] args) 
    {
        
        Box <Box,Box> b = new Box("Aathi" , 23);
        b.display();
        
        Box <Box,Box> ba = new Box(23 , "Aathi"  );
        ba.display();
        
        
        
        
        
        
        
    }
    
}
