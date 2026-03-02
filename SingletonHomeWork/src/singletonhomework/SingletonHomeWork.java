
package singletonhomework;


public class SingletonHomeWork {

    
    public static void main(String[] args) 
    {
        BasicSingleTon bst =  BasicSingleTon.getInstance();
        BasicSingleTon bst1 =  BasicSingleTon.getInstance();
        bst.print();
        bst1.print();
        System.out.println(bst==bst1);
        
    }
    
}
