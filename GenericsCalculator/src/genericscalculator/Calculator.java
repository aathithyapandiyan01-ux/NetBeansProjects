
package genericscalculator;


public class Calculator <A,B>
{
    A number1 ;
    B number2 ;

   
    
    void ADDINTdisplay( A number1,B number2)
    {
        int result = (Integer)number1 + (Integer)number2;
        System.out.println( result );
    }
    void SUBINTdisplay(A number1,B number2)
    {
         int result = (Integer)number1 - (Integer)number2;
        System.out.println( result );
    
    }
    void ADDDoubledisplay(A number1,B number2)
    {
        double result = (Double)number1 + (Double)number2;
        System.out.println( result );
    
    }
    void SUBdoubledisplay(A number1,B number2)
    {
        double result = (Double)number1 - (Double)number2;
        System.out.println( result );
    
    }
}
