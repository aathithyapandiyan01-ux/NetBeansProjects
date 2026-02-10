
package singlylist;


public class SinglyListMain {

    
     public static void main(String[] args)
    {
        
        Deletion i = new Deletion();
        i.insertion(10);
        i.insertion(20);
        i.insertion(30);
        i.insertion(40);
        i.insertion(50);
        i.insertion(60);
        i.insertion(70);
        i.insertion(80);
        i.display();
        
        System.out.println();
        System.out.println("Deletion Process :");
        
        i.deletion(70);
        i.deletion(60);
        i.deletion(80);
        i.display();
        
    }
    
}
