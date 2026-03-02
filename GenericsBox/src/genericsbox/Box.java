
package genericsbox;


public class Box <A,B>
{
    A integer ;
    B string ;

    public Box(A integer, B string) 
    {
        this.integer = integer;
        this.string = string;
    }
    
    void display()
    {
        System.out.println("integer :"+integer);
        System.out.println("string :"+string);
    }
    
    
    
    
}
