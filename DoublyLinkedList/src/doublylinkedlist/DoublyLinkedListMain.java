
package doublylinkedlist;


public class DoublyLinkedListMain {

 
    public static void main(String[] args) 
    {
        
        Display i = new Display();
        i.addForward(10);
        i.addForward(15);
        i.addForward(20);
        i.addForward(25);
        i.addForward(30);
        i.addBackward(1);
        i.addBackward(2);
        i.addBackward(3);
        i.addBackward(4);
        i.addBackward(5);
        i.display();
        System.out.println("");
        System.out.println("Reverse order");
        i.display1();
        
        
        
        
        
        
        
        
        
        
    }
    
}
